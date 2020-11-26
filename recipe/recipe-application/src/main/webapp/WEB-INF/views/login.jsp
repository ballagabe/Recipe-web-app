<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
        <title>Hotel Application</title>
    	<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/hotel.css">
	</head>

    <h1>Welcome to Hotel Application</h1>
    <body>
    	<c:if test="${param.error != null}">
        <div>
            Invalid username and password.
        </div>
        </c:if>
        <c:if test="${param.logout != null}">
        <div>
            You have been logged out.
        </div>
        </c:if>
        <form:form action="/login" method='POST'>
        <table>
		<tr>  
            <td><label> User Name : <input type="text" name="username"/> </label></td>
		</tr>        
		<tr>            
            <td><label> Password: <input type="password" name="password"/> </label></td>
        </tr>
		<tr>            
            <td colspan="2"><input type="submit" value="Login"/></td>
        </tr>
        </table>
        </form:form>
    </body>
</html>