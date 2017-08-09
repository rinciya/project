
<!DOCTYPE html>

    <html>
<head>
    <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
 <script type="text/javascript">
     function validate()
          {
              
              
         if( document.adoption.maleapp.value === "" )
         {
            alert( "Please provide your name!" );
            document.adoption.maleapp.focus() ;
            return false;
         }
         if( document.adoption.mage.value == "" )
         {
            alert( "Please provide your Age!" );
            document.adoption.mage.focus() ;
            return false;
         }
         if( document.adoption.femaleapp.value === "" )
         {
            alert( "Please provide your name!" );
            document.adoption.femaleapp.focus() ;
            return false;
         }
         if( document.adoption.fage.value == "" )
         {
            alert( "Please provide your Age!" );
            document.adoption.fage.focus() ;
            return false;
         }
         
         if( document.adoption.email.value == "" )
         {
            alert( "Please provide your Email!" );
            document.adoption.email.focus() ;
            return false;
         }
          
         if( document.adoption.tno.value == "" )
         {
            alert( "Please provide your number!" );
            document.adoption.tno.focus() ;
            return false;
         }  
          if( document.adoption.mno.value == "" )
         {
            alert( "Please provide your number!" );
            document.adoption.mno.focus() ;
            return false;
         }  
         if( document.adoption.mm.value == "" || document.adoption.mm.value == "")
         {
            alert( "Please provide your monthly income!" );
            document.adoption.mm.focus() ;
            return false;
         }
     
  
          var numbers = /^[0-9]+$/;
          var letters = /^[A-Za-z]+$/;  
         var phoneno = /^\d{10}$/; 
         var tno = /^\d{8}$/; 
          var age = /^\d{2}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
      if(!document.adoption.maleapp.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
      if(!document.adoption.mage.value.match(age)) 
      {
        alert("Enter 2 digits");  
        return false;  
        }
      if(!document.adoption.femaleapp.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      }
      if(!document.adoption.fage.value.match(age)) 
      {
        alert("Enter 2 digits");  
        return false;  
        }
      if(!document.adoption.email.value.match(eid)) 
      {
        alert("Enter valid email id");  
        return false;  
        }  
      if(!document.adoption.tno.value.match(tno)) 
      {
        alert("Enter 8 digits telephone number");  
        return false;  
        }
        if(!document.adoption.mno.value.match(phoneno)) 
        {
        alert("Enter 10 digits phone number");  
        return false;  
        }
        if(!document.adoption.mm.value.match(numbers)) 
        {
        alert("Enter valid Monthly Income");  
        return false;  
        }
        if(!document.adoption.mf.value.match(numbers)) 
        {
        alert("Enter valid Monthly Income");  
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
    height: 1200px;
    padding: 50px;
    border: 5px solid orange;
}
</style>

 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>form Page</title>

</head>
<body>
    
 <div id="header">
		<div>
			<h1>yes you can adopt..!!</h1>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
<img src="../images/who_can_adopt.jpg" height=200 width=200 /></center>
<p>
<form name="adoption"  action="../AdoptionServlet.do"  onsubmit="return(validate())" >
    <table>
        <tr >
<td><b><u>Male Applicant:</b></u></td></tr>
<tr ><td>
a)Name:</td><td><input type="text" name="maleapp">  </td></tr>
<tr ><td>b)Age:</td><td><input type="text" name="mage"> </td>
</tr>
<tr ><td>
<b><u>Female Applicant:</b></u></td></tr>
<tr ><td>
a)Name:</td><td><input type="text" name="femaleapp"> </td></tr>
<tr ><td>
 b)Age:</td><td><input type="text" name="fage"></td></tr>
 <tr >
<td><b>Address:</b></td> <td><input type="text" name="address"></td></tr>
 <tr><td><b>E-Mail Address:</b></td><td><input type="email" name="email"></td></tr>
<tr><td><b>Telephone number:</b></td><td><input type="text" name="tno"></td></tr>
<tr><td><b>Mobile number:</b></td><td><input type="text" name="mno"></td></tr>
<tr><td><b><u>Male Applicant</b></u></td></tr>
<tr><td>a)Profession:</td><td><input type="text" name="pm"></td></tr> 
<tr><td>b)Monthly Income:</td><td><input type="text" name="mm"></td></tr>

<tr><td><b><u>Female Applicant</b></u></td></tr>
<tr><td>a)Profession:</td><td><input type="text" name="pf"></td></tr>
 <tr><td>b)Monthly Income:</td><td><input type="text" name="mf"></td></tr>
 <tr><td><b><u>Adoption Details</b></u></td></tr>
  <tr><td>a)Name of the girl:</td><td><input type="text" name="girlname"></td></tr>
   <tr><td>b)Name taken from NGO:</td><td><input type="text" name="ngoname"></td></tr>
<tr><td>
       <b> Reason for adopting a girl child:<b></td><td><textarea name="reason" rows="4" cols="60"></textarea></td></tr>
</table>
<center><input type="submit" class="btn btn-success" value="Submit"></input></center>
</form>
  </form>
</div>
			</div></center></div>
			</div>

</body>
</html>
