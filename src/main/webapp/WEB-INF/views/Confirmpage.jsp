<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@page isELIgnored="false" %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>forum</title>

    <!-- Bootstrap -->
    
   
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
	<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>"/>
	<link rel="stylesheet" href="<c:url value='/resourcescss/animate.css'/>">
	<link rel="stylesheet" href="<c:url value='/resourcescss/overwrite.css'/>">
	<link href="<c:url value='/resources/css/animate.min.css'/>" rel="stylesheet"> 
	<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet" />	
      </head>
  <body>	
	<header id="header">
        <nav class="navbar navbar-fixed-top" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index">Chat App</a>
                </div>				
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li> <a href="home2">Home</a></li>
                        <li><a href="chat">Chat</a></li>
                        <li><a href="blog">Blog</a></li>
                        
                        <li><a href="login">Login</a></li> 
                        <li><a href="signup">Sign Up</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->		
    </header><!--/header-->	<br><br><br><br><br>
<body>
		
 <div id="contact1">
			
   	
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/c2.jpg'/>" class="img-thumbnails" width="504" height="436"">
                    </div>
<div class="col-sm-4">
<div class="container" id="wrap">
      <div class="row">
        <div class="col-md-6 col-md-offset-3">

						
						<h1 style="color:red;">${b.title}</h1>
									<h3 style="color:blue;">-written by ${b.author} on ${b.cretion}</h3>
								
								
									<p><h3 style="color:blue;">and tagged with ${b.tag}</h3></p>
									<p><h2 style="color:black;"> ${b.content}</h2></p><br>
	
	<div class="container">
  
 <a class="btn btn-primary" href="editpage?id=${b.bid}">EDIT</a>&nbsp
 <a class="btn btn-primary" href="deleteBlog?id=${b.bid}">DELETE</a></button>&nbsp
 <a class="btn btn-primary" href="blogpage?id=${b.bid}">CONFORM</a></button>
</div></div>
	</div></div>
</div></div></div>
	</body>
</html> 