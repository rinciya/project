package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adoptionform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("     function validate()\n");
      out.write("          {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("         if( document.adoption.maleapp.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.adoption.maleapp.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.adoption.mage.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Age!\" );\n");
      out.write("            document.adoption.mage.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.adoption.femaleapp.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.adoption.femaleapp.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.adoption.fage.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Age!\" );\n");
      out.write("            document.adoption.fage.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         if( document.adoption.email.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Email!\" );\n");
      out.write("            document.adoption.email.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          \n");
      out.write("         if( document.adoption.tno.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.adoption.tno.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }  \n");
      out.write("          if( document.adoption.mno.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.adoption.mno.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }  \n");
      out.write("         if( document.adoption.mm.value == \"\" || document.adoption.mm.value == \"\")\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your monthly income!\" );\n");
      out.write("            document.adoption.mm.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("     \n");
      out.write("  \n");
      out.write("          var numbers = /^[0-9]+$/;\n");
      out.write("          var letters = /^[A-Za-z]+$/;  \n");
      out.write("         var phoneno = /^\\d{10}$/; \n");
      out.write("         var tno = /^\\d{8}$/; \n");
      out.write("          var age = /^\\d{2}$/; \n");
      out.write("         var eid = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("      if(!document.adoption.maleapp.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("      if(!document.adoption.mage.value.match(age)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 2 digits\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("      if(!document.adoption.femaleapp.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      }\n");
      out.write("      if(!document.adoption.fage.value.match(age)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 2 digits\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("      if(!document.adoption.email.value.match(eid)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter valid email id\");  \n");
      out.write("        return false;  \n");
      out.write("        }  \n");
      out.write("      if(!document.adoption.tno.value.match(tno)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 8 digits telephone number\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        if(!document.adoption.mno.value.match(phoneno)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter 10 digits phone number\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        if(!document.adoption.mm.value.match(numbers)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid Monthly Income\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        if(!document.adoption.mf.value.match(numbers)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid Monthly Income\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("           \n");
      out.write("} \n");
      out.write("\n");
      out.write("      \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("tr.spaceunder > td\n");
      out.write("{\n");
      out.write("  padding-bottom: 1em;\n");
      out.write("}\n");
      out.write(".div1 {\n");
      out.write(" border-radius: 25px;\n");
      out.write("background-color:#FFFFCC;\n");
      out.write(" width: 800px;\n");
      out.write("    margin: auto; \n");
      out.write("    height: 1200px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>form Page</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write(" <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>yes you can adopt..!!</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("<img src=\"../images/who_can_adopt.jpg\" height=200 width=200 /></center>\n");
      out.write("<p>\n");
      out.write("<form name=\"adoption\"  action=\"../AdoptionServlet.do\"  onsubmit=\"return(validate())\" >\n");
      out.write("    <table>\n");
      out.write("        <tr >\n");
      out.write("<td><b><u>Male Applicant:</b></u></td></tr>\n");
      out.write("<tr ><td>\n");
      out.write("a)Name:</td><td><input type=\"text\" name=\"maleapp\">  </td></tr>\n");
      out.write("<tr ><td>b)Age:</td><td><input type=\"text\" name=\"mage\"> </td>\n");
      out.write("</tr>\n");
      out.write("<tr ><td>\n");
      out.write("<b><u>Female Applicant:</b></u></td></tr>\n");
      out.write("<tr ><td>\n");
      out.write("a)Name:</td><td><input type=\"text\" name=\"femaleapp\"> </td></tr>\n");
      out.write("<tr ><td>\n");
      out.write(" b)Age:</td><td><input type=\"text\" name=\"fage\"></td></tr>\n");
      out.write(" <tr >\n");
      out.write("<td><b>Address:</b></td> <td><input type=\"text\" name=\"address\"></td></tr>\n");
      out.write(" <tr><td><b>E-Mail Address:</b></td><td><input type=\"email\" name=\"email\"></td></tr>\n");
      out.write("<tr><td><b>Telephone number:</b></td><td><input type=\"text\" name=\"tno\"></td></tr>\n");
      out.write("<tr><td><b>Mobile number:</b></td><td><input type=\"text\" name=\"mno\"></td></tr>\n");
      out.write("<tr><td><b><u>Male Applicant</b></u></td></tr>\n");
      out.write("<tr><td>a)Profession:</td><td><input type=\"text\" name=\"pm\"></td></tr> \n");
      out.write("<tr><td>b)Monthly Income:</td><td><input type=\"text\" name=\"mm\"></td></tr>\n");
      out.write("\n");
      out.write("<tr><td><b><u>Female Applicant</b></u></td></tr>\n");
      out.write("<tr><td>a)Profession:</td><td><input type=\"text\" name=\"pf\"></td></tr>\n");
      out.write(" <tr><td>b)Monthly Income:</td><td><input type=\"text\" name=\"mf\"></td></tr>\n");
      out.write(" <tr><td><b><u>Adoption Details</b></u></td></tr>\n");
      out.write("  <tr><td>a)Name of the girl:</td><td><input type=\"text\" name=\"girlname\"></td></tr>\n");
      out.write("   <tr><td>b)Name taken from NGO:</td><td><input type=\"text\" name=\"ngoname\"></td></tr>\n");
      out.write("<tr><td>\n");
      out.write("       <b> Reason for adopting a girl child:<b></td><td><textarea name=\"reason\" rows=\"4\" cols=\"60\"></textarea></td></tr>\n");
      out.write("</table>\n");
      out.write("<center><input type=\"submit\" class=\"btn btn-success\" value=\"Submit\"></input></center>\n");
      out.write("</form>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\t\t\t</div></center></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
