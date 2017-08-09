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
       <div id="header">
		<div>
			<center><h4>Give Your Little Time To Join With Us In Our Campus</h4></center>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>


<p>
    <center>
    <form name="user" action="../ExperienceServlet.do" method="POST">
            <table border="0">
                <tbody>
                    <tr class="spaceunder">
                        <td>NGO name </td>
                        <td><input type="text" name="name" value="" size="40" /></td>
                    </tr>
                    <tr class="spaceunder">
                        <td>Contact </td>
                        <td><input type="text" name="contact" value="" size="40"/></td>
                    </tr>
                   <tr class="spaceunder">
                        <td>Email id </td>
                        <td><input type="text" name="email" value="" size="40"/></td>
                    </tr>
                <tr class="spaceunder">
                        <td>Campaign info</td>
                        <td><input type="text" name="comments" value="" size="40"/></td>
                    </tr>
                </tbody>
            </table>
        <br><br>
            <input type="submit" value="SUBMIT" name="SUBMIT" />
            <input type="reset" value="CLEAR" name="CLEAR" />
    </form></center>
</div>
			</div></center></div>
			</div>

    </body>
</html>
