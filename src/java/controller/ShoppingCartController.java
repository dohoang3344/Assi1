/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CustomerDAO;
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
public class ShoppingCartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CustomerDAO customerDB = new CustomerDAO();
        String username = (String) request.getSession().getAttribute("username");
        ArrayList<Customers> customers = customerDB.showInformationCustomerByUserName(username);
        request.getSession().setAttribute("customers", customers);
        response.sendRedirect("Cart.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Orders order = (Orders) request.getSession().getAttribute("Cart");
        if (order == null) {
            order = new Orders();
        }
        String product_id = request.getParameter("product_id");
        int product_id_raw=Integer.parseInt(product_id);
        ProductDAO db = new ProductDAO();
        Products product = db.getProductDetail(product_id);
        ArrayList<Products> product1 =db.getProductsByProductID(product_id_raw);
        boolean isExist = false;
        for (OrderLine line : order.getLines()) {
            if (line.getProduct().getProduct_id() == product.getProduct_id()) {
                if (product1.get(0).getProduct_quantity() == 0) {
                    line.setQuantity(0);
                } else {
                    line.setQuantity((line.getQuantity() + 1));
                }
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            OrderLine line = new OrderLine();
            line.setProduct(product);
            line.setOrder(order);
            line.setList_price(product.getProduct_price());
            if (product1.get(0).getProduct_quantity() == 0) {
                line.setQuantity(0);
            } else {
                line.setQuantity(1);
            }
            order.getLines().add(line);
        }
        request.getSession().setAttribute("Cart", order);
        response.sendRedirect("ProductListController");
    }
}
