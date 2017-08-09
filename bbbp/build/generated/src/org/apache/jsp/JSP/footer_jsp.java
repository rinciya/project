package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    \n");
      out.write("\t\t<div><center>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t<h2>Contact Details</h2>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<b>Location</b>\n");
      out.write("\t\t\t\t\t\t<span>:</span>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tbnadra (w),mumbai 400121\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<b>Phone</b>\n");
      out.write("\t\t\t\t\t\t<span>:</span>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t+91-8228990212\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<b>Email</b>\n");
      out.write("\t\t\t\t\t\t<span>:</span>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tbbbp@gmail.com\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<b>Social</b>\n");
      out.write("\t\t\t\t\t\t<span>:</span>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/facebook/\" id=\"facebook\" target=\"_blank\">facebook</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/twitter/\" id=\"twitter\" target=\"_blank\">twitter</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/googleplus/\" id=\"googleplus\" target=\"_blank\">google&#43;</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div></center>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t&copy; Copyright 2032. All rights reserved.\n");
      out.write("\t\t</p>\n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("   </body>\n");
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
