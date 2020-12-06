<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="_header.jsp"/>
<main role="main">
   <div class="container mt-5">
      <div class="row">
         <div class="col-md-4">
            <h4>Create new Recipe</h4>
            <form action="/addrecipemethod" method="post">
               <input type="hidden" id="userId" value="${userid}" name="userId"/>
               <!-- Name input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example3">Recipe name</label>
                  <input type="text" id="name" name="name" class="form-control" />
               </div>
               <!-- Description input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="description">Description</label>
                  <textarea id="description" name="description" class="md-textarea form-control" rows="3"></textarea>
               </div>
               <!-- ingredients input -->
               <div class="form-outline mb-2">
                  <label class="form-label" for="ingredients">Ingredients</label>
                  <input type="text" id="ingredients" name="ingredients" class="form-control" />
               </div>
               <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example4">Category</label>
                  <select name="type" id="type" class="form-control">
                     <option value="selectcategory">Select category...</option>
                     <option value="0">Breakfast</option>
                     <option value="1">Dinner</option>
                     <option value="2">Dessert</option>
                     <option value="3">Soup</option>
                     <option value="4">Salad</option>
                     <option value="5">Snack</option>
                  </select>
               </div>
               <!-- Submit button -->
               <button type="submit" class="btn btn-success btn-block mb-4">
               Create
               </button>
            </form>
         </div>
         <div class="col-md-8"></div>
      </div>
   </div>
</main>
<jsp:include page="_footer.jsp"/>