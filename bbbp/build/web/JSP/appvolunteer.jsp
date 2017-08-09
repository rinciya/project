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
			<h2><center><b>registered volunteers for CAMPAIGNS</b></center></h2>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
        

<center><table>
      <c:forEach var="eve" items="${event}">
            <tr ><td>Name</td><td><c:out value="${eve.vname}" /> </td> </tr>
            <tr ><td>email</td><td><c:out value="${eve.vemail}" /></td> </tr>
        <tr ><td>contact no</td><td><c:out value="${eve.vmno}" /></td> </tr>
        <tr ><td>campaign</td><td><c:out value="${eve.campaign}" /></td> </tr>
        <tr ><td>ngoemail</td><td><c:out value="${eve.ngoname}" /></td> </tr>
              <tr><td colspan="2">-------------------------------------------------</td></tr>
             </c:forEach>
   </table></center>
         </div>
			</div></center></div>
			</div>                           
    </body>
</html>

