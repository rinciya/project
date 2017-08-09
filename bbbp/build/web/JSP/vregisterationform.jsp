<%-- 
    Document   : vregisterationform
    Created on : Oct 2, 2015, 10:20:46 AM
    Author     : Rinciya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Volunteer Registration form</title>
        <style>
#back
{
  background: url(../images/beautiful-girl-holding-green-banner-1448919.jpg) ;
  border: 1px solid black;
    width:1320px;
   height:600px;
}
 ul, li {
    margin:0;
    padding:0;
    list-style-type:none;
}
#pswd_info {
    position:absolute;
    bottom:-75px;
    bottom: -115px\9; /* IE Specific */
    right:55px;
    width:250px;
    padding:15px;
    background:#fefefe;
    font-size:.875em;
    border-radius:5px;
    box-shadow:0 1px 3px #ccc;
    border:1px solid #ddd;
}
#pswd_info h4 {
    margin:0 0 10px 0;
    padding:0;
    font-weight:normal;
}#pswd_info::before {
    content: "\25B2";
    position:absolute;
    top:-12px;
    left:45%;
    font-size:14px;
    line-height:14px;
    color:#ddd;
    text-shadow:none;
    display:block;
}
.invalid {
    background:url(../images/invalid.png) no-repeat 0 50%;
    padding-left:22px;
    line-height:24px;
    color:#ec3f41;
}
.valid {
    background:url(../images/valid.png) no-repeat 0 50%;
    padding-left:22px;
    line-height:24px;
    color:#3a7d34;
}
#pswd_info {
    display:none;
}
    </style>
    <script src="http://code.jquery.com/jquery-1.7.min.js"></script>
<script src="script.js"></script>

          <script type="text/javascript">
          function validate()
          {
              
              
         if( document.registration.vname.value === "" )
         {
            alert( "Please provide your name!" );
            document.registration.vname.focus() ;
            return false;
         }
          if( document.registration.vaddress.value === "" )
         {
            alert( "Please provide your Address!" );
            document.registration.vaddress.focus() ;
            return false;
         }
         
         if( document.registration.vemail.value === "" )
         {
            alert( "Please provide your Email!" );
            document.registration.vemail.focus() ;
            return false;
         }
          
         if( document.registration.vgender.value === "" )
         {
            alert( "Please provide your Gender!" );
            document.registration.vemail.focus() ;
            return false;
         }
          if( document.registration.vmno.value ==="" )
         {
            alert( "Please provide your number!" );
            document.registration.vemail.focus() ;
            return false;
         }  if( document.registration.vage.value === "" )
         {
            alert( "Please provide your number!" );
            document.registration.vemail.focus() ;
            return false;
         }
              

  
         var letters = /^[A-Za-z]+$/;  
         var phoneno = /^\d{8}$/; 
          var age = /^\d{2}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
      if(!document.registration.vname.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
      
      
   
      if(!document.registration.vmno.value.match(phoneno)) 
      {
        alert("Enter 10 digits phone number");  
        return false;  
        }
         if(!document.registration.vage.value.match(age)) 
      {
        alert("Enter 2 digits");  
        return false;  
        }
        
           if(!document.registration.vemail.value.match(eid)) 
      {
        alert("Enter valid email id");  
        return false;  
        }  
} 

      
      
      </script>
        
    </head>
<body>
    <%@ include file="header.jsp" %>
   <h1>Volunteer registration</h1>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
<form name="registration"  action="../VRegisterServlet.do" onsubmit="return(validate())">
<table><tr><td>USERNAME:</td><td><input name="vname" type="text" size="30"><br><br></td></tr>
<tr><td>PASSWORD:</td><td><input id="pswd" name="vpassword" type="password" size="30"><br><br></td></tr>
<div id="pswd_info">
    <h4>Password must meet the following requirements:</h4>
    <ul>
        <li id="letter" class="invalid">At least <strong>one letter</strong></li>
        <li id="capital" class="invalid">At least <strong>one capital letter</strong></li>
        <li id="number" class="invalid">At least <strong>one number</strong></li>
        <li id="length" class="invalid">Be at least <strong>8 characters</strong></li>
    </ul>
</div>
<tr><td>ADDRESS:</td><td><input name="vaddress" type="text" size="30"><br><br></td></tr>
<tr><td>GENDER:</td><td><input name="vgender" type="text" size="30"><br><br></td></tr>

<tr><td>AGE:</td><td><input name="vage" type="text" size="30"><br><br></td></tr>
<tr><td>MOBILE NO:</td><td><input name="vmno" type="text" size="30"><br><br></td></tr>
<tr><td>EMAIL ID:</td><td><input name="vemail" type="text" size="30"><br><br></td></tr></table>

<input type="submit" value="submit"></center>
</div>
			</div></center></div>
			</div>
    </body>
</html>
