<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="_header.jsp"/>
	<!----MAIN----------------------------------------------------------------------------------------------------->
    <main role="main">
        <!--random-->
        <div class="container my-5">
            <h1 class=" text-center">Random recipe</h1>
            <div class="row">
                <div class="col-md-4">
                </div>
                <div class="col-md-4">
                    <!--card-->
                    <div class="card mb-4 shadow-sm">
                        <img class="card-img-top" src="css/image/food.jpg">
                        <div class="card-body">
                            <h4 class="card-title">${recipes.get(random).name}</h4>
                            <p class="card-text">${recipes.get(random).description}</p>
                            <hr>
                            <div class="d-flex justify-content-between align-items-center">
                                <button type="button" class="btn btn-outline-secondary"><a href="/recipe/${recipes.get(random).id}">View</a></button>
                            </div>
                        </div>
                    </div>
                    <!-- Card -->
                </div>
                <div class="col-md-4">
                </div>
            </div>
        </div>
        <hr>
        
        <div class="jumbotron my-5">
            <h4 class="text-center">Search Recipe</h4>
            <div class="row">
                    <div class="row mb-4">
                        <div class="col-md-4"></div>
                        <div class="col-md-4 text-right">
                            <div class="form-outline">
                                <input class="form-control form-control-sm ml-3" id="searchInput" style="height: 40px;" type="text" placeholder="Search"
                            aria-label="Search">
                            </div>
                        </div>
                        <div class="col-md-4 text-left">
                            <div class="form-outline searchbtn">
                                <button class="btn  btn-outline-secondary" id="searchButton">
                                    <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-search" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M10.442 10.442a1 1 0 0 1 1.415 0l3.85 3.85a1 1 0 0 1-1.414 1.415l-3.85-3.85a1 1 0 0 1 0-1.415z"/>
                                        <path fill-rule="evenodd" d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
                                    </svg>
                                </button>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
        
        <hr>
        <div class="container my-5" id="mostPopular">
            <!--cardgroup-->
            <div class="card-group my-3">
                <div class="row row-cols-1 row-cols-md-3 g-4">
                	<c:forEach items="${searchrecipes}" var="recipe">
                    <div class="col">
                        <!--card-->
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
                        <!-- Card -->
                    </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </main>
	
	
	
<jsp:include page="_footer.jsp"/>

<script>
	document.querySelector("#searchButton").addEventListener("click",() =>{
		window.location.replace("/index?s=" + document.querySelector("#searchInput").value);
	});
</script>