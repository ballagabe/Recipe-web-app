<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <form action="/addHotel" method="post">
	  	<label for="name">Recipe name:</label><br>
	  	<input type="text" id="name" name="name"><br>
	  	<label for="capacity">Capacity:</label><br>
	  	<input type="text" id="capacity" name="capacity"><br><br>
	  	<input type="submit" value="Add hotel">
	</form>
</body>
</html>
