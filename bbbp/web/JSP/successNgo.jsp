<%-- 
    Document   : success
    Created on : 16 Sep, 2015, 9:16:16 AM
    Author     : universe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="model.Customer"%>

<html>
    <head>
         <link rel="stylesheet" type="text/css" href="/bbbp/CSS/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h1>User has successfully logged in!</h1>
<h2> NGO Campaigns</h2>
        Campaigns are a platform to raise awareness about our work with children and enables each one of us to participate in this movement for child rights.
Current Campaign
<h3>#HealthyStart</h3>
The first five years is an important phase in every child's life especially a Girl. But thousands of children do not have access to proper healthcare, nutrition and early childhood care, resulting in irreversible damage to their physical, emotional and cognitive growth.

<h3>#Women Empowerment</h3>
•	7398 Community Awareness activities and 900 Health Workshops conducted
•	234 women and adolescent girls were trained to be Change Agents
•	Over 25,000 community members sensitised on issues concerning women rights
•	Educational support provided to 47 girls through full scholarships

<h3>#Education</h3>
Education

•	18,953 Girl-child directly provided education
•	87% of the total eligible students mainstreamed
•	51% of the beneficiaries were girl children
•	1264 school drop-outs resumed education
•	100 libraries set up across 19 states
•	54 computer centres established across 15 states

<h3>#Healthcare</h3>
•	Mobile Hospital programme benefitted 310,047 people directly
•	96 multi-speciality health Camps were conducted, meeting healthcare needs of 24391 people
•	Women amounted to 54% of the total beneficiaries
•	18,697 children benefitted from School Health Programme

<h3>Info on our most successful programme</h3>
<h2>Swabhiman</h2>
Various studies, as well as our experience, have shown that when we help women and empower them, the whole society benefits. Their families are healthier, children go to school, income levels improve and communities become more prosperous. But unfortunately in India, far from being empowered, most women are denied even their basic rights like health, education, employment and a respectable status in society.
        <jsp:useBean id="customer" class="model.Customer" scope="request"/>
            
            <jsp:getProperty name="customer" property="email"/>
        <br />
            
                   
     </body>
</html>
