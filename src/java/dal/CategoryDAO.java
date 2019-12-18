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
import model.Products;

/**
 *
 * @author HuongHoang
 */
public class CategoryDAO  extends DBContext{
    public ArrayList<Categories> getCategories() {
        ArrayList<Categories> categories = new ArrayList<>();
        try {
            String sql = "SELECT [category_id]\n" +
                        "      ,[category_name]\n" +
                        "  FROM [Categories]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Categories c = new Categories();
                c.setCategory_id(rs.getInt("category_id"));
                c.setCategory_name(rs.getString("category_name"));
                categories.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    public boolean searchCategoryByName(String category) {
        try {
            String sql ="SELECT * from Categories where category_name ='"+category+"'";
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
        public void addCategory(Categories categories){
        String sql ="Insert into Categories(category_name) values (?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, categories.getCategory_name());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
