<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <c:forEach items="${recipes}" var="recipe">
	    <h1>Recipe NAME: ${recipe.name}</h1>
	    <h1>Recipe DESCRIPTION: ${recipe.description}</h1>
	</c:forEach>
</body>
</html>
