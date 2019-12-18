/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CustomerDAO;
import dal.OrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customers;
import model.Orders;

/**
 *
 * @author HuongHoang
 */
public class BillofSale extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderDAO orderDAO = new OrderDAO();
        ArrayList<Orders> orderses1 = orderDAO.showInformationOrder();
        request.getSession().setAttribute("orderses1", orderses1);

        request.getRequestDispatcher("Hoadon.jsp").forward(request, response);
    }

}
