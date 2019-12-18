/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BrandDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Brands;
import model.ProductDetail;
import model.Products;

/**
 *
 * @author HuongHoang
 */
public class AddBrand extends HttpServlet {

    BrandDAO brandDAO = new BrandDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String brand_name_err = "";
        String brand_name = request.getParameter("brand_name");
        if (brandDAO.searchBrandByName(brand_name)) {
            brand_name_err = "Tên thương hiệu đã tồn tại";
        }
        if (brand_name_err.length() > 0) {
            request.setAttribute("brand_name_err", brand_name_err);
        }
        request.setAttribute("brand_name", brand_name);
        String url = "Themthuonghieu.jsp";
        try {
            if (brand_name_err.length() == 0) {
                Brands brands = new Brands(brand_name);
                brandDAO.addBrand(brands);
                url = "AdminController";
            } else {
                url = "Themthuonghieu.jsp";
            }
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception e) {
        }
    }
}
