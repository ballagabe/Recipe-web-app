<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Spring - Recipe</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
</head>
<body>
	<header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <ul class="navbar-nav mr-auto mb-2">
                    <li class="nav-item">
                        <a href="/login" class="nav-link" >Login</a>
                    </li>
                    <li class="nav-item">
                        <a href="/register" class="nav-link">Register</a>
                    </li>
                    <li class="nav-item dropdown">
                    </li>
                </ul>
            </div>
        </nav>
       <section class="jumbotron-fluid text-center banner">
	       <div class="hero-image">
	            <div class="hero-text">
		            <h1 style="font-size:50px">Food Diaries</h1>
		            <h3>Fresh Cooked Food, at Your Home</h3>
	            </div>
	       </div>
       </section>
    </header>