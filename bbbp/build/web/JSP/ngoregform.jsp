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
    height: 850px;
    padding: 50px;
    border: 5px solid orange;
}
</style>




<script>
function validateForm() {
    var x = document.forms["myform"]["email"].value;
    if (x == null || x == "") {
        alert("Email must be filled out");
        return false;
         var x = document.forms["myform"]["regno"].value;
    if (x == null || x == "") {
        alert("Registration number must be filled out");
        return false;
        
    }
}</script>



<script>
function myFunction() {
String captcha = (String) session.getAttribute("captcha");
  String code = (String) request.getParameter("code");

  if (captcha != null && code != null) {

    if (!captcha.equals(code)) 
    {alert("Incorrect");
    return false;}
</script>

<title>abc</title>
</head>
 


<body>
    <body><%@ include file="header.jsp" %>
 <center><h7><b>NGO REGISTRATION FORM</b></h7></center>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>

<br><br>
<form name="myform" onsubmit="return validateForm()" method="post" action="../NGORegisterServlet.do" >
<table>
<tr class="spaceunder">
<td><b>ID</b>:</td><td><input type="text" name="ngoid"></td></tr>
     
<tr class="spaceunder">
<td><b>State:</b></td><td><input type="text" name="state"></td></tr>
<tr class="spaceunder"><td><b>District:</b></td><td><input type="text" name="district"></td>
</tr>

<tr class="spaceunder">
<td><b>Registration number:</b></td><td><input type="text" name="regno"></td>
</tr>
<tr class="spaceunder">
<td><b>Name of Organization:</b></td><td><input type="text" name="noo"></td>
</tr>
<tr class="spaceunder">
    <td><b>Email Address:</b></td><td><input type="email" name="email"></td>
</tr>


<tr class="spaceunder">
    <td><b>Password:</b></td><td><input class="password" type="password" name="password"></td>
<tr class="spaceunder">


<tr class="spaceunder">
<td><b>Phone number:</b></td><td><input type="text" name="phno"></td>
</tr>
<tr class="spaceunder">
<td><b>Address:</b></td><td><input type="text" name="address"></td>
</tr>
<tr class="spaceunder">
<td><b>Activities:</b></td><td><input type="text" name="acti"></td>
</tr>

<tr class="spaceunder">
<td><b>Enter the characters in the image below:</b></td>
<td><input type="text" name="code"></td>
</tr>

</table>
    <br>
<center><img src="http://localhost:8080/bbbp/Captcha.do"> </center>

<center>
<br>
<input type="submit" value="Submit" class="btn btn-success" name="s"></center>
</form>
</div>
			</div></center></div>
			</div>

</body>
</html>