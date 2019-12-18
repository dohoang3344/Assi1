/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OrderLine;
import model.Orders;

/**
 *
 * @author HuongHoang
 */
public class OrderDAO extends DBContext {

    public void insert(Orders order) throws IOException {
        try {
            connection.setAutoCommit(false);
            //INSERT ORDER 
            String sql_insert_order = "INSERT INTO [dbo].[Orders]\n"
                    + "           ([customer_id]\n"
                    + "           ,[order_date]\n"
                    + "           ,[shipped_date]\n"
                    + "           ,[name]\n"
                    + "           ,[phone]\n"
                    + "           ,[email]\n"
                    + "           ,[address])\n"
                    + "     VALUES\n"
                    + "           (? \n"
                    + "           ,GETDATE() \n"
                    + "           ,DATEADD(day,3,GETDATE())\n"
                    + "           ,? \n"
                    + "           ,? \n"
                    + "           ,? \n"
                    + "           ,?)";
            PreparedStatement statement_insert_order
                    = connection.prepareStatement(sql_insert_order);
            statement_insert_order.setInt(1, order.getCustomer().getCustomer_id());
            statement_insert_order.setString(2, order.getName());
            statement_insert_order.setString(3, order.getPhone());
            statement_insert_order.setString(4, order.getEmail());
            statement_insert_order.setString(5, order.getAddress());
            statement_insert_order.executeUpdate();
            String sql_query_orderid = "SELECT @@IDENTITY as order_id ";
            PreparedStatement statement_query_oid
                    = connection.prepareStatement(sql_query_orderid);
            ResultSet rs_orderid = statement_query_oid.executeQuery();
            if (rs_orderid.next()) {
                order.setOrder_id(rs_orderid.getInt("order_id"));
            }
            // INSERT ORDER LINES
            for (OrderLine line : order.getLines()) {
                String sql_insert_orderline = "INSERT INTO [dbo].[Order_items]\n"
                        + "           ([order_id]\n"
                        + "           ,[product_id]\n"
                        + "           ,[quantity]\n"
                        + "           ,[list_price])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?\n"
                        + "           ,?\n"
                        + "           ,?)";
                PreparedStatement statement_insert_orderline
                        = connection.prepareStatement(sql_insert_orderline);
                statement_insert_orderline.setInt(1, order.getOrder_id());
                statement_insert_orderline.setInt(2, line.getProduct().getProduct_id());
                statement_insert_orderline.setInt(3, (int) line.getQuantity());
                statement_insert_orderline.setFloat(4, line.getList_price()*line.getQuantity());
                statement_insert_orderline.executeUpdate();
            }
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Orders> showInformationOrderById(int customer_id) {
        ArrayList<Orders> cus = new ArrayList<>();
        try {
            String sql ="SELECT * from Orders o Inner join  Order_items oi on oi.order_id= o.order_id  where o.customer_id ="+customer_id+" order by o.order_date DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {               
                Orders c = new Orders();
                c.setOrder_id(rs.getInt("order_id"));
                c.setCustomer_id(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setShipped_date(rs.getDate("shipped_date"));
                c.setEmail(rs.getString("email"));
                c.setPhone(rs.getString("phone"));
                c.setAddress(rs.getString("address"));
                c.setOrder_date(rs.getDate("order_date"));
                
                OrderLine ol= new OrderLine();
                ol.setOrder_id(rs.getInt("order_id"));
                ol.setProduct_id(rs.getInt("product_id"));
                ol.setList_price(rs.getFloat("list_price"));
                ol.setQuantity(rs.getInt("quantity"));
                
                c.setOrderLine(ol);
                cus.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cus;
    }
    public ArrayList<Orders> showInformationOrder() {
        ArrayList<Orders> cus = new ArrayList<>();
        try {
            String sql ="SELECT * from Orders o Inner join  Order_items oi on oi.order_id= o.order_id order by o.order_id DESC ";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {               
                Orders c = new Orders();
                c.setOrder_id(rs.getInt("order_id"));
                c.setCustomer_id(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setShipped_date(rs.getDate("shipped_date"));
                c.setEmail(rs.getString("email"));
                c.setPhone(rs.getString("phone"));
                c.setAddress(rs.getString("address"));
                c.setOrder_date(rs.getDate("order_date"));
                
                OrderLine ol= new OrderLine();
                ol.setOrder_id(rs.getInt("order_id"));
                ol.setProduct_id(rs.getInt("product_id"));
                ol.setList_price(rs.getFloat("list_price"));
                ol.setQuantity(rs.getInt("quantity"));
                
                c.setOrderLine(ol);
                cus.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cus;
    }
}
