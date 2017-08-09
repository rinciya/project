package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>User</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div><h1>User</h1>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\t\t<div id=\"campaigns\">\n");
      out.write("\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h2>Together We Can Change This World</h2>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("                                            The user is responsible for helping the girls develop.You can help the ngo by adopting the girl from the ngo .or by providing them helping hand by funding them.You can also do more by registering yourself as a volunteer.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<img src=\"images/volunteer.jpg\" alt=\"Image\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"body\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h2>adoption details</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\tSelect a girl of particular ngo.\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\tfill the adoption form\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\tfill the ngo name in the form.pls provide valid info\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\twait for the email from ngo\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <a href=\"/bbbp/GirlsDetailsServlet.do\">adoption details</a>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h2>donate for a cause</h2>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\thelp the girl in the education ,provide helping hand for her to develop by providing funds to ngo.\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/fund.jsp\">donate for  a cause</a>\n");
      out.write("                                        </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h2>adoption form</h2>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tAdopt a girl by filling this form.pls provide us right information.\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/adopt.jsp\">adoption form</a>\n");
      out.write("                                        </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tDo more by enrolling yourself as a volunteer\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<a href=\"/bbbp/JSP/vregisterationform.jsp\">Get Involved</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
