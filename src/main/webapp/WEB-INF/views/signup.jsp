<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
                        <li><a href="forum">Forum</a></li>
                        
                        <li><a href="login">Login</a></li> 
                         </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->		
    </header><!--/header-->	<br><br><br><br>
	<div class="container">
			
  
  <div class="row">
    <div class="col-sm-2">

 <img src="<c:url value='/resources/img/s7.jpg'/>" class="img-thumbnails" width="474" height="436"">
                    						
</div>
    <div class="col-sm-4">
<div class="container" id="wrap">
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
   
   <h1 class="text-info">Create Account</h1>
				  <form action="./sign" method="post">
				 
				 <div class="form">
      <label for="UserName">UserName:</label>
      <input type="text" class="form-control" name="userName" placeholder="Enter user name" required>
     </div><br>
					
	
					<div class="form1">
      <label for="Email">Email:</label>
      <input type="email" class="form-control" name="email" placeholder="Enter the email" required>
    </div><br>
   				<div class="form2">
      <label for="Password">Password:</label>
      <input type="password" class="form-control" name="password" placeholder="Enter the password" required>
    </div><br>
					
					<div class="form2">
      <label for="Conform_Password">Confirm Password:</label>
      <input type="password" class="form-control" name="conform_password" placeholder="Enter the password" required>
    </div>
					
    <br><br>
			<p style="color:red;">${err}</p>		
<input type="submit" class="btn  btn-success ribbon" value="Submit" /><br />
				   
</form>
			</fieldset>
		</div></div></div>
	
</div>
  </div>
</div><br><br>  
</body>
</html>