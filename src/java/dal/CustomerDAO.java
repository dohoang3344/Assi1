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
import model.Customers;

/**
 *
 * @author HuongHoang
 */
public class CustomerDAO extends DBContext{
    public boolean searchCustomerByUserName(String username) {
        ArrayList<Customers> cus = new ArrayList<>();
        try {
            String sql ="SELECT * from Customers where username ='"+username+"'";
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
    public void addAccount(Customers cus){
        String sql ="Insert into Customers(username,password,name,phone,email,address,controller_id) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cus.getUsername());
            statement.setString(2, cus.getPassword());
            statement.setString(3, cus.getName());
            statement.setString(4, cus.getPhone());
            statement.setString(5, cus.getEmail());
            statement.setString(6, cus.getAddress());
            statement.setInt(7, cus.getController_id());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public boolean checkCustomerByUserNamePassword(String username,String password) {
        ArrayList<Customers> cus = new ArrayList<>();
        try {
            String sql ="SELECT * from Customers where username ='"+username+"' and password = '"+password+"'";
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
    public void ChangeInfor(Customers cus){
        String sql="UPDATE Customers SET password='"+cus.getPassword()+"',name=N'"+cus.getName()+"',phone='"+cus.getPhone()+"',email='"+cus.getEmail()+"',address='"+cus.getAddress()+"' WHERE username = '"+cus.getUsername()+"'";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Customers> showInformationCustomerByUserName(String username) {
        ArrayList<Customers> cus = new ArrayList<>();
        try {
            String sql ="SELECT * from Customers where username ='"+username+"'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {               
                Customers c = new Customers();
                c.setUsername(rs.getString("username"));
                c.setCustomer_id(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setPassword(rs.getString("password"));
                c.setEmail(rs.getString("email"));
                c.setPhone(rs.getString("phone"));
                c.setAddress(rs.getString("address"));
                c.setController_id(rs.getInt("controller_id"));
                cus.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cus;
    }
}
