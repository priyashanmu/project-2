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
                        <li> <a href="home">Home</a></li>
                        <li><a href="chat">Chat</a></li>
                        <li><a href="blog">Blog</a></li>
                        
                        <li><a href="login">Login</a></li> 
                        <li><a href="signup">Sign Up</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->		
    </header><!--/header-->	<br><br><br><br><br>
 <div id="contact2">
			
  
  <%-- <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/c2.jpg'/>" class="img-thumbnails" width="504" height="436"">
                    </div> --%>
     <div id="contact1">
			
  
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/q3.jpg'/>" class="img-thumbnails" width="574" height="466"">
                    </div>
    <div class="col-sm-3">
<div class="container" id="wrap">
      <div class="row">
        <div class="col-md-8 col-md-offset-3">
   
   <h1 class="text-info"><center>Edit your Page</center></h1><br>
				 <form:form action="updateforum?id=${f.fid}" method="post" commandName="fg">
 <div class="form-group">
  <label for="usr"><h3>FORUM ID:</h3></label><br>
  <form:input path="fid" value="${f.fid}" readonly="true" type="text" class="form-control" />
</div>
<div>
  <label for="usr"><h3>QUESTION:</h3></label><br>
  <form:input path="question" value="${f.question}"  type="text" class="form-control"/>
</div>


<br>
   <!-- Blog Comments -->         
 <div class="form-group">
  <label for="usr"><h3>AUTHOR:</h3></label><br>
  <form:input path="author" value="${f.author}"  type="text" class="form-control" />
</div>
             
   <!-- Comments Form -->

   <div class="form-group">
  <label for="usr"><h3>UR SUMMERY:</h3></label><br>
     <form:textarea path="summery" value="${f.summery}" class="form-control" rows="3"></form:textarea>
         </div>
               
 
<%-- <div class="form-group">
  <label for="usr"><h3>CREATION DATE:</h3></label><br>
  <form:input path="creation" value="${f.creation}"  type="text" class="form-control" id="usr"/>
</div> --%>
    <button type="submit" class="btn btn-primary">EDIT</button>
            </div>
            </form:form>
            <!-- <a href="bloglist">To List the blogs</a> -->
    </div>
				 </div>
				 </div>
				 </div>
				 </div>
				 </div>
				 </body>
				 </html>