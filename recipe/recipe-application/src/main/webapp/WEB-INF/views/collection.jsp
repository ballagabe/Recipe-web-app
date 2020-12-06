<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<jsp:include page="_header.jsp"/>
   <head>
      <link href="../css/bootstrap.css" rel="stylesheet">
      <link href="../css/index.css" rel="stylesheet">
      <script src="../../webapp/js/bootstrap.js"></script>
   </head>
 <main role="main">
        <div class="container py-5">
            <div class="row">
                <table style="height: 100px;">
                      <tr>
                        <td class="align-baseline col-md-2">
                            <img class="img-thumbnail" style="width: 200px" src="../css/image/profile.jpg" alt="">
                        </td>
                        <td class="align-bottom col-md-10">
                            <h2><sec:authentication property="name"/></h2>
                        </td>
                      </tr>
                  </table>
            </div>
            <div class="row pt-3">
                <!--PROFILE MENU-->
                <ul class="nav nav-tabs" id="myTab" role="tablist">
                    <li class="nav-item">
                      <a class="nav-link active" id="home-tab" data-toggle="tab" href="#myDiary" role="tab" aria-controls="home"
                        aria-selected="true">My Diary</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" id="profile-tab" data-toggle="tab" href="#favorite" role="tab" aria-controls="profile"
                        aria-selected="false">Favorite</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" id="contact-tab" data-toggle="tab" href="#myAccount" role="tab" aria-controls="contact"
                        aria-selected="false">My Account</a>
                    </li>
                  </ul>
                  <!--PROFILE MENU-->
                  <!--MENU TARTALOM-->
                  <div class="tab-content" id="myTabContent">
                    <!--myDiary-->
                    <div class="tab-pane fade show active" id="myDiary" role="tabpanel" aria-labelledby="home-tab">
                        <div class="container my-5" id="mostPopular">
                            <h1 class="text-left">My Recipes</h1>
                            <!--cardgroup-->
                            <div class="card-group my-3">
                                <div class="row row-cols-1 row-cols-md-3 g-4">
                                <c:forEach items="${ownRecipes}" var="ownRecipes">
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food4.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">${ownRecipes.name}</h4>
                                                    <p class="card-text">${ownRecipes.description}</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary"><a href="/recipe/${ownRecipes.id}">View</a></button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--myDiary-->
                    <!--favorite-->
                    <div class="tab-pane fade" id="favorite" role="tabpanel" aria-labelledby="profile-tab">
                        <div class="container my-5" id="mostPopular">
                            <h1 class="text-left">Favortie Recipes</h1>
                            <!--cardgroup-->
                            <div class="card-group my-3">
                                <div class="row row-cols-1 row-cols-md-3 g-4">
                                    <c:forEach items="${favRecipes}" var="favRecipes">
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food4.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">${favRecipes.name}</h4>
                                                    <p class="card-text">${favRecipes.description}</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary"><a href="/recipe/${favRecipes.id}">View</a></button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--favorite-->
                    <!--myAccount-->
                    <div class="tab-pane fade" id="myAccount" role="tabpanel" aria-labelledby="contact-tab">
                        <div class="container mt-5">
                            <div class="row">
                                <h2>My Account</h2>
                                <hr>
                                <!--Profile Data-->
                              <div class="col-md-4">
                                  <h6>Name: ${username}</h6>
	                              <h6>Nickname: ${usernick}</h6>

                              </div>
                              <div class="col-md-2"></div>
                              <!--Edit Profile-->
                              <div class="col-md-4">
                                <h5>Edit Profile</h5>
                                <form action="/updateprofile" method="post">
                                <input type="hidden" id="oldnickname" name="oldnickname" value="${useremail}"/>
                                  <div class="row mb-4">
                                    <div class="col">
                                      <div class="form-outline">
                                        <label class="form-label" for="username">Name</label>
                                        <input type="text" id="username" name="username" class="form-control" placeholder="Name"/>
                                      </div>
                                    </div>
                                  </div>
                                  <div class="form-outline mb-4">
                                    <label class="form-label" for="nickname">Nickname</label>
                                    <input type="text" id="nickname" name="nickname" class="form-control" placeholder="Nickname"/>
                                  </div>
                                  <!-- Password input -->
                                  <div class="form-outline mb-4">
                                    <label class="form-label" for="password">Password</label>
                                    <input type="password" id="password" name="password" class="form-control" placeholder="Password"/>
                                  </div>
                                  <!-- Submit button -->
                                  <button type="submit" class="btn btn-success btn-block mb-4">
                                    Update
                                  </button>
                                
                                </form>
                    
                              </div>
                              <div class="col-md-2"></div>
                            </div>
                          </div>
                    </div>
                    <!--myAccount-->
                  </div>
                  <!--MENU TARTALOM-->
            </div>
        </div>
    </main>



<jsp:include page="_footer.jsp"/>