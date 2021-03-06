<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>chat</title>

    <!-- Bootstrap -->
    
   
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
	<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>"/>
	<link rel="stylesheet" href="<c:url value='/resourcescss/animate.css'/>">
	<link rel="stylesheet" href="<c:url value='/resourcescss/overwrite.css'/>">
	<link href="<c:url value='/resources/css/animate.min.css'/>" rel="stylesheet"> 
	<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet" />	
    <script src="<c:url value='/resources/bootstrap-3.3.6-dist/js/jquery.min.js'/>" ></script>
  <script src="<c:url value='/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js'/>" ></script>
    
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
                        <li class="active"><a href="#header">Home</a></li>
                        <li><a href="index">Chat</a></li>
                        <li><a href="blog">Blog</a></li>
                        <li><a href="forum">Forum</a></li>
                        
                        
                        <li><a href="login">Login</a></li> 
                         <li><a href="signup">Sign Up</a></li>  
    <%-- <li>      
<form action="logout" id="logout" method=post>
 
 <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
 </form> 
  <c:if test="${pageContext.request.userPrincipal.name != null}">
              <h5 style=color:white>Welcome ${pageContext.request.userPrincipal.name} 
                                <a href="javascript:document.getElementById('logout').submit()">Logout</a></h5> 
                 </c:if> 
        
        </li>  --%>
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->		
    </header><!--/header-->	
	<div class="slider">		
		<div id="about-slider">
			<div id="carousel-slider" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators visible-xs">
					<li data-target="#carousel-slider" data-slide-to="0" class="active"></li>
							</ol>

				<div class="carousel-inner">
					<div class="item active">						
						
                    <img src="<c:url value='/resources/img/s6.jpg'/>" class="img-responsive">
                    
						
						<div class="carousel-caption">
							<div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.3s">								
								<h2 style="color:black"><span>Gets Start To Chat
</span></h2>
							</div>
							<div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.6s">								
								<p class="text-info">One TO One And Gruop Chat</p>
							</div>
							
						</div>
				    </div><br><br>
			
			
	</div>
	
			<%-- <div id="contact">
			
  
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/c2.jpg'/>" class="img-thumbnails" width="504" height="436"">
                    						
</div>
    <div class="col-sm-4">
<div class="container" id="wrap">
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
   
   <h1 class="text-info">Create Account</h1>
				 <form:form modelAttribute="userBean">
				 
				 <div class="form">
      <label for="UserName">UserName:</label>
      <input type="text" class="form-control" name="userName" placeholder="Enter user name">
    </div>
					<div class="form1">
      <label for="Email">Email:</label>
      <input type="text" class="form-control" name="email" placeholder="Enter the email">
    </div>
					<div class="form2">
      <label for="Password">Password:</label>
      <input type="password" class="form-control" name="password" placeholder="Enter the password">
    </div>
					
					<div class="form2">
      <label for="Conform_Password">Confirm Password:</label>
      <input type="password" class="form-control" name="conform_password" placeholder="Enter the password">
    </div><br><br><br><br>
					
<button type="submit" class="btn  btn-success ribbon">Sign Up</button>
   
</form:form>
			</fieldset>
		</div></div></div>
	
</div>
  </div>
</div><br><br>  
<div id="contact1">
			
  
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/c2.jpg'/>" class="img-thumbnails" width="504" height="436"">
                    </div>
    <div class="col-sm-4">
<div class="container" id="wrap">
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
   
   <h1 class="text-info">Login Page</h1>
				 <form:form modelAttribute="userBean">
				 
				 <div class="form">
      <label for="UserName">UserName:</label>
      <input type="text" class="form-control" name="userName" placeholder="Enter user name">
    </div>
					
					<div class="form2">
      <label for="Password">Password:</label>
      <input type="password" class="form-control" name="password" placeholder="Enter the password">
    </div><br>
					
					
<button type="submit" class="btn  btn-success ribbon">Login</button>
   
</form:form>
			</fieldset>
		</div></div></div>
	
</div>
  </div>
</div><br><br><br>
    
	<!--	<footer>			
		<div id="footer">
<div class="container">
			<div class="sub-footer">
				<div class="text-center">
					<div class="col-md-12">
						<form class="form-inline">
							<div class="form-group">
								<button type="purchase" name="purchase" class="btn btn-primary btn-lg" required="required">Enter Your Email</button>
							</div>
							<div class="form-group">
								<button type="subscribe" name="subscribe" class="btn btn-primary btn-lg" required="required">Subscribe Now</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>			
		</footer>-->
     --%> <script src="js/bootstrap.min.js"></script>	
	
  </body>
</html>