package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fund_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/bbbp/CSS/style.css\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
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
      out.write("    height: 750px;\n");
      out.write("    padding: 50px;\n");
      out.write("    border: 5px solid orange;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-image: url(\"./donate.jpg\");\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("          function validate()\n");
      out.write("          {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("         if( document.registration.name.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.registration.name.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.registration.email.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Email!\" );\n");
      out.write("            document.registration.email.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.registration.phno.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.registration.phno.focus() ;\n");
      out.write("            return false;\n");
      out.write("         } \n");
      out.write("          if( document.registration.amt.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your Address!\" );\n");
      out.write("            document.registration.amt.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.registration.fname.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.registration.fname.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         if( document.registration.lname.value === \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your name!\" );\n");
      out.write("            document.registration.lname.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("           if( document.registration.cno.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.registration.cno.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("          if( document.registration.scode.value == \"\" )\n");
      out.write("         {\n");
      out.write("            alert( \"Please provide your number!\" );\n");
      out.write("            document.registration.scode.focus() ;\n");
      out.write("            return false;\n");
      out.write("         }\n");
      out.write("              \n");
      out.write("\n");
      out.write("  \n");
      out.write("         var letters = /^[A-Za-z ]+$/;  \n");
      out.write("         var phoneno = /^\\d{10}$/; \n");
      out.write("         var numbers = /^[0-9]+$/;\n");
      out.write("          var age = /^\\d{2}$/; \n");
      out.write("         var eid = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("      if(!document.registration.name.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("       if(!document.registration.email.value.match(eid)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid email id\");  \n");
      out.write("        return false;  \n");
      out.write("        }  \n");
      out.write("      if(!document.registration.phno.value.match(phoneno)) \n");
      out.write("      {\n");
      out.write("        alert(\"Enter 10 digits phone number\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        if(!document.registration.amt.value.match(numbers)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid Amount\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        if(!document.registration.cno.value.match(numbers)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid Card No\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        if(!document.registration.scode.value.match(numbers)) \n");
      out.write("        {\n");
      out.write("        alert(\"Enter valid Security code\");  \n");
      out.write("        return false;  \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        if(!document.registration.fname.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('First Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("      if(!document.registration.lname.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Last Name Sholud Conatin Only Alphabets');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("      \n");
      out.write("      \n");
      out.write("       if(!document.registration.country.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Enter Valid Country');  \n");
      out.write("      return false;  \n");
      out.write("      } if(!document.registration.state.value.match(letters))  \n");
      out.write("      {   \n");
      out.write("      alert('Enter Valid State');  \n");
      out.write("      return false;  \n");
      out.write("      } \n");
      out.write("        \n");
      out.write("          \n");
      out.write("} \n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      </script>\n");
      out.write("\n");
      out.write("<title>\n");
      out.write("  fund\n");
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div id=\"header\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>Donate for Beti Bachao Beti Padhao</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("\t\t<div id=\"newsblog\">\n");
      out.write("\t\t\t<center><div class=\"aside\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("<p>\n");
      out.write("By choosing to donate you are taking an active role in  bringing a difference to the life of \n");
      out.write("many children.\n");
      out.write("Thank you for your support.\n");
      out.write("</p><br>\n");
      out.write("<h3><b><u>Your Information:</b></u></h3>\n");
      out.write("<hr  width=10%>\n");
      out.write("<form name=\"registration\" method=\"post\" action=\"../FundServlet.do\" onsubmit=\"return validate()\" >\n");
      out.write("\n");
      out.write("<table>  \n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Name:</td><td><input type=\"text\"  name=\"name\">\n");
      out.write("</td></tr>\n");
      out.write("<tr class=\"spaceunder\">\n");
      out.write("<td>Email:</td><td><input type=\"email\" name=\"email\">\n");
      out.write("</td></tr>\n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Phone No:</td><td><input type=\"text\" name=\"phno\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Amount:</td><td><input type=\"text\" name=\"amt\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Ngo Name:</td><td><input type=\"text\" name=\"ngoname\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"spaceunder\"><th>\n");
      out.write("<h3><b><u>Payment details:</b></u></h3>\n");
      out.write("<hr width=10%>\n");
      out.write("</th></tr>\n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Name:</td><td><input type=\"text\"  name=\"fname\" placeholder=\"First Name\">\n");
      out.write("<input type=\"text \"placeholder=\"Last name\" name=\"lname\"></td></tr>\n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Card Number:</td><td><input type=\"text\"  name=\"cno\"></td></tr>\n");
      out.write("<tr class=\"spaceunder\"><td>\n");
      out.write("Security Code:</td><td><input type=\"text\"  name=\"scode\"></td></tr>\n");
      out.write("<tr class=\"spaceunder\"><td>Country:</td><td><input type=\"text\"  name=\"country\"></td></tr>\n");
      out.write("<tr class=\"spaceunder\"><td>State:</td><td><input type=\"text\"  name=\"state\"></td></tr>\n");
      out.write("</table>\n");
      out.write(" <center><input type=\"submit\" class=\"btn btn-success\" value=\"Donate\"></input></center>\n");
      out.write("</form>\n");
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
