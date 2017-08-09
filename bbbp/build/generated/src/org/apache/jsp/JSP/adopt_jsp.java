package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adopt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write("        <title>adopt Page</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".div1 {\n");
      out.write(" border-radius: 25px;\n");
      out.write("background-color:#FFFFCC;\n");
      out.write(" width: 800px;\n");
      out.write("    margin: auto; \n");
      out.write("    height:850px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("    font-weight:300;\n");
      out.write("  font-stretch:expand;\n");
      out.write("  font-style:italic;\n");
      out.write("    font-family: Verdana;\n");
      out.write("    align:center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>abc</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write(" <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>TOGETHER WE CAN CHANGE THIS WORLD..!!</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <img src=\"../images/AdoptBabies.jpg\" height=350 width=518 align=\"center\"/></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"div1\" style=\"height:60%;width:80%;\">\n");
      out.write("  <p>\n");
      out.write(" A prospective parent can register online through the child adoption resource information and guidance system and check for children legally available for adoption according to age, language and other criteria. The Central Adoption Resource Authority, the nodal agency for adoption in India, has created a database of children available for adoption and has connected with adoption agencies across the country. \n");
      out.write("Non-resident Indians will be treated as Indians in terms of priority and not as foreign nationals. At present, only 20% of children given for adoption go to NRI homes. There are an estimated 10,000 parents who would like to adopt. \n");
      out.write("\n");
      out.write("The new rules have also laid down criteria for prospective parents. Couples will have to be in a stable marital relationship for at least a year to adopt and the minimum age difference between the child and either parent should not be less than 25 years. Single women can adopt children of either gender but single men will not be eligible to adopt a girl child. The maximum age of a single prospective parent is 45 years if he or she wants to adopt a child of up to fours years of age. The ministry has capped the age of the parent at 55 years for adopting a child above eight years. It has also laid down a timeframe for the process of adoption. \n");
      out.write("  \n");
      out.write("  </p>\n");
      out.write("  <center><h4><a href=\"adoptionform.jsp\">Click Here to proceed with the Consent Form</a></h4></center>\n");
      out.write("</div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
