<%-- 
    Document   : feedback
    Created on : Apr 8, 2016, 5:46:08 PM
    Author     : Rinciya
--%>
<%-- 
    Document   : exeriences
    Created on : 18 Oct, 2015, 7:20:44 PM
    Author     : Rajasi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">   
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<style>
tr.spaceunder > td
{
  padding-bottom: 1em;
}
.div1 {
 border-radius: 25px;
background-color:#FFFFCC;
 width: 800px;
    margin: auto; 
    height:500px;
    padding: 50px;
    border: 5px solid orange;
}




</style>

<title>CAMPAIGNS</title>
</head>
    <body>
         <%@ include file="header.jsp" %>
        
        <h4 align="center" >Provide Us Feedback</h4>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>


    

<br><br><br><br>
<p>
    <center>
    <form name="user" action="../FeedbackServlet.do" method="POST">
           
             
                <textarea type="text" name="feedback" rows="14" cols="50" class="spaceunder">
                        
                        
                    </textarea>
                          
        <br><br>
            <input type="submit" value="SUBMIT" name="SUBMIT" />
            <input type="reset" value="CLEAR" name="CLEAR" />
    </form></center>
</div>
			</div></center></div>
			</div>
   <%@ include file="footer.jsp" %>
    </body>
</html>

