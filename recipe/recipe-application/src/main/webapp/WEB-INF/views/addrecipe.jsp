<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="_header.jsp"/>
<form action="/addrecipemethod" method="post">
   <label for="name">Recipe name:</label><br>
   <input type="text" id="name" name="name"><br>
   <label for="capacity">uid:</label><br>
   <input type="text" id="userId" name="userId"><br><br>
   <label for="name">ing:</label><br>
   <input type="text" id="ingredients" name="ingredients"><br>
   <label for="name">desc:</label><br>
   <input type="text" id="description" name="description"><br>
   <label for="name">type:</label><br>
   <input type="text" id="type" name="type"><br>
   <input type="submit" value="Add recipe">
</form>
<main role="main">
   <div class="container mt-5">
      <div class="row">
         <div class="col-md-4">
            <h4>Create new Recipe</h4>
            <form>
               <!-- Name input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example3">Name</label>
                  <input type="text" id="form3Example3" class="form-control" />
               </div>
               <!-- Description input -->
               <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example3">Description</label>
                  <textarea id="form75" class="md-textarea form-control" rows="3"></textarea>
               </div>
               <!-- ingredients input -->
               <div class="form-outline mb-2">
                  <label class="form-label" for="form3Example3">Ingredients</label>
               </div>
               <!--ingredients checkboxs-->
               <!-- Default inline 1-->
               <div class="custom-control custom-checkbox custom-control-inline">
                  <input type="checkbox" class="custom-control-input" id="defaultInline1">
                  <label class="custom-control-label" for="defaultInline1">só</label>
               </div>
               <!-- Default inline 2-->
               <div class="custom-control custom-checkbox custom-control-inline">
                  <input type="checkbox" class="custom-control-input" id="defaultInline2">
                  <label class="custom-control-label" for="defaultInline2">kenyér</label>
               </div>
               <!-- Default inline 3-->
               <div class="custom-control custom-checkbox custom-control-inline">
                  <input type="checkbox" class="custom-control-input" id="defaultInline3">
                  <label class="custom-control-label" for="defaultInline3">hús</label>
               </div>
               <div class="form-outline my-2">
                  <input type="text" id="form3Example3" class="form-control" />
               </div>
               <button type="submit" class="btn btn-secondary btn-sm btn-block mb-4">
               		Record ingredient
               </button>
               <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example4">Category</label>
                  <select name="cars" id="cars" class="form-control">
                     <option value="selectcategory">Select category...</option>
                     <option value="breakfast">Breakfast</option>
                     <option value="dinner">Dinner</option>
                     <option value="dessert">Dessert</option>
                     <option value="soup">Soup</option>
                     <option value="salad">Salad</option>
                     <option value="snack">Snack</option>
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