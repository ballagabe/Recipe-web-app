<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<jsp:include page="_header.jsp"/>



 <main role="main">
        <div class="container py-5">
            <div class="row">
                <table style="height: 100px;">
                      <tr>
                        <td class="align-baseline col-md-2">
                            <img class="img-thumbnail" style="width: 200px" src="css/image/profile.jpg" alt="">
                        </td>
                        <td class="align-bottom col-md-10">
                            <h2>Nickname</h2>
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
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food2.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food3.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food4.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food4.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
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
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food2.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food3.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food4.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
                                    <div class="col">
                                        <!--card-->
                                        <div class="card h-100 shadow-sm">
                                            <img class="card-img-top" src="css/image/food4.jpg">
                                            <div class="card-body">
                                                    <h4 class="card-title">Beef soup</h4>
                                                    <p class="card-text">Best soup in the world!</p>
                                                    <div class="d-flex justify-content-between align-items-center">
                                                        <button type="button" class="btn btn-outline-secondary">View</button>
                                                    </div>
                                            </div>
                                        </div>
                                        <!-- Card -->
                                    </div>
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
                                  <h6>First name:</h6>
                                  <p>First</p>
                                  <h6>Last name:</h6>
                                  <p>Last</p>
                                  <h6>Nickname:</h6>
                                  <p>Nick</p>
                                  <h6>Email:</h6>
                                  <p>valami@mail.com</p>

                              </div>
                              <div class="col-md-2"></div>
                              <!--Edit Profile-->
                              <div class="col-md-4">
                                <h5>Edit Profile</h5>
                                <form>
                                  <div class="row mb-4">
                                    <div class="col">
                                      <div class="form-outline">
                                        <label class="form-label" for="form3Example1">First name</label>
                                        <input type="text" id="form3Example1" class="form-control" placeholder="First name"/>
                                        
                                      </div>
                                    </div>
                                    <div class="col">
                                      <div class="form-outline">
                                        <label class="form-label" for="form3Example2">Last name</label>
                                        <input type="text" id="form3Example2" class="form-control" placeholder="Last name"/>
                                        
                                      </div>
                                    </div>
                                  </div>
                                  <!-- Nickname input -->
                                  <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example3">Nickname</label>
                                    <input type="text" id="form3Example3" class="form-control" placeholder="Nickname"/>
                                  </div>
                                
                                  <!-- Email input -->
                                  <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example3">Email address</label>
                                    <input type="email" id="form3Example3" class="form-control" placeholder="Email"/>
                                    
                                  </div>
                                
                                  <!-- Password input -->
                                  <div class="form-outline mb-4">
                                    <label class="form-label" for="form3Example4">Password</label>
                                    <input type="password" id="form3Example4" class="form-control" placeholder="Password"/>
                                    
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