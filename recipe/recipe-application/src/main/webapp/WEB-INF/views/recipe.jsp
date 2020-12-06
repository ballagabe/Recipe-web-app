<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="_header.jsp"/>
   <head>
      <link href="../css/bootstrap.css" rel="stylesheet">
      <link href="../css/index.css" rel="stylesheet">
      <script src="../js/bootstrap.js"></script>
   </head>
<main role="main">
        <div class="container py-5">
            <div class="row">
                <h2 class="pb-2">        
	                <c:forEach items="${recipe}" var="recipe">
			        	${recipe.name}
			        </c:forEach></h2>
                <h5>
		      		<c:forEach items="${recipe}" var="recipe">
			        	${recipe.type}
			        </c:forEach>
                </h5>
            </div>
            <div class="row pt-3">
                <div class="col-md-4 ingredients">
                    <img src="pics/food.jpg" style="width: 100%;" alt="">
                </div>
                <div class="col-md-2">
                    <p>Ingredients</p>
                    <ul class="list-group">
                        <li class="list-group-item">
                 		    <c:forEach items="${recipe}" var="recipe">
					        	${recipe.ingredients}
					        </c:forEach>
                        </li>
                    </ul>
                </div>
                <div class="col-md-6">
                    <p>Description</p>
                    <div class="jumbotron">
						<c:forEach items="${recipe}" var="recipe">
				        	${recipe.description}
				        </c:forEach>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 text-center pt-5">
                        <c:choose>
						    <c:when test="${my==1}">
                                <button type="button" class="btn btn-success"><a href="/recipemodify?id=${id}">Edit</a></button>
						        <button type="button" class="btn btn-success"><a href="/deleterecipe?id=${id}">Delete</a></button>
						    </c:when>    
						    <c:otherwise>
						    <form action="/saverecipe" method="post">
						    	<input type="hidden" name="userid" value="${userid}">
						    	<input type="hidden" name="recipeid" value="${id}">
						        <input type="submit" class="btn btn-success" value="Save">
						    </form>
						    </c:otherwise>
						</c:choose>
                    </div>
                </div>
            </div>
        </div>
    </main>

<jsp:include page="_footer.jsp"/>