<%-- 
    Document   : viewexperiences
    Created on : Oct 22, 2015, 7:11:47 PM
    Author     : Rinciya
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
                       tr.spaceunder > td
{
  padding-bottom: 1em;
}
                      .div1 {
 border-radius: 25px;
background-color:#FFEFDC;
 width: 800px;
    margin: auto; 
    height: 650px;
    padding: 50px;
    border: 5px solid orange;
}
        </style>
    </head>
    <body>
         <%@ include file="header.jsp" %>
        <center><h1> View Experiences </h1></center>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
        
          <center> <table>
            <c:forEach var="exp" items="${comments}"  >
            <tr class="spaceunder"><td><b>Name:</td><td><c:out value="${exp.name}" /> </td> </tr>
            <tr class="spaceunder"><td><b>Comments:</td><td><c:out value="${exp.comments}" /></td> </tr>
            <tr><td colspan="2">-------------------------------------------------</td></tr>
            
            </c:forEach>
         
            </table>
          </center> 
</div>
			</div></center></div>
			</div>
            <%@ include file="footer.jsp" %>
    </body>
</html>
