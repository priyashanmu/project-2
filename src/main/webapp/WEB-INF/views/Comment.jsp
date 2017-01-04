<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
			
  
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/c2.jpg'/>" class="img-thumbnails" width="504" height="436"">
                    </div>
      <div id="contact1">
			
  
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/q3.jpg'/>" class="img-thumbnails" width="574" height="466"">
                    </div>
    <div class="col-sm-3">
<div class="container" id="wrap">
      <div class="row">
        <div class="col-md-8 col-md-offset-3">
   <h1 class="text-info"><center>Share Your Comments</center></h1><br>
				<form:form action="./saveComment" commandName="cg" role="form" class="form-horizontal">
	
				 <div class="form">
      <!-- <label for="Name">Name:</label>
      <input type="text" class="form-control" name="Name" placeholder="Enter the name">
    --> <label class="col-md-3 control-label" for="name">Name</label>
              <div class="col-md-9">
                <form:input path="uname" type="text" placeholder="Your Name" class="form-control"/>
              </div>
    </div><br><br><br><br>
					
					
              <div class="form2">
              <!--  <label for="comment">Comment:</label>
      <textarea class="form-control" rows="6" id="comment" placeholder="Your Message"></textarea>
     -->  <label class="col-md-3 control-label" for="message">Comment</label>
              <div class="col-md-9">
                <form:textarea path="cmdContent" class="form-control" placeholder="Please enter your message here..." rows="5"></form:textarea>
              </div><br><br><br><br>
					<br><br><br><br>
					
              <div class="form2">
              <!--  <label for="comment">Comment:</label>
      <textarea class="form-control" rows="6" id="comment" placeholder="Your Message"></textarea>
     -->  <label class="col-md-3 control-label" for="name">Website Url</label>
              <div class="col-md-9">
                 <form:input path="url" type="text" placeholder="Your URL" class="form-control"/>
              </div><br><br><br><br>
					
              
					
      <!-- <label for="Message">Message:</label>
      <input type="textarea" class="form-control" name="message" placeholder="Enter the message">
     --><br>
     <div class="form-group">
              <div class="col-md-12 text-center">
                <button type="submit" class="btn btn-primary btn-lg">POST COMMENT</button>
              </div>
            </div>
					
		<div class="container">
	<div class="row">
		<div class="col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-3 col-xs-8 col-xs-offset-2">
    
            <!-- Begin fluid width widget -->
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        <span class="glyphicon glyphicon-list-alt"></span>� Recent Comments
                    </h3>
                </div>
                <div class="panel-body">
                    <ul class="media-list">
                        <li class="media">
                            <div class="media-body">
                                <h4 class="media-heading">
                                                <c:forEach var="f"  items="${commentList}">
	<a href="Comment?id=${c.cid}"><h2 style="color:blue;"> ${c.uname} </h2>
                                            </h4>
                                <p class="margin-top-10 margin-bottom-20">
                                    <h5>${c.cmdContent}</h5>
                                    <h2 style="color:blue;"> ${c.url} </h2>
                                       
                                    </p>
                            </c:forEach>
                            </div>
                        </li>
                                        </ul>
                    <a href="#" class="btn btn-default btn-block">More Comments �</a>
                </div>
            </div>
            <!-- End fluid width widget -->
            
        </div>
	</div>
</div>
				
  
</form:form>
									
			</fieldset>
		</div></div></div>
	
</div>
  </div>
</div><br><br><br>


</body>
</html> --%>