/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Brands;
import model.Categories;
import model.Customers;
import model.ProductDetail;
import model.Products;

/**
 *
 * @author HuongHoang
 */
public class ProductDAO extends DBContext {

    public ArrayList<Products> getProductsByCategory(String category_id,String brand_id) {
        ArrayList<Products> products = new ArrayList<>();
        try {
            String sql = "SELECT p.product_id,p.category_id,p.product_name,p.product_price,p.product_image,c.category_id,c.category_name,b.brand_id,b.brand_name FROM Products p "
                    + "INNER JOIN Categories c ON p.category_id = c.category_id"
                    + " INNER JOIN Brands b ON b.brand_id=p.brand_id where 1=1";
            if (!category_id.equals("")) {
                sql += " and p.category_id in ("+category_id+")";
            }
            if (!brand_id.equals("")) {
                sql += " and p.brand_id in ("+brand_id+")";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {

                Products p = new Products();
                p.setProduct_id(rs.getInt("product_id"));
                p.setProduct_name(rs.getString("product_name"));
                p.setCategory_id(rs.getInt("category_id"));
                p.setProduct_price(rs.getFloat("product_price"));
                p.setProduct_image(rs.getString("product_image"));

                Categories c = new Categories();
                c.setCategory_id(rs.getInt("category_id"));
                c.setCategory_name(rs.getString("category_name"));

                Brands b = new Brands();
                b.setBrand_id(rs.getInt("brand_id"));
                b.setBrand_name(rs.getString("brand_name"));
                
                p.setBrand(b);
                p.setCategory(c);
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public Products getProductDetail(String product_id) {
        Products p = new Products();
        try {
            String sql = "SELECT p.product_id,p.category_id,p.product_name,p.product_price,p.product_image,pd.product_id,pd.detail,pd.guarantee FROM Products p INNER JOIN ProductDetail pd ON p.product_id = pd.product_id where p.product_id = '" + product_id + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                p.setProduct_id(rs.getInt("product_id"));
                p.setProduct_name(rs.getString("product_name"));
                p.setCategory_id(rs.getInt("category_id"));
                p.setProduct_price(rs.getFloat("product_price"));
                p.setProduct_image(rs.getString("product_image"));

                ProductDetail pd = new ProductDetail();
                pd.setProduct_id(rs.getInt("product_id"));
                pd.setDetail(rs.getString("detail"));
                pd.setGuarantee(rs.getString("guarantee"));
                p.setProductdetail(pd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    public ArrayList<Products> getProductsByProductID() {
        ArrayList<Products> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Products p INNER JOIN Categories c ON p.category_id = c.category_id INNER JOIN Brands b ON p.brand_id = b.brand_id";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {

                Products p = new Products();
                p.setProduct_id(rs.getInt("product_id"));
                p.setProduct_name(rs.getString("product_name"));
                p.setCategory_id(rs.getInt("category_id"));
                p.setProduct_price(rs.getFloat("product_price"));
                p.setProduct_image(rs.getString("product_image"));
                p.setProduct_quantity(rs.getInt("product_quantity"));
                p.setImport_price(rs.getFloat("import_price"));

                Categories c = new Categories();
                c.setCategory_id(rs.getInt("category_id"));
                c.setCategory_name(rs.getString("category_name"));

                Brands b = new Brands();
                b.setBrand_id(rs.getInt("brand_id"));
                b.setBrand_name(rs.getString("brand_name"));
                p.setCategory(c);
                p.setBrand(b);
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public void ChangeInfor(Products pro) {
        String sql = "UPDATE Products SET product_name=N'" + pro.getProduct_name() + "',product_price=" + pro.getProduct_price() + ",product_image='" + pro.getProduct_image() + "',brand_id=" + pro.getBrand_id() + ",category_id=" + pro.getCategory_id() + ",product_quantity="+pro.getProduct_quantity() +",import_price="+pro.getImport_price() +" WHERE product_id = " + pro.getProduct_id();
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ChangeDetail(ProductDetail pro) {
        String sql = "UPDATE ProductDetail SET detail=N'" + pro.getDetail()+ "',guarantee=N'" + pro.getGuarantee() + "' WHERE product_id = '" + pro.getProduct_id() + "'";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  void DeleteProduct(int product_id) {
        String sql = "Delete from Products where product_id = "+product_id;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DeleteProductDetail(int product_id) {
        String sql = "Delete from ProductDetail where product_id = "+product_id;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addProduct(Products products){
        String sql ="Insert into Products(product_name,brand_id,category_id,product_price,product_quantity,product_image,import_price) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, products.getProduct_name());
            statement.setInt(2, products.getBrand_id());
            statement.setInt(3, products.getCategory_id());
            statement.setFloat(4, products.getProduct_price());
            statement.setInt(5, products.getProduct_quantity());
            statement.setString(6, products.getProduct_image());
            statement.setFloat(7, products.getImport_price());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addProductDetail(ProductDetail products){
        String sql ="Insert into ProductDetail(detail,guarantee) values (?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, products.getDetail());
            statement.setString(2, products.getGuarantee());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean searchProductByName(String product_name) {
        ArrayList<Brands> br = new ArrayList<>();
        try {
            String sql ="SELECT * from Products where product_name ='"+product_name+"'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Products> getProductsByProductID(int product_id) {
        ArrayList<Products> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Products WHERE product_id= "+product_id;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {

                Products p = new Products();
                p.setProduct_id(rs.getInt("product_id"));
                p.setProduct_name(rs.getString("product_name"));
                p.setCategory_id(rs.getInt("category_id"));
                p.setProduct_price(rs.getFloat("product_price"));
                p.setProduct_image(rs.getString("product_image"));
                p.setProduct_quantity(rs.getInt("product_quantity"));
                p.setImport_price(rs.getFloat("import_price"));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
    public void ChangeQuantity(int product_quantity,int product_id) {
        String sql = "UPDATE Products SET product_quantity='" + product_quantity+ "' WHERE product_id = '" + product_id+"'";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Products> getListByPage(ArrayList<Products>  arr,int start,int end){
        ArrayList<Products> list= new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(arr.get(i));
        }
        return list;
    }
}
