<%-- 
    Document   : share
    Created on : 20 Oct, 2015, 8:44:01 PM
    Author     : Rajasi
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
        <title>JSP Page</title>
    </head>
    <body>
      
        <div id="header">
		<div>
			<h1>Our Upcoming Campaigns</h1>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
        
           <table>
            <c:forEach var="camp" items="${get}"  >
            <tr><td>NGO NAME:</td><td><c:out value="${camp.ngoname}" /> </td> </tr>
            <tr><td>CAMPAIGNS:</td><td><c:out value="${camp.campaign}" /></td> </tr>
            <tr><td>---------------------------------------------------------</td></tr>
            <tr> </tr>
            </c:forEach>
          
            </table>
        					</div>
			</div></center></div>
			</div>
      
    </body>
</html>
