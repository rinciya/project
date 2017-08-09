
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
    height: 450px;
    padding: 50px;
    border: 5px solid orange;
}
</style>
<script type="text/javascript">
          function validate()
          {
              
              
         if( document.user.name.value === "" )
         {
            alert( "Please provide your name!" );
            document.user.name.focus() ;
            return false;
         }
        
         if( document.user.email.value == "" )
         {
            alert( "Please provide your Email!" );
            document.user.email.focus() ;
            return false;
         }
          if( document.user.comments.value === "" )
         {
            alert( "Please enter ur experiences!" );
            document.user.comments.focus() ;
            return false;
         }
          
             
         var letters = /^[A-Za-z ]+$/;  
         var phoneno = /^\d{10}$/; 
         var numbers = /^[0-9]+$/;
         var age = /^\d{2}$/; 
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

  
         if(!document.user.name.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
       if(!document.user.email.value.match(eid)) 
        {
        alert("Enter valid email id");  
        return false;  
        }   
    }    
      
</script>



<title>Experiences</title>
</head>
    <body>
         <%@ include file="header.jsp" %>
      
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
<center><H4><b>SHARE YOUR EXPERIENCES WITH US</b></h2></center>
<br><br>
    <form name="user" action="../ExperienceServlet.do" method="POST" onsubmit="return validate()">
            <table border="0">
                <tbody>
                    <tr class="spaceunder">
                        <td><b>Name: </b></td>
                        <td><input type="text" name="name" value="" size="40" /></td>
                    </tr>
                    <tr class="spaceunder">
                        <td><b>Email ID:</b> </td>
                        <td><input type="text" name="email" value="" size="40"/></td>
                    </tr>
                    <tr class="spaceunder">
                        <td><b>Comments:</b></td>
                        <td><input type="text" name="comments" value="" size="40" class="resizedTextbox"/></td>
                    </tr>
                </tbody>
            </table>
<br>
         <center>   <input type="submit" class="btn btn-success" value="Submit" name="SUBMIT" />
            <input type="reset" class="btn btn-success" value="Clear" name="Clear" /></center>
    </form>
</div>
			</div></center></div>
			</div>
            <%@ include file="footer.jsp" %>
    
    </body>
</html>