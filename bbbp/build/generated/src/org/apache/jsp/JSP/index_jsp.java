package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/JSP/header.jsp");
    _jspx_dependants.add("/JSP/footer.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>NGO Website Template</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"bbbp/CSS/style.css\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta charset=\"utf-8\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"bbbp/CSS/style.css\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<a href=\"\" id=\"logo\"><img src=\"/bbbp/images/Beti Bachao Beti Padhao_Logo_1.jpg\" alt=\"logo\"></a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"current\">\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/index.jsp\">Home</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\".../ExperienceServlet.do\">view experiences</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/shareexperiences.jsp\">share experiences</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"/bbbp/JSP/feedback.jsp\">feedback</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<img src=\"/bbbp/images/people.jpg\" alt=\"Image\">\n");
      out.write("\t\t\t\t<div id=\"tagline\">\n");
      out.write("\t\t\t\t\t<h1>Save Lives</h1>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"section\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tHelp a girl child to evovle .Help her in different parts of her life .so that she might get a better education and better life to live in. let make this world as heaven for girls not hell.\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\">\n");
      out.write("      <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("      Login <span class=\"caret\"></span></button>\n");
      out.write("      <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("        <li><a href=\"login_user.jsp\">User</a></li>\n");
      out.write("        <li><a href=\"login_ngo.jsp\">Ngo</a></li>\n");
      out.write("        <li><a href=\"login_volunteer.jsp\">Volunteer</a></li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"body\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div class=\"figure\">\n");
      out.write("\t\t\t\t\t<img src=\"/bbbp/images/hands.jpg\" alt=\"Image\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>------------\n");
      out.write("\t\t\t\t<div class=\"news\">\n");
      out.write("\t\t\t\t\t<h2>Ngo registration</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<h3><a href=\"ngoregform.jsp\">ngo registeration</a></h3>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tNgo can register to this website to make pepole aware about the problems girls are facing and ask for help.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<h2>User Registration</h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tMake a registeration to the site and help ngo with donation and adoption .\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<span class=\"link\"><a href=\"userregform.jsp\">user</a></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"help\">\n");
      out.write("\t\t\t\t\t<h2>How To Help</h2>\n");
      out.write("\t\t\t\t\t<img src=\"/bbbp/images/finger.jpg\" alt=\"Image\">\n");
      out.write("\t\t\t\t\t<h3>Register as a volunteer</h3>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tHelp us more by registering your self as volunteer\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<span class=\"link\"><a href=\"vregisterationform.jsp\">Get Involved</a></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    ");
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
      out.write("\n");
      out.write("  \n");
      out.write("</body>\n");
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
