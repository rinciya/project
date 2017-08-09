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
    height: 750px;
    padding: 50px;
    border: 5px solid orange;
}
body {
    background-image: url("./donate.jpg");
    }
</style>


   <script type="text/javascript">
          function validate()
          {
              
              
         if( document.registration.name.value === "" )
         {
            alert( "Please provide your name!" );
            document.registration.name.focus() ;
            return false;
         }
         if( document.registration.email.value === "" )
         {
            alert( "Please provide your Email!" );
            document.registration.email.focus() ;
            return false;
         }
         if( document.registration.phno.value === "" )
         {
            alert( "Please provide your number!" );
            document.registration.phno.focus() ;
            return false;
         } 
          if( document.registration.amt.value === "" )
         {
            alert( "Please provide your Address!" );
            document.registration.amt.focus() ;
            return false;
         }
         if( document.registration.fname.value === "" )
         {
            alert( "Please provide your name!" );
            document.registration.fname.focus() ;
            return false;
         }
         if( document.registration.lname.value === "" )
         {
            alert( "Please provide your name!" );
            document.registration.lname.focus() ;
            return false;
         }
         
           if( document.registration.cno.value == "" )
         {
            alert( "Please provide your number!" );
            document.registration.cno.focus() ;
            return false;
         }
          if( document.registration.scode.value == "" )
         {
            alert( "Please provide your number!" );
            document.registration.scode.focus() ;
            return false;
         }
              

  
         var letters = /^[A-Za-z ]+$/;  
         var phoneno = /^\d{10}$/; 
         var numbers = /^[0-9]+$/;
          var age = /^\d{2}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
      if(!document.registration.name.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
       if(!document.registration.email.value.match(eid)) 
        {
        alert("Enter valid email id");  
        return false;  
        }  
      if(!document.registration.phno.value.match(phoneno)) 
      {
        alert("Enter 10 digits phone number");  
        return false;  
        }
        if(!document.registration.amt.value.match(numbers)) 
        {
        alert("Enter valid Amount");  
        return false;  
        }
        if(!document.registration.cno.value.match(numbers)) 
        {
        alert("Enter valid Card No");  
        return false;  
        }
        if(!document.registration.scode.value.match(numbers)) 
        {
        alert("Enter valid Security code");  
        return false;  
        }
        
        if(!document.registration.fname.value.match(letters))  
      {   
      alert('First Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
      if(!document.registration.lname.value.match(letters))  
      {   
      alert('Last Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
      
      
       if(!document.registration.country.value.match(letters))  
      {   
      alert('Enter Valid Country');  
      return false;  
      } if(!document.registration.state.value.match(letters))  
      {   
      alert('Enter Valid State');  
      return false;  
      } 
        
          
} 

      
      
      </script>

<title>
  fund
</title>
</head>
<body>
   <div id="header">
		<div>
			<h1>Donate for Beti Bachao Beti Padhao</h1>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
<br>

<form name="registration" method="post" action="../FundServlet.do" onsubmit="return validate()" >

<table> 
    <tr class="spaceunder"><th>
<h3><b>Your Information:</b></h3>
<hr width=10%>
</th></tr>
<tr class="spaceunder"><td>
Name:</td><td><input type="text"  name="name">
</td></tr>
<tr class="spaceunder">
<td>Email:</td><td><input type="email" name="email">
</td></tr>
<tr class="spaceunder"><td>
Phone No:</td><td><input type="text" name="phno"></td>
</tr>
<tr class="spaceunder"><td>
Amount:</td><td><input type="text" name="amt"></td>
</tr>
<tr class="spaceunder"><td>
Ngo Name:</td><td><input type="text" name="ngoname"></td>
</tr>
<tr class="spaceunder"><th>
<h3><b>Payment details:</b></h3>
<hr width=10%>
</th></tr>
<tr class="spaceunder"><td>
Name:</td><td><input type="text"  name="fname" placeholder="First Name">
<input type="text "placeholder="Last name" name="lname"></td></tr>
<tr class="spaceunder"><td>
Card Number:</td><td><input type="text"  name="cno"></td></tr>
<tr class="spaceunder"><td>
Security Code:</td><td><input type="text"  name="scode"></td></tr>
<tr class="spaceunder"><td>Country:</td><td><input type="text"  name="country"></td></tr>
<tr class="spaceunder"><td>State:</td><td><input type="text"  name="state"></td></tr>
</table>
 <center><input type="submit" class="btn btn-success" value="Donate"></input></center>
</form>
</div>
			</div></center></div>
			</div>

</body>
</html>
