<%-- 
    Document   : appvolunteer
    Created on : Mar 24, 2016, 9:52:11 AM
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
			<h2><center><b>donations for ngo</b></center></h2>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
        

<center><table>
      <c:forEach var="don" items="${donate}">
            <tr class="spaceunder"><td>Name</td><td><c:out value="${don.name}" /> </td> </tr>
            <tr class="spaceunder"><td>email</td><td><c:out value="${don.email}" /></td> </tr>
        <tr class="spaceunder"><td>contact no</td><td><c:out value="${don.phno}" /></td> </tr>
        <tr class="spaceunder"><td>amount</td><td><c:out value="${don.amt}" /></td> </tr>
        <tr class="spaceunder"><td>ngoname</td><td><c:out value="${don.ngoname}" /></td> </tr>
              <tr><td colspan="2">-------------------------------------------------</td></tr>
             </c:forEach>
   </table></center>
                                    </div>
			</div></center></div>
			</div>
    </body>
</html>

