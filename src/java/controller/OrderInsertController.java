/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.OrderDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customers;
import model.OrderLine;
import model.Orders;
import model.Products;

/**
 *
 * @author HuongHoang
 */
public class OrderInsertController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        int cid = Integer.parseInt(request.getParameter("customer_id"));
        Customers c = new Customers();
        c.setCustomer_id(cid);
        Orders order = (Orders) request.getSession().getAttribute("Cart");
        ProductDAO pdao = new ProductDAO();
        for (OrderLine l : order.getLines()) {
            ArrayList<Products> productses = pdao.getProductsByProductID(l.getProduct().getProduct_id());
            if (productses.get(0).getProduct_quantity() == 0) {
                pdao.ChangeQuantity(0, productses.get(0).getProduct_id());
            } else {
                pdao.ChangeQuantity((productses.get(0).getProduct_quantity() - l.getQuantity()), productses.get(0).getProduct_id());
            }
        }
        OrderDAO orderDB = new OrderDAO();
        order.setCustomer(c);
        order.setName(name);
        order.setAddress(address);
        order.setEmail(email);
        order.setPhone(phone);
        orderDB.insert(order);
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("address", address);
        request.setAttribute("phone", phone);
        request.getSession().setAttribute("Cart", null);
        request.getRequestDispatcher("Buy.jsp").forward(request, response);
    }

}
