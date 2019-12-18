package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Customers;
import dal.CustomerDAO;

public final class Dangnhap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Đăng nhập</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dancing+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontawesome-free-5.11.2-web/css/all.min.css\">\n");
      out.write("        ");

            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");
            }
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String user = (String) session.getAttribute("username");
            if (user.equals(null)) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


    CustomerDAO customerDAO = new CustomerDAO();
    ArrayList<Customers> cus = customerDAO.showInformationCustomerByUserName((String) session.getAttribute("username"));

      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"Homepage\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Harley</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Homepage\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Gioithieu.jsp\">Giới thiệu</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"ProductListController\">Sản phẩm</a>\n");
      out.write("                </li>\n");
      out.write("                ");
 if (session.getAttribute("username") == null) {
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"Dangnhap.jsp\" class=\"nav-link\">Đăng Nhập</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"Dangky.jsp\" class=\"nav-link\">Đăng Ký</a> \n");
      out.write("                </li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
 if (session.getAttribute("username") != null) {
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <div class=\"btn-group\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            ");
      out.print((session.getAttribute("username")) != null ? session.getAttribute("username") : "");
      out.write("\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"Chinhsuataikhoan.jsp\">Chỉnh sửa tài khoản</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"HistoryCart\">Đơn hàng đã mua</a>\n");
      out.write("                            ");

                                if (cus.get(0).getController_id() == 1) {
                            
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"AdminController\">Admin</a>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"Login?command=logout\">Đăng xuất</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"ShoppingCartController\" class=\"fas fa-cart-plus\" style=\"font-size: 22px;margin-top: 10px;padding: 0 10px;color: black;text-decoration: none;\"></a>\n");
      out.write("                </li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\" container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8 m-auto\">\n");
      out.write("                    <h1 class=\"mt-5\"style=\"font-style: italic;font-family: 'Dancing Script', cursive;\" align=\"center\"> Đăng Nhập</h1><br>\n");
      out.write("                    <div class=\"row\" style=\"\">\n");
      out.write("                        <form class=\"login-form m-auto\" action=\"Login\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputUser\" class=\"text-uppercase\">Tài khoản</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"Nhập tài khoản\" class=\"form-control\" name=\"username\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\" class=\"text-uppercase\">Mật khẩu</label>\n");
      out.write("                                <input type=\"password\"placeholder=\"Nhập mật khẩu\" class=\"form-control\"  name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                            <p style=\"color:red\">");
      out.print(err);
      out.write("</p>\n");
      out.write("                            <div class=\"form-check m-auto\">\n");
      out.write("                                <input type=\"checkbox\" name=\"remember\" value=\"remember\" class=\"form-check-input\"> Ghi nhớ tài khoản\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-outline-dark float-right\" value=\"Đăng nhập\"/>\n");
      out.write("                            <div style=\"margin-top: 30px;width: 200px\" >\n");
      out.write("                                <a href=\"Dangky.jsp\">Đăng ký tài khoản </a> \n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"container-fluid\" style=\"margin-top: 100px\">\n");
      out.write("    <div class=\"row\" style=\"background-color: black;color: white\" >\n");
      out.write("        <div class=\"card col-e2 col-md-6 col-lg-3 spzero mb-5\" style=\"background-color: black;color: white\">\n");
      out.write("            <div >\n");
      out.write("                <a class=\"navbar-brand\" href=\"Homepage\" style=\"font-size: 50px;font-style: italic;font-family: 'Dancing Script', cursive;\">Harley</a>\n");
      out.write("                <p >Địa chỉ : Đại học FPT,Km29,Đại lộ Thăng Long,Khu công nghệ cao Hoà Lạc</p>\n");
      out.write("                <p >Sđt : 0988888888</p>\n");
      out.write("                <p >Email : ShopRamus@gmail.com</p>\n");
      out.write("                <a href=\"https://www.facebook.com/profile.php?id=100014495745790\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("                <a href=\"https://twitter.com/hoang_doduc_3\" ><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                <a href=\"https://www.instagram.com/hoang.doduc/\" ><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("            <div class=>\n");
      out.write("                <h3 class=\"card-text\">Liên kết nhanh</h3>\n");
      out.write("                <a href=\"Trangchu.jsp\" class=\"Trangchu\">Trang chủ</a><br>\n");
      out.write("                <a href=\"ProductListController\" class=\"sanpham\">Sản phẩm</a><br>\n");
      out.write("                <a href=\"http://genk.vn/do-choi-so.chn\" class=\"tintuc\">Tin tức</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("            <div class=>\n");
      out.write("                <h3 class=\"card-text\">Thông tin</h3><br>\n");
      out.write("                <p  class=\"bando\">Bản đồ</p>\n");
      out.write("                <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3724.482570608979!2d105.52510551489026!3d21.01336868600672!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313454b32ca5086d%3A0xa3c62e29d8ab37e4!2sFPT%20University!5e0!3m2!1sen!2s!4v1570458999036!5m2!1sen!2s\"  frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-6 col-lg-3 spzero mb-5\" style=\"padding-top: 50px \">\n");
      out.write("            <div class=>\n");
      out.write("                <h3 class=\"card-text\">Bản tin</h3>\n");
      out.write("                ");
 if (session.getAttribute("username") == null) {
      out.write("\n");
      out.write("                <a href=\"Dangnhap.jsp\">Đăng nhập</a>\n");
      out.write("                <p >Đăng kí để nhận ưu đãi</p>\n");
      out.write("                <a href=\"Dangky.jsp\">Đăng ký</a>\n");
      out.write("                ");
}else{
      out.write("\n");
      out.write("                <p>Welcome ");
      out.print(session.getAttribute("username") );
      out.write("</p>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"scrip.js\"></script>\n");
      out.write("\n");
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
