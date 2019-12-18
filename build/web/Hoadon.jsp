<%-- 
    Document   : Hoadon
    Created on : Nov 6, 2019, 4:01:30 PM
    Author     : HuongHoang
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="model.Products"%>
<%@page import="model.Orders"%>
<%@page import="dal.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hóa đơn bán hàng</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            ArrayList<Orders> orderses1 = (ArrayList<Orders>) session.getAttribute("orderses1");
            ProductDAO productDAO = new ProductDAO();
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <table class="table table-striped">
            <thead class="thead-light">
                <tr>
                    <th scope="col">ID đặt hàng</th>
                    <th scope="col">Mã Sản Phẩm</th>
                    <th scope="col">Sản Phẩm</th>
                    <th scope="col">Người nhận</th>
                    <th scope="col">Số điện thoại giao hàng</th>
                    <th scope="col">Địa chỉ giao hàng</th>
                    <th scope="col">Ngày đặt</th>
                    <th scope="col">Ngày giao hàng</th>
                    <th scope="col">Số Lượng</th>
                    <th scope="col">Giá</th>
                </tr>
            </thead>
            <tbody>
            <tbody>
                <%for (Orders orders : orderses1) {%>
                <tr>                              
                    <td><%=orders.getOrder_id()%></td>
                    <td><%=orders.getOrderLine().getProduct_id()%></td>
                    <%
                        ArrayList<Products> productses = productDAO.getProductsByProductID(orders.getOrderLine().getProduct_id());
                    %>
                    <td><%=productses.get(0).getProduct_name()%></td>
                    <td><%=orders.getName()%></td>   
                    <td><%=orders.getPhone()%></td>
                    <td><%=orders.getAddress()%></td>
                    <td><%=orders.getOrder_date()%></td>
                    <td><%=orders.getShipped_date()%></td>   
                    <td><%=orders.getOrderLine().getQuantity()%></td>
                    <%
                        BigDecimal e = new BigDecimal(orders.getOrderLine().getList_price());
                        String g = e.toPlainString();
                        int count = 0;
                        String res = "";
                        for (int i = g.length() - 1; i >= 0; i--) {
                            count++;
                            res = g.charAt(i) + res;
                            if (count % 3 == 0) {
                                res = "." + res;
                            }
                        }
                        if (res.startsWith(".")) {
                            res = res.substring(1);
                        }
                    %>
                    <td><%=res%></td>
                </tr>
                <%}%>
            </tbody>
            <form action="AdminController" method="post">
                <input type="submit" class="btn btn-outline-dark float-right" value="Quay về Admin"/>
            </form>
        </table>
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>
    </body>
</html>
