<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AddTasks</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ToDo List</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="TodoApp.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a  href="AddTasks.jsp"  class="btn btn-outline-success">Add Tasks</a>
        </li>
       
      </ul>
     
    </div>
  </div>
</nav>
<h1 class="text-center">Add Tasks</h1>

<form action="AddTasks" method="post">


  <div class="mb-3">
    <label for="title" class="form-label">Titre</label>
    <input type="titre" class="form-control"  name="titre">
    
    <div class="mb-3">
    <label for="description" class="form-label">Description</label>
    <input type="description" class="form-control"  name="description">
  </div>
  
    
  <div class="col-md-4">
    <label for="status" class="form-label">Status</label>
    <select id="status" class="form-select" name="status">
      <option selected>Choose...</option>
      <option>Pas encore</option>
      <option>en cours</option>
      <option>Terminé</option>
    </select>
  </div>
  
  <div class="mb-3">
    <label for="deadline" class="form-label">Deadline</label>
    <input type="deadline" class="form-control" name="deadline">
  </div>
  
 
  
   <div class="col-md-4">
    <label for="nom_categorie" class="form-label">Categories</label>
    <select id="nom_categorie" class="form-select" name="nom_categorie">
      <option selected>Choose...</option>
      <option>Présentation</option>
      <option>Veille</option>
      <option>Recherche</option>
    </select>
  </div>
 
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
</body>
</html>