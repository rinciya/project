<%-- 
    Document   : parent
    Created on : Mar 19, 2016, 7:20:58 PM
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
			<h1>TOGETHER WE CAN CHANGE THIS WORLD..!!</h1>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
<h2><center><b>LIST OF PARENTS AVAILABLE FOR ADOPTION</b></center></h2>
 <table>
            <c:forEach var="parent" items="${parents}">
            <tr class="spaceunder"><td>male:</td><td><c:out value="${parent.male}" /> </td> </tr>
            <tr class="spaceunder"><td>Age:</td><td><c:out value="${parent.mage}" /></td> </tr>
           <tr class="spaceunder"><td>female:</td><td><c:out value="${parent.female}" /></td> </tr>
             <tr class="spaceunder"><td>age:</td><td><c:out value="${parent.fage}" /></td> </tr>
              <tr class="spaceunder"><td>Address: </td><td><c:out value="${parent.address}" /></td> </tr>
              <tr class="spaceunder"><td>email:</td><td><c:out value="${parent.email}" /> </td> </tr>
            <tr class="spaceunder"><td>phone no:</td><td><c:out value="${parent.tno}" /></td> </tr>
           <tr class="spaceunder"><td>mobile no:</td><td><c:out value="${parent.mno}" /></td> </tr>
             <tr class="spaceunder"><td>pro:</td><td><c:out value="${parent.mprofession}" /></td> </tr>
              <tr class="spaceunder"><td>in: </td><td><c:out value="${parent.mm}" /></td> </tr>
              <tr class="spaceunder"><td>pro</td><td><c:out value="${parent.fprofession}" /> </td> </tr>
            <tr class="spaceunder"><td>in:</td><td><c:out value="${parent.fm}" /></td> </tr>
           <tr class="spaceunder"><td>reason:</td><td><c:out value="${parent.reason}" /></td> </tr>
             <tr class="spaceunder"><td>girlname:</td><td><c:out value="${parent.girlname}" /></td> </tr>
              <tr class="spaceunder"><td>ngoname: </td><td><c:out value="${parent.ngoname}" /></td> </tr>
              <tr><td colspan="2">-------------------------------------------------</td></tr>
             </c:forEach>
          
 </table>
</div>
			</div></center></div>
			</div>
    </body>
</html>
