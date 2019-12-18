<%-- 
    Document   : Dangnhap
    Created on : Oct 8, 2019, 9:57:55 AM
    Author     : HuongHoang
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="model.Brands"%>
<%@page import="model.Categories"%>
<%@page import="model.Products"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Admin</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            ArrayList<Products> products
                    = (ArrayList<Products>) session.getAttribute("products");
            int j = 0;
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class=" container">
            <div class="row" style="">
                <h1 >Welcome Admin Đỗ Hoàng</h1>
            </div>
            <form action="AddProduct" method="post">
                <input type="submit" class="btn btn-outline-dark" value="Thêm mặt hàng"  />
            </form>
            <form action="Themthuonghieu.jsp" method="post">
                <input type="submit" class="btn btn-outline-dark" value="Thêm thương hiệu"  />
            </form>
            <form action="Themloaisanpham.jsp" method="post">
                <input type="submit" class="btn btn-outline-dark" value="Thêm loại sản phẩm"  />
            </form>
            <form action="BillofSale" method="post">
                <input type="submit" class="btn btn-outline-dark" value="Hóa đơn sản phẩm"  />
            </form>
            <table class="table">
                <caption>List of product</caption>
                <thead>
                    <tr>
                        <th scope="col">ID sản phẩm</th>
                        <th scope="col">Sản phẩm</th>
                        <th scope="col">Hình ảnh</th>
                        <th scope="col">Tên hãng</th>
                        <th scope="col">Loại sản phẩm</th>
                        <th scope="col">Giá tiền</th>
                        <th scope="col">Số lượng</th>
                        <th scope="col">Tác vụ</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Products p : products) {%>
                    <tr>
                <form>
                    <th scope="row"><%=p.getProduct_id() %></th>
                    <td><%=p.getProduct_name()%></td>
                    <td><img src="<%=p.getProduct_image()%>" class="card-img-top" style="width: 100px;height: 100px" alt="..."></td>
                    <td><%=p.getBrand().getBrand_name()%></td>
                    <td><%=p.getCategory().getCategory_name()%></td>
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
                    <td><%=res%></td>
                    <td><%=p.getProduct_quantity()==0?"Hết hàng":p.getProduct_quantity() %></td>
                    <td>
                        <a href="DeleteProduct?product_id=<%=p.getProduct_id()%>"><i class="fas fa-window-close"></i></a>
                        <a href="BrandAndCategory?product_id=<%=p.getProduct_id()%>" ><i class="fas fa-tools"></i></a>
                    </td>
                </form>
                </tr>
                <%}%>
                </tbody>
            </table>
        </div>
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>

    </body>
</html>
