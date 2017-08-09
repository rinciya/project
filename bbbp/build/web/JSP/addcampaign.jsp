<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script type="text/javascript">
          function validate()
          {
              
              
          if( document.user.ngoname.value === "" )
         {
            alert( "Please provide your name!" );
            document.user.ngoname.focus() ;
            return false;
         }
          if( document.user.ngocontact.value === "" )
         {
            alert( "Please provide your Contact Details!" );
            document.user.ngocontact.focus() ;
            return false;
         }
         if( document.user.ngoemail.value === "" )
         {
            alert( "Please provide you Email!" );
            document.user.ngoemail.focus() ;
            return false;
         }
         if( document.user.campaign.value === "" )
         {
            alert( "Please valid Campaign Name!" );
            document.user.campaign.focus() ;
            return false;
         }
         
         var letters = /^[A-Za-z ]+$/;  
         var phoneno = /^\d{10}$/; 
         var numbers = /^[0-9]+$/;
          var age = /^\d{2}$/;
         var eid = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            
        if(!document.user.ngoname.value.match(letters))  
      {   
      alert('Name Sholud Conatin Only Alphabets');  
      return false;  
      } 
       if(!document.user.ngocontact.value.match(phoneno)) 
      {
        alert("Enter 10 digits phone number");  
        return false;  
        }
      if(!document.user.ngoemail.value.match(eid)) 
        {
        alert("Enter valid email id");  
        return false;  
        }   
          }
 
</script>
        

      
<title>addcampaign</title>
</head>
    <body>
        

 <div id="header">
		<div>
			<h1>TOGETHER WE CAN CHANGE THIS WORLD..!!</h1>
				</div>
	</div>
        <div id="body">
		<div id="newsblog">
			<center><div class="aside">
				<div>
    <form name="user" action="../CampaignServlet.do" method="POST" onsubmit="return(validate())">
            <table>
                <tbody>
                    <tr>
                        <td><br><b>Name of the NGO:</b> </td>
                        <td><br><input type="text" name="ngoname" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td><br><b>Contact Number:</b>           </td>
                        <td><br><input type="text" name="ngocontact" value="" size="40"/></td>
                    </tr>
                    <tr>
                        <td><br><b>Email Id:</b> </td>
                        <td><br><input type="text" name="ngoemail" value="" size="40"/></td>
                    </tr>
                    <tr>
                        <td><br><b>Campaign Details:</b></td>
                        <td><br><textarea  name="campaign"  rows="3" cols="43" ></textarea></td>
                    </tr>
                </tbody>
            </table>
            <center><input type="submit" class="btn btn-success" value="Submit" name="SUBMIT" /></center>
    </form>
</div>
			</div></center></div>
			</div>
    
    </body>
</html>