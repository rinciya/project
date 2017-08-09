<%-- 
    Document   : eventregister
    Created on : Oct 23, 2015, 4:50:41 AM
    Author     : PAVILION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script type="text/javascript">
          function validate()
          {
              
              
         if( document.user.vname.value === "" )
         {
            alert( "Please provide your name!" );
            document.user.vname.focus() ;
            return false;
         } 
         if( document.user.vemail.value === "" )
         {
            alert( "Please provide your Email!" );
            document.user.vemail.focus() ;
            return false;
         }
          if( document.user.campaign.value === "" )
         {
            alert( "Please Enter Event Name!" );
            document.user.campaign.focus() ;
            return false;
         }
        
         if( document.user.ngoname.value === "" )
         {
            alert( "Please provide Ngo Name!" );
            document.user.ngoname.focus() ;
            return false;
         }
         if( document.user.vmno.value === "" )
         {
            alert( "Please provide your Contact No.!" );
            document.user.vmno.focus() ;
            return false;
         }
         var letters = /^[A-Za-z ]+$/;  
         var phoneno = /^\d{10}$/; 
         var numbers = /^[0-9]+$/;
         var age = /^\d{2}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;  
         
      if(!document.user.vname.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
       if(!document.user.vemail.value.match(eid)) 
        {
        alert("Enter valid email id");  
        return false;  
        } 
        if(!document.user.vmno.value.match(phoneno)) 
      {
        alert("Enter 10 digits phone number");  
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
    height:500px;
    padding: 50px;
    border: 5px solid orange;
}</style>
</head>
    <body>
      <div id="header">
		<div>
			 <h1>Register for Events...!!!</h1>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
       
        
         <form name="user" action="../EventRegServlet.do" method="POST"  onsubmit="return(validate())">
            <table border="0">
                <tbody>
                   <tr class="spaceunder">
                        <td>Name:</td>
                        <td><input type="text" name="vname" value="" size="40" /></td>
                    </tr>
                     <tr class="spaceunder">
                        <td>Email id:</td> 
                        <td><input type="email" name="vemail" value="" size="40" /></td>
                    </tr>
                     <tr class="spaceunder">
                        <td>Name of the Event:</td>
                        <td><input type="text" name="campaign" value="" size="40" /></td>
                    </tr>
                    
                     <tr class="spaceunder">
                        <td>Name of the NGO conducting the event:</td> 
                        <td><input type="text" name="ngoname" value="" size="40"/></td>
                    </tr>
                    
                    
                     <tr class="spaceunder">
                        <td>Contact number:</td>
                   
                     
                    <td><input type="text" name="vmno"/></td>
                    </tr>
</tbody>
            </table>
            <center><input type="submit" value="REGISTER" name="add" /> </center>
        </form>
       </p>
    </div>
			</div></center></div>
			</div>
   
    </body>
</html>
        
