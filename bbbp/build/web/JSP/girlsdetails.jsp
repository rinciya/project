<%-- 
    Document   : girlsdetails
    Created on : Oct 21, 2015, 7:42:03 PM
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
			<h2><center><b>LIST OF CHILDREN AVAILABLE FOR ADOPTION</b></center></h2>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
    <center>
      

 <table>
            <c:forEach var="girlsdetails" items="${girlsDetails}">
            <tr class="spaceunder"><td>Name</td><td><c:out value="${girlsdetails.gname}" /> </td> </tr>
            <tr class="spaceunder"><td>Age:</td><td><c:out value="${girlsdetails.gage}" /></td> </tr>
           <tr class="spaceunder"><td>Persuing:</td><td><c:out value="${girlsdetails.persuring}" /></td> </tr>
             <tr class="spaceunder"><td>About:</td><td><c:out value="${girlsdetails.about}" /></td> </tr>
              <tr class="spaceunder"><td>Ngo name : </td><td><c:out value="${girlsdetails.ngoname}" /></td> </tr>
              <tr><td colspan="2">-------------------------------------------------</td></tr>
             </c:forEach>
          
 </table></center>
       </div>
			</div></center></div>
			</div>
    </body>
</html>
