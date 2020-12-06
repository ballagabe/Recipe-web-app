<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form id="logout" action="/logout">
	<a href='#' class="nav-link" onclick='this.parentNode.submit(); return false;'>Logout</a>
</form:form>

<script>
	document.getElementById("logout").submit(); 
</script>
