/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customers;

/**
 *
 * @author HuongHoang
 */
public class Login extends HttpServlet {

    private CustomerDAO cusDAO = new CustomerDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("username") == null) {
            request.getRequestDispatcher("Dangnhap.jsp").forward(request, response);
        } else if (request.getSession().getAttribute("username") != null) {           
                request.getRequestDispatcher("Homepage").forward(request, response);
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        String err = "";
        ArrayList<Customers> cus = cusDAO.showInformationCustomerByUserName(username);
        request.setAttribute("cus", cus);
        if (username.equals("") || (password.equals(""))) {
            err = "Vui lòng nhập đầy đủ tên tài khoản và mật khẩu";
        } else {
            if (cusDAO.checkCustomerByUserNamePassword(username, password) == false) {
                err = "Tài khoản hoặc mật khẩu không đúng";
            }
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);
        }
        try {
            String url = "/Dangnhap.jsp";
            if (err.length() == 0) {
                if (cus.get(0).getController_id() == 2) {
                    url = "/Trangchu.jsp";
                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);
                    if (remember != null) {
                        Cookie cookieUser = new Cookie("username", username);
                        cookieUser.setMaxAge(24 * 3600);
                        Cookie cookiePassword = new Cookie("password", password);
                        cookiePassword.setMaxAge(24 * 3600);
                        response.addCookie(cookieUser);
                        response.addCookie(cookiePassword);
                    }
                } else {
                    url = "/AdminController";
                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);
                    if (remember != null) {
                        Cookie cookieUser = new Cookie("username", username);
                        cookieUser.setMaxAge(24 * 3600);
                        Cookie cookiePassword = new Cookie("password", password);
                        cookiePassword.setMaxAge(24 * 3600);
                        response.addCookie(cookieUser);
                        response.addCookie(cookiePassword);
                    }
                }
            } else {
                url = "/Dangnhap.jsp";
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
        }

    }

}
