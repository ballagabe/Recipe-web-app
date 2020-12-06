<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="_headerout.jsp"/>
<main role="main">
   <div class="container mt-5">
      <div class="row">
         <div class="col-md-4"></div>
         <div class="col-md-4">
            <h4>Register</h4>
            <form action="/registermethod" method="post">
               <!-- Email input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="email">Email address</label>
                  <input type="text" id="email" name="email" class="form-control" placeholder="Email"/>
               </div>
               <!-- Name input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="fullname">Full name</label>
                  <input type="text" id="username" name="username" class="form-control" placeholder="Full name"/>
               </div>
               <!-- Nickname input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="nickname">Nickname</label>
                  <input type="text" id="nickname" name="nickname" class="form-control" placeholder="Email"/>
               </div>
               <!-- Password input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="password">Password</label>
                  <input type="password" name="password" class="form-control" placeholder="Password" />
               </div>
               <!-- Submit button -->
               <input type="submit" class="btn btn-success btn-block mb-4" value="Register"/>
            </form>
              <!-- Register buttons -->
               <div class="text-center">
                  <p>Are you a member? <a href="/login">Login</a></p>
               </div>
         </div>
         <div class="col-md-4"></div>
      </div>
   </div>
</main>
<jsp:include page="_footer.jsp"/>