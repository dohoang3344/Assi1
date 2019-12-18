/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BrandDAO;
import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Brands;
import model.Categories;
import model.Products;

/**
 *
 * @author HuongHoang
 */
public class ProductListController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    CategoryDAO db1 = new CategoryDAO();
    ArrayList<Categories> categories = db1.getCategories();
    ProductDAO db = new ProductDAO();
    BrandDAO db2 = new BrandDAO();
    ArrayList<Brands> brands = db2.getBrands();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ArrayList<Products> products = db.getProductsByCategory("","");
        request.getSession().setAttribute("products", products);
        request.getSession().setAttribute("categories", categories);
        request.getSession().setAttribute("brands", brands);
        request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        String catelistid="";
        for (int i = 0; i < categories.size(); i++) {
            String cid = request.getParameter("c"+categories.get(i).getCategory_id());
            if (cid!=null) {
                catelistid+=cid+",";
            }
        }
        if (catelistid.endsWith(",")) {
            catelistid=catelistid.substring(0,catelistid.length()-1);
        }
        String brandlistid="";
        for (int i = 0; i < brands.size(); i++) {
            String bid = request.getParameter("b"+brands.get(i).getBrand_id());
            if (bid!=null) {
                brandlistid+=bid+",";
            }
        }
        if (brandlistid.endsWith(",")) {
            brandlistid=brandlistid.substring(0,brandlistid.length()-1);
        }

        
        ArrayList<Products> products = db.getProductsByCategory(catelistid,brandlistid);

        request.getSession().setAttribute("products", products);
        request.getSession().setAttribute("categories", categories);
        request.getSession().setAttribute("brands", brands);
        request.getSession().setAttribute("category_id", catelistid);
        request.getSession().setAttribute("brand_id", brandlistid);
        request.getRequestDispatcher("Sanpham.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
