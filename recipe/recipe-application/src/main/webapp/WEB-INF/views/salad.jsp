<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>


<jsp:include page="_header.jsp"/>
	<!----MAIN----------------------------------------------------------------------------------------------------->
    <main role="main">
        <div class="container my-5" id="mostPopular">
            <div class="card-group my-3">
                <div class="row row-cols-1 row-cols-md-3 g-4">
                	<c:forEach items="${recipes}" var="recipe">
                    <div class="col">
                        <div class="card h-100 shadow-sm">
                            <img class="card-img-top" src="css/image/food2.jpg">
                            <div class="card-body">
                                    <h4 class="card-title">${recipe.name}</h4>
                                    <p class="card-text">${recipe.description}</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <button type="button" class="btn btn-outline-secondary"><a href="/recipe/${recipe.id}">View</a></button>
                                    </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </main>
<jsp:include page="_footer.jsp"/>
