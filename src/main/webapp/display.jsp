<%@page import="org.nsgacademy.Student"%>
<jsp:useBean id="studentBean" class="org.nsgacademy.Student" scope="request"/>

<h2>Student Details</h2>
Name: <jsp:getProperty name="studentBean" property="name"/> <br>
Age: <jsp:getProperty name="studentBean" property="age"/> <br>