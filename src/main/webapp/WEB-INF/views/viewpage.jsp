<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@page isELIgnored="false" %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>comment</title>

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
                        <li><a href="forum">Forum</a></li>
                        
                        <li><a href="login">Login</a></li> 
                        <li><a href="signup">Sign Up</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->		
    </header><!--/header-->	<br><br><br><br><br><br>
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
									<form:form commandName="cg" action="./addComment?id=${b.bid}" method="post">
									<form:hidden path="blogid" value="${b.bid}"/>
									
									<h1 class="text-info"><center>Share Your Comments</center></h1><br>
	
									 <form:textarea path="cmdContent" placeholder="comment" class="form-control"/><br><br>
									 <form:input path="uname" placeholder="UserName" class="form-control"/><br>
									<center> <input type="submit" class="btn btn-primary" value="Comment"></center> <br>
									 </form:form>
									 <%-- <a class="btn btn-primary" commandName="cg" href="addComment?id=${b.bid}" role="button" >Comment</a>
									 --%>
									 <%-- <a class="btn btn-primary" href="deleteBlog?id=${b.bid}" role="button" >Delete</a></td>
									
									 <a class="btn btn-primary" href="editBlog?id=${b.bid}" role="button" >Edit</a></td>
									 --%>
									<%-- <c:forEach items="${cmts}" var="cmt">
									<p>${cmt.uname}<br>
									${cmt.cmdContent}</p>
									</c:forEach>
									  --%>
									
									
									</div>
									</div>
									
									</div>
									</div>
									</div>
<div class="container">
	<div class="row">
		<div class="col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-3 col-xs-8 col-xs-offset-2">
        
            <!-- Begin fluid width widget -->
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        <span class="glyphicon glyphicon-list-alt"></span>${cmt} Comments
                    </h3>
                </div>
                <div class="panel-body">
                    <ul class="media-list">
                        <li class="media">
                            <div class="media-body">
                                <h4 class="media-heading">
                                                <c:forEach items="${cmts}" var="cmt">
	<h2 style="color:blue;"> ${cmt.uname} </h2>
                                            </h4>
                                <p class="margin-top-10 margin-bottom-20">
                                    <h3 style="color:black;">${cmt.cmdContent}</h3>
								   </p>
                            </c:forEach>
                            </div>
                        </li>
                                        </ul>
                    <a href="#" class="btn btn-default btn-block">More Posts »</a>
                </div>
            </div>
            <!-- End fluid width widget -->
            
        </div>
	</div>
</div>
	
 </body>
</html>