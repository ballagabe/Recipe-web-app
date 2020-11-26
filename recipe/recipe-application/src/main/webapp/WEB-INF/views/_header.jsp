<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
	<div class="header">	
		<form:form action="/logout">
            <input type="submit" value="Logout"/>
    	</form:form>
     	User: <sec:authentication property="name"/>
    </div>