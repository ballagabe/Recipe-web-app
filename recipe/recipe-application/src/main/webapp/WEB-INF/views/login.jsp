<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="_headerout.jsp"/>
<main role="main">
   <div class="container mt-5">
      <div class="row">
         <div class="col-md-4"></div>
         <div class="col-md-4">
            <h4>Sign in</h4>
            <form:form action="/login" method='POST'>
               <!-- Email input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="form2Example1">Email address</label>
                  <input type="text" id="email" name="username" class="form-control" placeholder="Email"/>
               </div>
               <!-- Password input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="form2Example2">Password</label>
                  <input type="password" name="password" class="form-control" placeholder="Password" />
               </div>
               <!-- Submit button -->
               <input type="submit" class="btn btn-success btn-block mb-4" value="Login"/>
               <c:if test="${param.error != null}">
                  <div>
                     <h4 class="text-center text-danger">Invalid username or password.</h4>
                  </div>
               </c:if>
               <!-- Register buttons -->
               <div class="text-center">
                  <p>Not a member? <a href="/register">Register</a></p>
               </div>
            </form:form>
         </div>
      </div>
   </div>
</main>
<jsp:include page="_footer.jsp"/>