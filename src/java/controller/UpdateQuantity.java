/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OrderLine;
import model.Orders;

/**
 *
 * @author HuongHoang
 */
public class UpdateQuantity extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] quan = request.getParameterValues("quantity");
        String[] pid = request.getParameterValues("pid");
        Orders orders = (Orders) request.getSession().getAttribute("Cart");
        ArrayList<OrderLine> temp = orders.getLines();
        if (quan.length > 0) {
            for (int i = 0; i < temp.size(); i++) {
                temp.get(i).setQuantity(Integer.parseInt(quan[i]));
            }
        }
        orders.setLines(temp);
        request.getSession().setAttribute("Cart", orders);
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
    }

}
