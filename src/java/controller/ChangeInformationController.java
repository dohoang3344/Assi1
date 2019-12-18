/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customers;

/**
 *
 * @author HuongHoang
 */
public class ChangeInformationController extends HttpServlet {

    private CustomerDAO cusDAO = new CustomerDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("username")==null) {
            request.getRequestDispatcher("Homepage").forward(request, response);
        } 
        else if (request.getSession().getAttribute("username")!=null) {
            request.getRequestDispatcher("Chinhsuataikhoan.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String username_err = "", password_err = "", name_err = "", email_err = "", address_err = "", phone_err = "";
        if (username.equals("")) {
            username_err = "Vui lòng nhập tên tài khoản";
        }
        if (cusDAO.searchCustomerByUserName(username) == false) {
            username_err = "Tài khoản không tồn tại";
        }
        if (username_err.length() > 0) {
            request.setAttribute("username_err", username_err);
        }
        if (password.equals("")) {
            password_err = "Vui lòng nhập mật khẩu";
        }
        if (password_err.length() > 0) {
            request.setAttribute("password_err", password_err);
        }
        if (name.equals("")) {
            name_err = "Vui lòng nhập họ và tên";
        }
        if (name_err.length() > 0) {
            request.setAttribute("name_err", name_err);
        }
        if (email.equals("")) {
            email_err = "Vui lòng nhập email";
        }
        if (email_err.length() > 0) {
            request.setAttribute("email_err", email_err);
        }
        if (address.equals("")) {
            address_err = "Vui lòng nhập địa chỉ";
        }
        if (address_err.length() > 0) {
            request.setAttribute("address_err", address_err);
        }
        if (phone.equals("")) {
            phone_err = "Vui lòng nhập số điện thoại";
        }
        if (phone_err.length() > 0) {
            request.setAttribute("phone_err", phone_err);
        }
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("address", address);
        request.setAttribute("phone", phone);
        String url = "/Chinhsuataikhoan.jsp";
        try {
            if (username_err.length() == 0 && password_err.length() == 0 && name_err.length() == 0 && email_err.length() == 0 && address_err.length() == 0 && phone_err.length() == 0) {
                Customers cus = new Customers(username, password, name, phone, email, address,2);
                cusDAO.ChangeInfor(cus);
                url = "/Trangchu.jsp";
            } else {
                url = "/Chinhsuataikhoan.jsp";
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
        }
    }
}
