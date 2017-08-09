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
  <script src="script.js"></script>

          <script type="text/javascript">
          function validate()
          {
              
              
         if( document.user.NAME.value === "" )
         {
            alert( "Please provide your name!" );
            document.user.NAME.focus() ;
            return false;
         }
          if( document.user.ADDRESS.value === "" )
         {
            alert( "Please provide your Address!" );
            document.user.ADDRESS.focus() ;
            return false;
         }
         
         if( document.user.GENDER.value === "" )
         {
            alert( "Please provide your GENDER!" );
            document.user.GENDER.focus() ;
            return false;
         }
         if( document.user.AGE.value === "" )
         {
            alert( "Please provide your AGE!" );
            document.user.AGE.focus() ;
            return false;
         }
         if( document.user.CONTACTNO.value === "" )
         {
            alert( "Please provide your CONTACT NO!" );
            document.user.CONTACTNO.focus() ;
            return false;
         }
         if( document.user.EMAILID.value == "" )
         {
            alert( "Please provide your Email!" );
            document.user.EMAILID.focus() ;
            return false;
         }
          var letters = /^[A-Za-z ]+$/;  
         var phoneno = /^\d{10}$/; 
         var numbers = /^[0-9]+$/;
         var age = /^\d{2}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;  
         var alphanum = /^[0-9a-zA-Z  ]+$/;  
         
      if(!document.user.NAME.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } if((document.user.GENDER.value)!="female" && (document.GENDER.vname.value)!="male" )
           {
                alert("You must select male or female");
                return false;
           } 
       if(!document.user.AGE.value.match(age)) 
      {
        alert("Enter 2 digits");  
        return false;  
        }
        
   
      if(!document.user.CONTACTNO.value.match(phoneno)) 
      {
        alert("Enter 10 digits phone number");  
        return false;  
        }
        
       if(!document.user.EMAILID.value.match(eid)) 
        {
        alert("Enter valid email id");  
        return false;  
        } 
          }  
      </script>
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
    height:850px;
    padding: 50px;
    border: 5px solid orange;
}




</style>


<title>User</title>
</head>
    <body><%@ include file="header.jsp" %>
       
         <center><h4>User Registration Form</h4></center><br><br><br>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>

 

<center>
<form name="user" action="../UserRegServlet.do" method="POST" onsubmit="return validate()">
            <table border="0">
                <tbody>
                   <tr class="spaceunder">
                        <td>NAME</td>
                        <td><input type="text" name="NAME" value="" size="40" /></td>
                    </tr>
                    <tr class="spaceunder">
                        <td>ADDRESS</td> 
                        <td><input type="text" name="ADDRESS" value="" size="40" /></td>
                    </tr>
                    <tr class="spaceunder">
                        <td>GENDER</td>
                        <td><input type="text" name="GENDER" value="" size="40" /></td>
                    </tr>
                    
                    <tr class="spaceunder">
                        <td>EMAIL ID</td> 
                        <td><input type="text" name="EMAILID" value="" size="40"/></td>
                    </tr>
                     <tr class="spaceunder">
                        <td>PASSWORD</td> 
                        <td><input type="password" name="PASSWORD" value="" size="40"/></td>
                    </tr>
                            <tr class="spaceunder">
                        <td>AGE</td>
                        <td><input type="text" name="AGE" value="" size="40"/></td>
                    </tr>
                    
                    <tr class="spaceunder">
                        <td>CONTACT NO</td>
                        <td><input type="text" name="CONTACTNO" value="" size="40"/></td>
                    </tr>
                </tbody>
            </table>
            <center><input type="submit" value="REGISTER" name="REGISTER" /> </center><br>
            <center> <input type="reset" value="RESET" name="RESET" /> </center>
        </form>
</center>
  </div>
			</div></center></div>
			</div>
</body>
</html>
