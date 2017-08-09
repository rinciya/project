<%-- 
    Document   : login_user
    Created on : Oct 20, 2015, 11:06:40 PM
    Author     : Rinciya
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>   <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body> <body><%@ include file="header.jsp" %>
        
			 <br><b><h1>Login as user</h1></b>
		
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>


                            <form  method="post" action="${pageContext.request.contextPath}/ULoginServlets.do">
                                
                                          Username:<input type="text" name="EMAILID" placeholder="email id" autofocus required><br>
                                            <br>Password:<input type="password" name="PASSWORD" placeholder="Password"required><br>
                                             <br><br><input name="submit" type="submit">
                                     </form>
                                    </div>
			</div></center></div>
			</div> 
      
    </body>
</html>
