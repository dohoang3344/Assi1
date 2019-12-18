<%-- 
    Document   : Sanpham
    Created on : Oct 8, 2019, 9:49:59 AM
    Author     : HuongHoang
--%>

<%@page import="model.Brands"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="dal.ProductDAO"%>
<%@page import="model.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sản phẩm</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            ArrayList<Categories> categories
                    = (ArrayList<Categories>) session.getAttribute("categories");
            ArrayList<Brands> brands
                    = (ArrayList<Brands>) session.getAttribute("brands");
            String x = (String) session.getAttribute("category_id");
            String y = (String) session.getAttribute("brand_id");
            ProductDAO pdao = new ProductDAO();
            ArrayList<Products> arr = (ArrayList<Products>) session.getAttribute("products");;
            int start = 0, end = 12;
            if (arr.size() < 12) {
                end = arr.size();
            }
            if (request.getParameter("start") != null) {
                start = Integer.parseInt(request.getParameter("start"));
            }
            if (request.getParameter("end") != null) {
                end = Integer.parseInt(request.getParameter("end"));
            }
            ArrayList<Products> list = pdao.getListByPage(arr, start, end);

        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class="container">
            <h3>Danh mục</h3>
            <div class="row">
                <div class="col-3">
                    <form action="ProductListController" method="post">
                        <h4>Loại sản phẩm</h4>
                        <% for (Categories d : categories) {
                                String x2 = "";
                                if (x != null) {
                                    if ((x.contains(d.getCategory_id() + ""))) {
                                        x2 = "checked";
                                    }

                                } else {
                                    x2 = "";
                                }
                        %>
                        <input <%=x2%> type="checkbox" name="<%="c" + d.getCategory_id()%>" value="<%=d.getCategory_id()%>"><%="" + d.getCategory_name()%><br>
                        <%}%>
                        <h4>Thương hiệu</h4>
                        <% for (Brands b : brands) {
                                String x2 = "";
                                if (x != null) {
                                    if ((y.contains(b.getBrand_id() + ""))) {
                                        x2 = "checked";
                                    }

                                } else {
                                    x2 = "";
                                }
                        %>
                        <input <%=x2%> type="checkbox" name="<%="b" + b.getBrand_id()%>" value="<%=b.getBrand_id()%>"><%="" + b.getBrand_name()%><br>
                        <%}%>
                        <input type="submit" class="btn btn-outline-dark float-right" value="Tìm kiếm " />
                    </form> 
                </div>         
                <div class="col-9">
                    <div class="row">
                        <% for (Products p : list) {%>                
                        <div class="col-4 mb-5">
                            <div class="card" style="height: 100%;">
                                <img src="<%=p.getProduct_image()%>" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <p class="card-text"><%=p.getProduct_name()%></p>
                                    <%
                                        BigDecimal d = new BigDecimal(p.getProduct_price());
                                        String a = d.toPlainString();
                                        String res = "";
                                        int count = 0;
                                        for (int i = a.length() - 1; i >= 0; i--) {
                                            count++;
                                            res = a.charAt(i) + res;
                                            if (count % 3 == 0) {
                                                res = "." + res;
                                            }
                                        }
                                        if (res.startsWith(".")) {
                                            res = res.substring(1);
                                        }

                                    %>
                                    <p id="gia"><%=res%> đ</p>
                                </div>
                                <div class="card-footer" style="background-color: white" align="center">
                                    <form action="<%=session.getAttribute("username") != null ? "ShoppingCartController" : "Dangnhap.jsp"%>" method="post">
                                        <input type="hidden" name="product_id" value="<%=p.getProduct_id()%>" />
                                        <input type="submit" class="btn btn-outline-dark" value="Thêm vào giỏ hàng"  />
                                    </form>
                                    <a href="Chitietsanpham.jsp?product_id=<%=p.getProduct_id()%>" style="padding:5px 8px" class="btn btn-outline-dark mt-3">Chi tiết sản phẩm</a>
                                </div>
                            </div>
                        </div> 
                        <%}%>                        
                    </div>
                </div>
                <ul  class="pagination m-auto" >
                    <li class=" page-item"><a class="page-link" href="Sanpham.jsp?start=0&end=12">First</a></li>
                        <%
                            int e, f;
                            int limit = arr.size() / 12;
                            if (limit * 12 < arr.size()) {
                                limit += 1;
                            }
                            for (int i = 1; i <= limit; i++) {
                                e = (i - 1) * 12;
                                f = i * 12;
                                if (f > arr.size()) {
                                    f = arr.size();
                                }
                        %>
                    <li class=" page-item"><a class="page-link" href="Sanpham.jsp?start=<%=e%>&end=<%=f%>"><%=i%></a></li>
                        <%}%>
                    <li class=" page-item"><a class="page-link" href="Sanpham.jsp?start=<%=arr.size() - 12%>&end=<%=arr.size()%>">Last</a></li>
                </ul>
            </div>
        </div>  
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>
    </body>
</html>
