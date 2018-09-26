<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>SexyCowGirlPhotos.Com are the perfect thing for boredom!</title>
<meta name="Description" content="Sexy Cow Girl Photos are the perfect thing for boredom! This photo gallery has a wide variety of hot sexy girls. We’ve got bikini models, girls in lingerie, hot celebrities, supermodels and girl next door types. As you can see there are plenty of Sexy Hot Girl Photos for you to look at.">
<meta name="Keywords" content="Sexy Cow Girl, Hot Women, Asian, Teen, Find her, Cute, Selfie">
<c:url value="/css/" var="linkCss" />
<c:url value="/" var="rootUrl" />
<link href="${linkCss}bootstrap.min.css" rel="stylesheet">
<link href="${linkCss}bootstrap-theme.min.css" rel="stylesheet">
<link href="${linkCss}main.css" rel="stylesheet">
<link href="${linkCss}style.css" rel="stylesheet">
<link href="${linkCss}footer-distributed-with-search.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]--> 
<c:url value="/images/" var="linkImage" />      
<link rel="shortcut icon" href="${linkImage}ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${linkImage}ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${linkImage}ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${linkImage}ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="${linkImage}ico/apple-touch-icon-57-precomposed.png">
<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
</head>
<body>
  <!-- Fixed navbar -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <img class="img-responsive img-circle" src="${linkImage}logo.png" style="display:inline; position: absolute; z-index: -1;" width="48px"/>
          <a class="navbar-brand" href="${rootUrl}" style="margin-left: 45px;">
          	SexyCowGirlPhotos
          </a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="${rootUrl}category/Asian">Asian</a></li>
            <li><a href="${rootUrl}category/boobs">Boobs</a></li>
            <li><a href="${rootUrl}category/Bikini">Bikini</a></li>
            <li><a href="${rootUrl}category/Find Her">Find Her</a></li>
            <li><a href="${rootUrl}category/Hot Women">Hot Women</a></li>
            <li><a href="${rootUrl}category/Selfi">Selfi</a></li>
            <li><a href="${rootUrl}category/Cute">Cute</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
	<div class="container">
		<div class="row">
			<h1>404 Error! Page Not Found. Please try later.</h1>

			
		</div>
	</div>
	<!-- The content of your page would go here. -->

	<footer class="footer-distributed" id="footer">

		<div class="footer-left">

			<p class="footer-links">
				<a href="#">Home</a>
				·
				<a href="#">Blog</a>
				·
				<a href="#">Pricing</a>
				·
				<a href="#">About</a>
				·
				<a href="#">Faq</a>
				·
				<a href="#">Contact</a>
			</p>

			<p class="footer-company-name">SexyCowGirlPhotos.Com &copy; 2015</p>

		</div>

		<div class="footer-right">

				<input placeholder="Search our website" name="search" id="search" url = "${rootUrl}search/"/>
				<i class="fa fa-search"></i>

		</div>

	</footer>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<c:url value="/js/" var="linkJs" />
	<!-- Bootstrap Core JavaScript -->
	<script src="${linkJs}jquery.js"></script>
	<script src="${linkJs}bootstrap.min.js"></script>
  	<script src="${linkJs}myjs.js"></script>
	<script type="text/javascript">
		$(function(){
			var page = new Home();
			page.init();
		});
	</script>
</body>
</html>

