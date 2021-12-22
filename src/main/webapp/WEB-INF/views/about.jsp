<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %> <!-- To enable JSP Expression Language -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- For adding JSTL, for using forEach and expression language -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about</title>
</head>
<body>
	<h1>This is the about pageee</h1>

	<h1> Name is ${name }</h1>
	<h2>Age is ${age }</h2>
	
	<c:forEach var = "item" items = "${friend }"> <!-- Using JSTL for using displaying a list in JSP with expression language for friend -->
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>


<%-- 	
	<% /* Scriplet Tag */
 		String name = (String) request.getAttribute("name");
 		Integer age = (Integer) request.getAttribute("age");
	%>
--%>
<%-- 	<h1>Name is <%=name %></h1> --%>
<%-- 	<h1>Age is <%= age %></h1> --%>