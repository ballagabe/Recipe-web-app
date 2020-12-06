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
   <div class="container mt-5">
      <div class="row">
         <div class="col-md-4">
            <h4>Update Recipe</h4>
            <form action="/recipemodifymethod" method="post">
               <input type="hidden" id="userId" value="${recipeid}" name="id"/>
               <input type="hidden" id="userId" value="${recipename}" name="name"/>
               <!-- Name input -->
               <div class="form-outline mb-4">
                  <h3><label class="form-label" for="form3Example3">${recipename}</label></h3>
               </div>
               <!-- Description input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="description">Description</label>
                  <textarea id="description" name="description"  class="md-textarea form-control" rows="3">${recipedescription}</textarea>
               </div>
               <!-- ingredients input -->
               <div class="form-outline mb-2">
                  <label class="form-label" for="ingredients">Ingredients</label>
                  <input type="text" id="ingredients" value="${recipeingredients}" name="ingredients" class="form-control" />
               </div>
               <!-- Submit button -->
               <button type="submit" class="btn btn-success btn-block mb-4">
               		Update
               </button>
            </form>
         </div>
         <div class="col-md-8"></div>
      </div>
   </div>
</main>

<jsp:include page="_footer.jsp"/>