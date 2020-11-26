<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="_header.jsp"/>


    <c:forEach items="${recipes}" var="recipe">
	    <h1>Recipe NAME: ${recipe.name}</h1>
	    <h1>Recipe DESCRIPTION: ${recipe.description}</h1>
	</c:forEach>
	
	
<jsp:include page="_footer.jsp"/>