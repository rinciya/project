<%-- 
    Document   : viewcamapign
    Created on : Oct 29, 2015, 9:27:42 AM
    Author     : Rinciya
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
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
    height: 1000px;
    padding: 50px;
    border: 5px solid orange;
}
</style>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div id="header">
		<div>
			<h2><center><b>UPCOMING CAMPAIGNS</b></center></h2>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>

<center><table>
      <c:forEach var="camp" items="${campaigns}">
            <tr class="spaceunder"><td>Name</td><td><c:out value="${camp.name}" /> </td> </tr>
            <tr class="spaceunder"><td>Contact</td><td><c:out value="${camp.contact}" /></td> </tr>
        <tr class="spaceunder"><td>email</td><td><c:out value="${camp.email}" /></td> </tr>
        <tr class="spaceunder"><td>campaigns</td><td><c:out value="${camp.campaigns}" /></td> </tr>
              <tr><td colspan="2">-------------------------------------------------</td></tr>
             </c:forEach>
   </table></center></div>
      
			</div></center></div>
			</div>
    </body>
</html>
