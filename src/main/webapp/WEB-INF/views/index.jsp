<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page isELIgnored = "false " %> <!-- To enable JSP Expression Language --> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Home Page</h1>
	<h1>This is called by home controller by url /home</h1>
	
	<% /* Scriplet Tag */
		String name = (String) request.getAttribute("name");
		Integer age = (Integer) request.getAttribute("age");
		ArrayList<String> friend = (ArrayList<String>) request.getAttribute("friend");
	%> <!-- Write all the object making code in scriplet tag -->
	
	<h1>Name is <%=name %></h1> <!-- Use Expression tag to access the variables made in the scriplet tag -->
	<h1>Age is <%= age %></h1>
	<h1>Friends are: </h1>
	
	<!-- For printing the list of friends -->
	<!-- Inorder to add HTML in between the java code in the scriplet tag, divide the code in different tags -->
	<%
		for(String s: friend){
	%>
		<h1><%=s %></h1> <!-- Keep the java code in the scriplet tag and the expression tag in the h1, because this has to be printed bold -->
	<%
		}
	%>
</body>
</html>