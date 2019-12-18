<%-- 
    Document   : Cart
    Created on : Oct 30, 2019, 5:54:31 PM
    Author     : HuongHoang
--%>

<%@page import="dal.ProductDAO"%>
<%@page import="model.Products"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Orders"%>
<%@page import="model.Customers"%>
<%@page import="model.OrderLine"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <%
            Orders order = (Orders) session.getAttribute("Cart");
            ArrayList<Customers> customers = (ArrayList<Customers>) session.getAttribute("customers");

            String customer_id = (String) request.getAttribute("customer_id");
        %>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <%
            if (order == null) {
        %>
        <h2 align="center">Bạn chưa mua bất kì sản phẩm nào, vui lòng lựa chọn sản phẩm</h2>
        <%} else {%> 
        <div class="container">
            <div class="row">
                <div class="table-responsive mb-5 text-center col-8">
                    <form action="UpdateQuantity" method="post" >
                        <table class="table table-striped">
                            <thead class="thead-light">
                                <tr>
                                    <th scope="col">Xoá</th>
                                    <th scope="col">Mã Sản Phẩm</th>
                                    <th scope="col">Sản Phẩm</th>
                                    <th scope="col">Số Lượng</th>
                                    <th scope="col">Giá</th>
                                    <th scope="col">Thanh Toán</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%for (OrderLine l : order.getLines()) {
                                        BigDecimal d = new BigDecimal(l.getList_price());
                                        BigDecimal b = new BigDecimal(l.getTotal());

                                        String a = d.toPlainString();
                                        String c = b.toPlainString();
                                        String res = "";
                                        String res1 = "";
                                        int count = 0;
                                        int count1 = 0;
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
                                        for (int i = c.length() - 1; i >= 0; i--) {
                                            count1++;
                                            res1 = c.charAt(i) + res1;
                                            if (count1 % 3 == 0) {
                                                res1 = "." + res1;
                                            }
                                        }
                                        if (res1.startsWith(".")) {
                                            res1 = res1.substring(1);
                                        }

                                %>
                                <tr>
                                    <th scope="row">
                                        <%                                            int x = l.getProduct().getProduct_id();
                                        %>
                                        <a href="RemoveProductInCart?product_id=<%=x%>" class="fas fa-minus-circle" style="cursor:pointer;"></a>
                                    </th>                                    
                                    <td><%=l.getProduct().getProduct_id()%></td>
                                    <td><%=l.getProduct().getProduct_name()%></td>
                                    <%
                                        ProductDAO productDAO = new ProductDAO();
                                        ArrayList<Products> productses = productDAO.getProductsByProductID(l.getProduct().getProduct_id());
                                    %>
                                    <td>                                  
                                        <input type="hidden" name="pid" value="<%= l.getProduct().getProduct_id()%>" />
                                        <input type="number" min="0" max="<%=productses.get(0).getProduct_quantity()%>" class="form-control" name="quantity" value="<%=l.getQuantity()%>">                                  
                                    </td>
                                    <td><%=res%> đ</td>
                                    <td><%=res1%> đ</td>                    
                                </tr>
                                <%}%>
                                <tr>
                                    <%
                                        BigDecimal e = new BigDecimal(order.getTotal());
                                        String g = e.toPlainString();
                                        int count2 = 0;
                                        String res2 = "";
                                        for (int i = g.length() - 1; i >= 0; i--) {
                                            count2++;
                                            res2 = g.charAt(i) + res2;
                                            if (count2 % 3 == 0) {
                                                res2 = "." + res2;
                                            }
                                        }
                                        if (res2.startsWith(".")) {
                                            res2 = res2.substring(1);
                                        }
                                    %>
                                    <th scope="col">Total</th>
                                    <th scope="col"></th>
                                    <th scope="col"></th>
                                    <th scope="col"></th>
                                    <th scope="col"></th>
                                    <th scope="col"><%=res2%></th>
                                </tr>
                            </tbody>
                        </table>
                        <input class="btn btn-light float-right" type="submit" value="Cập nhật giỏ hàng" />
                    </form>
                </div>             
            </div>
            <form action="Thanhtoan.jsp" >
                <input type="submit" class="btn btn-outline-dark float-right" value="Thanh toán"/>
            </form>
        </div>
        <%}%>
        <%@ include file="footer.jsp"%>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="scrip.js"></script>
    </body>
</html>
