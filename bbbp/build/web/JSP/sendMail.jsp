

<jsp:useBean id="mail" scope="session" class="jMail.Mail" />
<jsp:setProperty name="mail" property="to" param="to" />
<jsp:setProperty name="mail" property="from" value="Java.Mail.wtproject2016@gmail.com" />
<jsp:setProperty name="mail" property="smtpServ" value="smtp.gmail.com" />
<jsp:setProperty name="mail" property="subject" value="adoption details" />
<jsp:setProperty name="mail" property="message" value="For adoption of a girl you need to have some legal documents and also while meeting the ngo you need to carry your photos .And also the ngo will take decision of with girl you can adopt." />
 <%
String to = mail.getTo();
int result;
result = mail.sendMail();
if(result == 0){
    out.println(" Mail Successfully Sent to "+to);
}
else{
    out.println(" Mail NOT Sent to "+to);
}  
%>