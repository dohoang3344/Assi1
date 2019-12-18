package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dal.ProductDAO;
import model.Categories;
import java.util.ArrayList;
import model.Products;

public final class Sanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Sản phẩm</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dancing+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");

            ArrayList<Products> products
                    = (ArrayList<Products>) request.getAttribute("products");
            ArrayList<Categories> categories
                    = (ArrayList<Categories>) request.getAttribute("categories");
            Integer category_id = (Integer) request.getAttribute("category_id");
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function submitForm()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"searchFrm\").submit();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"Trangchu.jsp\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Trangchu.jsp\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Gioithieu.jsp\">Giới thiệu</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Sanpham.jsp\">Sản phẩm</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://genk.vn/do-choi-so.chn\">Tin tức</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Liên hệ</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"#\" class=\"fas fa-cart-plus\" style=\"font-size: 22px;margin-top: 10px;padding: 0 10px;color: black;text-decoration: none;\"></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Danh mục</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4 mb-5\">\n");
      out.write("                    <form id=\"searchFrm\" action=\"ProductListController\" method=\"post\">\n");
      out.write("                        <select name=\"category_id\" onchange=\"submitForm();\" > \n");
      out.write("                            <option value=\"-1\">----------ALL----------</option>\n");
      out.write("                            ");
 for (Categories c : categories) {
                            
      out.write("\n");
      out.write("                            <option \n");
      out.write("                                ");
      out.print((c.getCategory_id() == category_id) ? "selected" : "");
      out.write("\n");
      out.write("                                value=\"");
      out.print(c.getCategory_id());
      out.write('"');
      out.write('>');
      out.print(c.getCategory_name());
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4 mb-5\">\n");
      out.write("                    <form action=\"search\" method=\"get\">\n");
      out.write("                        <input type=\"radio\" name=\"price\" value=\"Giá\">\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">               \n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");
 for (Products p : products) {
      out.write("                \n");
      out.write("                        <div class=\"col-3 mb-5\">\n");
      out.write("                            <div class=\"card\" style=\"height: 100%;\">\n");
      out.write("                                <img src=\"");
      out.print(p.getProduct_image());
      out.write("\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(p.getProduct_name());
      out.write("</p>\n");
      out.write("                                    <p id=\"gia\">");
      out.print(p.getProduct_price());
      out.write(" đ</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer m-auto\" style=\"background-color: white\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-outline-dark\">Mua ngay</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        ");
}
      out.write("  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\" >\n");
      out.write("            <div class=\"row\" style=\"background-color: black;color: white\" >\n");
      out.write("                <div class=\"card col-e2 col-md-6 col-lg-3 spzero mb-5\" style=\"background-color: black;color: white\">\n");
      out.write("                    <div >\n");
      out.write("                        <a class=\"navbar-brand\" href=\"Trangchu.jsp\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Ramus</a>\n");
      out.write("                        <p >Địa chỉ : Đại học FPT,Km29,Đại lộ Thăng Long,Khu công nghệ cao Hoà Lạc</p>\n");
      out.write("                        <p >Sđt : 0988888888</p>\n");
      out.write("                        <p >Email : ShopRamus@gmail.com</p>\n");
      out.write("                        <a href=\"\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" ><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("                    <div class=>\n");
      out.write("                        <h3 class=\"card-text\">Liên kết nhanh</h3>\n");
      out.write("                        <a href=\"Trangchu.jsp\" class=\"Trangchu\">Trang chủ</a><br>\n");
      out.write("                        <a href=\"Sanpham.jsp\" class=\"sanpham\">Sản phẩm</a><br>\n");
      out.write("                        <a href=\"http://genk.vn/do-choi-so.chn\" class=\"tintuc\">Tin tức</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("                    <div class=>\n");
      out.write("                        <h3 class=\"card-text\">Thông tin</h3><br>\n");
      out.write("                        <p  class=\"bando\">Bản đồ</p>\n");
      out.write("                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.482570608979!2d105.52510551489026!3d21.01336868600672!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2sFPT%20University!5e0!3m2!1sen!2s!4v1570458999036!5m2!1sen!2s\"  frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("                    <div class=>\n");
      out.write("                        <h3 class=\"card-text\">Bản tin</h3>\n");
      out.write("                        <button name=\"dangnhap\">Đăng nhập</button>\n");
      out.write("                        <p >Đăng kí để nhận ưu đãi</p>\n");
      out.write("                        <button name=\"dangki\">Đăng kí</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"scrip.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
