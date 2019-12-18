<%-- 
    Document   : Chitietsanpham
    Created on : Oct 23, 2019, 8:35:58 AM
    Author     : HuongHoang
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="model.Products"%>
<%@page import="dal.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Chi tiết sản phẩm</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            ProductDAO pdDAO = new ProductDAO();
            Products pdProducts = pdDAO.getProductDetail(request.getParameter("product_id"));
            ArrayList<Products> products
                    = (ArrayList<Products>) session.getAttribute("products");

        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class="container"> <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center">Chi tiết sản phẩm</h1><br></div>
        <div class=" container mt-5">
            <div class="row">
                <div class="col-5">
                    <img style="width: 100%" src="<%=pdProducts.getProduct_image()%>" alt="">
                </div>
                <div class="col-7">
                    <div class="row">
                        <h1 align="center"><%=pdProducts.getProduct_name()%></h1><br></div>
                    <p> Chi tiết sản phẩm : <%=pdProducts.getProductdetail().getDetail()%></p>
                    <p> Chế độ bảo hành : <%=pdProducts.getProductdetail().getGuarantee()%></p>
                    <%
                        BigDecimal d = new BigDecimal(pdProducts.getProduct_price());
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
                        if (res.startsWith(",")) {
                            res = res.substring(1);
                        }
                    %>
                    <p> Giá : <%=res%> đ</p>
                    <div class="card-footer" style="background-color: white" align="center">
                        <form action="<%=session.getAttribute("username") != null ? "ShoppingCartController" : "Dangnhap.jsp"%>" method="post" style="text-decoration: none;position: absolute;bottom: 0;left: 0">
                            <input type="hidden" name="product_id" value="<%=products.get(0).getProduct_id()%>" />
                            <input type="submit" class="btn btn-outline-dark" value="Thêm vào giỏ hàng"  />
                        </form>
                    </div>
                    <a href="ProductListController" class="btn btn-success" style="position: absolute;bottom: 0;right: 0">Tiếp tục mua sắm</a>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="footer.jsp"%>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="scrip.js"></script>

</body>
</html>
