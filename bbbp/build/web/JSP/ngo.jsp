<%-- 
    Document   : ngo
    Created on : Oct 23, 2015, 4:25:12 AM
    Author     : Rinciya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ngo Page</title>
        <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
    </head>
    

      <body>
	<div id="header">
		<div>
                    <h1>Ngo</h1>>
				</div>
	</div>
	<div id="body">
		<div id="newsblog">
			<div class="aside">
				<div>
					<h2><form action="/bbbp/AppDonation.do"method="post">
    <input type="hidden" value="<%=request.getAttribute("email")%>" name="email"/>
    <input type="submit" value="click here for donation details"/>
</form></h2>
    <a href="" class="figure"><img src="/bbbp/images/doctors.jpg" alt="Image"></a>
					<p>
						The donation provivded can help the needy girls .Check the net balance available in the account.
                                                <form action="/bbbp/AmountServlet.do"method="post">
    <input type="hidden" value="<%=request.getAttribute("email")%>" name="email"/>
    <input type="submit" value="click here for balance"/>
</form>
					</p>
				</div>
				<ul>
					<li>
						<h2><a href="/bbbp/JSP/addcampaign.jsp">add campaign</a></h2>
						
						<p>
							Add the recent campaign so that the volunteers can view it and register for the event.
						</p>
					</li>
					<li>
						<h2><a href="/bbbp/JSP/ngogirl.jsp">add girls</a></h2>
						
						<p>
							You can replace all this text with your own text. You can remove any link to our website from this website template, you&#39;re free to use this website template without linking back to us.
						</p>
					</li>
					<li>
						<h2><form action="/bbbp/AppCampServlet.do"method="post">
    <input type="hidden" value="<%=request.getAttribute("email")%>" name="email"/>
    <input type="submit" value="click here for participation "/>
</form></h2>
						
						<p>
							Check the list of volunteers registered for the event.
						</p>
					</li>
					<li>
						
    <h2><form action="/bbbp/ParentServlet.do"method="post">
    <input type="hidden" value="<%=request.getAttribute("email")%>" name="email"/>
    <input type="submit" value="click here for adoption details"/>
</form></</h2>
						
						<p>
							check the list of users applied for a girl adoption.
						</p>
					</li>
				</ul>
			</div>
			<div class="sidebar">
			</div>
</body>
</html>

