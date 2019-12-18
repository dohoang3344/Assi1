/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BrandDAO;
import dal.CategoryDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Categories;

/**
 *
 * @author HuongHoang
 */
public class AddCategory extends HttpServlet {

    CategoryDAO categoryDAO = new CategoryDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String category_name_err = "";
        String category_name = request.getParameter("category_name");
        if (categoryDAO.searchCategoryByName(category_name)) {
            category_name_err = "Tên loại sản phẩm đã tồn tại";
        }
        if (category_name_err.length() > 0) {
            request.setAttribute("category_name_err", category_name_err);
        }
        request.setAttribute("category_name", category_name);
        String url = "Themloaisanpham.jsp";
        try {
            if (category_name_err.length() == 0) {
                Categories categories = new Categories(category_name);
                categoryDAO.addCategory(categories);
                url = "AdminController";
            } else {
                url = "Themloaisanpham.jsp";
            }
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception e) {
        }
    }

}
