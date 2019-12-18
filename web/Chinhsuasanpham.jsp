<%-- 
    Document   : Thongtintaikhoan
    Created on : Oct 29, 2019, 8:27:04 AM
    Author     : HuongHoang
--%>

<%@page import="model.Products"%>
<%@page import="dal.ProductDAO"%>
<%@page import="model.Brands"%>
<%@page import="model.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="fontawesome-free-5.11.2-web/css/all.min.css">
        <title>Chỉnh sửa thông tin sản phẩm</title>
        <%
            String product_name = "", product_price = "", product_image = "", product_quantity = "", detail = "", guarantee = "", brand_id = "", category_id = "", product_id = "", import_price = "";
            product_name = (String) request.getAttribute("product_name");
            product_price = (String) request.getAttribute("product_price");
            product_image = (String) request.getAttribute("product_image");
            detail = (String) request.getAttribute("detail");
            guarantee = (String) request.getAttribute("guarantee");
            product_quantity = (String) request.getAttribute("product_quantity");
            brand_id = (String) request.getAttribute("brand_id");
            category_id = (String) request.getAttribute("category_id");
            product_id = (String) request.getAttribute("product_id");
            import_price = (String) request.getAttribute("import_price");
            int product_id_raw=Integer.parseInt(product_id);
            ArrayList<Categories> categories
                    = (ArrayList<Categories>) session.getAttribute("categories");
            ArrayList<Brands> brands
                    = (ArrayList<Brands>) session.getAttribute("brands");
        %>
        <script>
            function submitForm()
            {
                document.getElementById()("searchFrm").submit();
            }

        </script>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class=" container">
            <div class="row">
                <div class="col-8 m-auto">
                    <h1 class="mt-5"style="font-style: italic;font-family: 'Dancing Script', cursive;" align="center"> Chỉnh sửa sản phẩm</h1><br>
                    <div class="row" style="">
                        <form class="login-form m-auto" id="searchFrm"  action="ChangeInformationProductController" method="post">
                            <div class="form-group">
                                <input type="hidden" class="form-control" name="product_id" value="<%=product_id%>">
                            </div>
                            <%
                                ProductDAO productDAO = new ProductDAO();
                                ArrayList<Products> productses = productDAO.getProductsByProductID(product_id_raw);
                            %>
                            <div class="form-group">
                                <%if (product_name == null) {
                                        product_name = "";
                                    }%>
                                <label class="text-uppercase">Tên sản phẩm</label>
                                <input type="text" required placeholder="Nhập tên sản phầm" readonly class="form-control" name="product_name" value="<%=productses.get(0).getProduct_name() %>">
                            </div>
                            <div class="form-group">
                                <%if (product_price == null) {
                                        product_price = "";
                                    }%>
                                <label class="text-uppercase">Giá tiền</label>
                                <input type="text" required placeholder="Nhập giá tiền" class="form-control" name="product_price" value="<%=product_price%>">
                            </div>
                            <div class="form-group">
                                <%if (product_image == null) {
                                        product_image = "";
                                    }%>
                                <label class="text-uppercase">Hình ảnh</label>
                                <input type="text" required class="form-control" placeholder="Đường link ảnh"  name="product_image" value="<%=product_image%>">
                            </div>
                            <div class="form-group">
                                Tên hãng :
                                <select name="brand_id" onchange="submitForm();"> 
                                    <% for (Brands b : brands) {%>
                                    <option 
                                        value="<%=b.getBrand_id()%>"><%=b.getBrand_name()%></option>
                                    <%}%>
                                </select>
                            </div>
                            <div class="form-group">
                                Loại sản phẩm :
                                <select name="category_id" onchange="submitForm();"> 
                                    <% for (Categories d : categories) {%>
                                    <option 
                                        value="<%=d.getCategory_id()%>"><%=d.getCategory_name()%></option>
                                    <%}%>
                                </select>
                            </div>
                            <div class="form-group">
                                <%if (detail == null) {
                                        detail = "";
                                    }%>
                                <label class="text-uppercase">Chi tiết </label>
                                <input type="text" required class="form-control" placeholder="Mô tả sản phầm"  name="detail" value="<%=product_image%>">
                            </div>
                            <div class="form-group">
                                <%if (guarantee == null) {
                                        guarantee = "";
                                    }%>
                                <label class="text-uppercase">Chế độ bảo hành </label>
                                <input type="text" class="form-control" placeholder="Chế độ bảo hành"  name="guarantee" value="<%=product_image%>">
                            </div>
                            <div class="form-group">
                                <%if (product_quantity == null) {
                                        product_quantity = "";
                                    }%>
                                <label class="text-uppercase">Số lượng </label>
                                <input type="text" required class="form-control" placeholder="Số lượng"  name="product_quantity" value="<%=product_quantity%>">
                            </div>
                            <div class="form-group">
                                <%if (import_price == null) {
                                        import_price = "";
                                    }%>
                                <label class="text-uppercase">Giá nhập vào </label>
                                <input type="text" required class="form-control" placeholder="Giá nhập sản phẩm"  name="import_price" value="<%=import_price%>">
                            </div>
                            <div class="form-check " style="margin-right: 60px;margin-top:20px" >
                                <button type="submit" class="btn btn-outline-dark float-right">Chỉnh sửa</button>
                            </div>             
                        </form>
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
