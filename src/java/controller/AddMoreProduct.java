/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
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
public class AddMoreProduct extends HttpServlet {

    ProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String product_name = request.getParameter("product_name");
        String detail = request.getParameter("detail");
        String guarantee = request.getParameter("guarantee");
        String product_price_raw = request.getParameter("product_price");
        String product_image = request.getParameter("product_image");
        String brand_id_raw = request.getParameter("brand_id");
        String category_id_raw = request.getParameter("category_id");
        String product_quantity_raw = request.getParameter("product_quantity");
        String import_price_raw = request.getParameter("import_price");
        float import_price = Float.parseFloat(import_price_raw);
        int brand_id = Integer.parseInt(brand_id_raw);
        int category_id = Integer.parseInt(category_id_raw);
        float product_price = Float.parseFloat(product_price_raw);
        int product_quantity = Integer.parseInt(product_quantity_raw);
        request.setAttribute("product_name", product_name);
        request.setAttribute("product_image", product_image);
        request.setAttribute("product_price", product_price);
        request.setAttribute("brand_id", brand_id);
        request.setAttribute("category_id", category_id);    
        String url = "Themthuonghieu.jsp";
        try {
            if (!productDAO.searchProductByName(product_name)) {
                ProductDetail productDetail = new ProductDetail(detail, guarantee);
                Products pro = new Products(product_name, brand_id, category_id, product_price, product_quantity, product_image, import_price);
                productDAO.addProduct(pro);
                productDAO.addProductDetail(productDetail);
                url = "AdminController";
            } else {
                url = "AddProduct";
            }
            response.sendRedirect(url);
        } catch (Exception e) {
        }
    }
}
