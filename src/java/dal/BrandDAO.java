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

/**
 *
 * @author HuongHoang
 */
public class BrandDAO extends DBContext{
    public ArrayList<Brands> getBrands() {
        ArrayList<Brands> brands = new ArrayList<>();
        try {
            String sql = "SELECT [brand_id]\n" +
                        "      ,[brand_name]\n" +
                        "  FROM [Brands]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Brands b = new Brands();
                b.setBrand_id(rs.getInt("brand_id"));
                b.setBrand_name(rs.getString("brand_name"));
                brands.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return brands;
    }
    public void addBrand(Brands brands){
        String sql ="Insert into Brands(brand_name) values (?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, brands.getBrand_name());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean searchBrandByName(String brand) {
        ArrayList<Brands> br = new ArrayList<>();
        try {
            String sql ="SELECT * from Brands where brand_name ='"+brand+"'";
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
}
