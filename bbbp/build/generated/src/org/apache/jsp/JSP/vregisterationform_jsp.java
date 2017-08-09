package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vregisterationform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/JSP/header.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Volunteer Registration form</title>\n");
      out.write("        <style>\n");
      out.write("#back\n");
      out.write("{\n");
      out.write("  background: url(../images/beautiful-girl-holding-green-banner-1448919.jpg) ;\n");
      out.write("  border: 1px solid black;\n");
      out.write("    width:1320px;\n");
      out.write("   height:600px;\n");
      out.write("}\n");
      out.write(" ul, li {\n");
      out.write("    margin:0;\n");
      out.write("    padding:0;\n");
      out.write("    list-style-type:none;\n");
      out.write("}\n");
      out.write("#pswd_info {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:-75px;\n");
      out.write("    bottom: -115px\\9; /* IE Specific */\n");
      out.write("    right:55px;\n");
      out.write("    width:250px;\n");
      out.write("    padding:15px;\n");
      out.write("    background:#fefefe;\n");
      out.write("    font-size:.875em;\n");
      out.write("    border-radius:5px;\n");
      out.write("    box-shadow:0 1px 3px #ccc;\n");
      out.write("    border:1px solid #ddd;\n");
      out.write("}\n");
      out.write("#pswd_info h4 {\n");
      out.write("    margin:0 0 10px 0;\n");
      out.write("    padding:0;\n");
      out.write("    font-weight:normal;\n");
      out.write("}#pswd_info::before {\n");
      out.write("    content: \"\\25B2\";\n");
      out.write("    position:absolute;\n");
      out.write("    top:-12px;\n");
      out.write("    left:45%;\n");
      out.write("    font-size:14px;\n");
      out.write("    line-height:14px;\n");
      out.write("    color:#ddd;\n");
      out.write("    text-shadow:none;\n");
      out.write("    display:block;\n");
      out.write("}\n");
      out.write(".invalid {\n");
      out.write("    background:url(../images/invalid.png) no-repeat 0 50%;\n");
      out.write("    padding-left:22px;\n");
      out.write("    line-height:24px;\n");
      out.write("    color:#ec3f41;\n");
      out.write("}\n");
      out.write(".valid {\n");
      out.write("    background:url(../images/valid.png) no-repeat 0 50%;\n");
      out.write("    padding-left:22px;\n");
      out.write("    line-height:24px;\n");
      out.write("    color:#3a7d34;\n");
      out.write("}\n");
      out.write("#pswd_info {\n");
      out.write("    display:none;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.7.min.js\"></script>\n");
      out.write("<script src=\"script.js\"></script>\n");
      out.write("\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("          function validate()\n");
      out.write("          {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("         if( document.registration.vname.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.registration.vname.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          if( document.registration.vaddress.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Address!\" );\n");
      out.write("            document.registration.vaddress.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         if( document.registration.vemail.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Email!\" );\n");
      out.write("            document.registration.vemail.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          \n");
      out.write("         if( document.registration.vgender.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Gender!\" );\n");
      out.write("            document.registration.vemail.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          if( document.registration.vmno.value ===\"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.registration.vemail.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }  if( document.registration.vage.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.registration.vemail.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("              \n");
      out.write("\n");
      out.write("  \n");
      out.write("         var letters = /^[A-Za-z]+$/;  \n");
      out.write("         var phoneno = /^\\d{8}$/; \n");
      out.write("          var age = /^\\d{2}$/; \n");
      out.write("         var eid = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("      if(!document.registration.vname.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("      \n");
      out.write("      \n");
      out.write("   \n");
      out.write("      if(!document.registration.vmno.value.match(phoneno)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 10 digits phone number\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("         if(!document.registration.vage.value.match(age)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 2 digits\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("           if(!document.registration.vemail.value.match(eid)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter valid email id\");  \n");
      out.write("        return false;  \n");
      out.write("        }  \n");
      out.write("} \n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("   <h1>Volunteer registration</h1>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("<form name=\"registration\"  action=\"../VRegisterServlet.do\" onsubmit=\"return(validate())\">\n");
      out.write("<table><tr><td>USERNAME:</td><td><input name=\"vname\" type=\"text\" size=\"30\"><br><br></td></tr>\n");
      out.write("<tr><td>PASSWORD:</td><td><input id=\"pswd\" name=\"vpassword\" type=\"password\" size=\"30\"><br><br></td></tr>\n");
      out.write("<div id=\"pswd_info\">\n");
      out.write("    <h4>Password must meet the following requirements:</h4>\n");
      out.write("    <ul>\n");
      out.write("        <li id=\"letter\" class=\"invalid\">At least <strong>one letter</strong></li>\n");
      out.write("        <li id=\"capital\" class=\"invalid\">At least <strong>one capital letter</strong></li>\n");
      out.write("        <li id=\"number\" class=\"invalid\">At least <strong>one number</strong></li>\n");
      out.write("        <li id=\"length\" class=\"invalid\">Be at least <strong>8 characters</strong></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<tr><td>ADDRESS:</td><td><input name=\"vaddress\" type=\"text\" size=\"30\"><br><br></td></tr>\n");
      out.write("<tr><td>GENDER:</td><td><input name=\"vgender\" type=\"text\" size=\"30\"><br><br></td></tr>\n");
      out.write("\n");
      out.write("<tr><td>AGE:</td><td><input name=\"vage\" type=\"text\" size=\"30\"><br><br></td></tr>\n");
      out.write("<tr><td>MOBILE NO:</td><td><input name=\"vmno\" type=\"text\" size=\"30\"><br><br></td></tr>\n");
      out.write("<tr><td>EMAIL ID:</td><td><input name=\"vemail\" type=\"text\" size=\"30\"><br><br></td></tr></table>\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"submit\"></center>\n");
      out.write("</div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
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
