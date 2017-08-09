<%-- 
    Document   : index
    Created on : 18 Oct, 2015, 11:53:19 AM
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

<script>  
function validate(){  
var name=document.user.NAME.value;  
var password=document.user.PASSWORD.value;  
var status=false;  
  
if(name.length<1){  
JSP/userreg.getElementById("nameloc").innerHTML=  
"<img src='unchecked.gif'/> Please enter your name";  
status=false;  
}else{  
JSP/userreg.getElementById("nameloc").innerHTML="<img src='checked.gif'/>";  
status=true;  
}  
if(password.length<6){  
document.getElementById("passwordloc").innerHTML=  
"<img src='unchecked.gif'/> Password must be at least 6 char long";  
status=false;  
}else{  
document.getElementById("passwordloc").innerHTML="<img src='checked.gif'/>";  
status=true;  
}  
return status;  
} 

</script>  

<title>User</title>
</head>
    <body>
       <div id="header">
		<div>
			<center><h4>Enter Girls' Details</h4></center>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
  

 
       <form name="user" action="../NgogirlServlet.do" method="POST">
            <table border="0">
                <tbody>
                    <tr class="spaceunder">
                        <td>Name of the girl:</td>
                        <td><input type="text" name="gname" value="" size="40" /></td>
                    </tr>
                    <tr class="spaceunder">
                        <td>Age:</td> 
                        <td><input type="text" name="gage" value="" size="40" /></td>
                    </tr>
                    <tr class="spaceunder">
                        <td>Pursuing:</td>
                        <td><input type="text" name="pursuing" value="" size="40" /></td>
                    </tr>
                    
                    <tr class="spaceunder">
                        <td>Details:</td> 
                        <td><input type="text" name="about" value="" size="40"/></td>
                    </tr>
                    
                    <tr class="spaceunder">
                        <td>NGO: </td>  
                        <td><input type="text" name="noo" value="" size="40"/></td>
                    </tr>
                </tbody>
            </table>
           <br>
            <center><input type="submit" value="Submit" name="add" /> </center>
        </form>
  
        </div>
			</div></center></div>
			</div>
    </body>
</html>
