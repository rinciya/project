<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>NGO Website Template</title>
	<link rel="stylesheet" type="text/css" href="bbbp/CSS/style.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	 <%@ include file="header.jsp" %>
	<div id="body">
		<div class="header">
			<div>
				<img src="/bbbp/images/people.jpg" alt="Image">
				<div id="tagline">
					<h1>Save Lives</h1>
					
				</div>
				<div class="section">
					
					<p>
						Help a girl child to evovle .Help her in different parts of her life .so that she might get a better education and better life to live in. let make this world as heaven for girls not hell.
					</p>
					<div class="btn-group">
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Login <span class="caret"></span></button>
      <ul class="dropdown-menu" role="menu">
        <li><a href="login_user.jsp">User</a></li>
        <li><a href="login_ngo.jsp">Ngo</a></li>
        <li><a href="login_volunteer.jsp">Volunteer</a></li>
      </ul>
  </div>
				</div>
			</div>
		</div>
		<div class="body">
			<div>
				<div class="figure">
					<img src="/bbbp/images/hands.jpg" alt="Image">
					
				</div>------------
				<div class="news">
					<h2>Ngo registration</h2>
					<ul>
						<li>
							
							<h3><a href="ngoregform.jsp">ngo registeration</a></h3>
							<p>
								Ngo can register to this website to make pepole aware about the problems girls are facing and ask for help.
							</p>
						</li>
						<li>
							<h2>User Registration</h2>
							
							<p>
								Make a registeration to the site and help ngo with donation and adoption .
							</p>
						</li>
					</ul>
					<span class="link"><a href="userregform.jsp">user</a></span>
				</div>
				<div class="help">
					<h2>How To Help</h2>
					<img src="/bbbp/images/finger.jpg" alt="Image">
					<h3>Register as a volunteer</h3>
					<p>
						Help us more by registering your self as volunteer
					</p>
					<span class="link"><a href="vregisterationform.jsp">Get Involved</a></span>
				</div>
			</div>
		</div>
	</div>
    <%@ include file="footer.jsp" %>
  
</body>
</html>