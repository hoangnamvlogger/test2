<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SexyCowGirlPhotos.Com are the perfect thing for boredom!</title>
    <meta name="Description" content="Sexy Cow Girl Photos are the perfect thing for boredom! This photo gallery has a wide variety of hot sexy girls. We’ve got bikini models, girls in lingerie, hot celebrities, supermodels and girl next door types. As you can see there are plenty of Sexy Hot Girl Photos for you to look at.">
    <meta name="Keywords" content="Sexy Cow Girl, Hot Women, Asian, Teen, Find her, Cute, Selfie">
    <c:url value="/css/" var="linkCss"/>
    <c:url value="/" var="rootUrl"/>
    <link href="${linkCss}bootstrap.min.css" rel="stylesheet">
    <link href="${linkCss}bootstrap-theme.min.css" rel="stylesheet">
    <link href="${linkCss}main.css" rel="stylesheet">
    <link href="${linkCss}style.css" rel="stylesheet">
    <link href="${linkCss}footer-distributed-with-search.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <c:url value="https://s3.amazonaws.com/sexycowgirlphotos/" var="linkImage"/>
    <c:url value="/images/" var="linkRootImage"/>
    <link rel="shortcut icon" href="${linkRootImage}ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${linkRootImage}ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${linkRootImage}ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${linkRootImage}ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="${linkRootImage}ico/apple-touch-icon-57-precomposed.png">
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
            <img class="img-responsive img-circle" src="${linkRootImage}logo.png" style="display:inline; position: absolute; z-index: -1;" width="48px"/>
            <a class="navbar-brand" href="${rootUrl}" style="margin-left: 45px;">
                SexyCowGirlPhotos
            </a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="${rootUrl}category/asian">Asian</a></li>
                <li><a href="${rootUrl}category/boobs">Boobs</a></li>
                <li><a href="${rootUrl}category/bikini">Bikini</a></li>
                <li><a href="${rootUrl}category/find her">Find Her</a></li>
                <li><a href="${rootUrl}category/hot women">Hot Women</a></li>
                <li><a href="${rootUrl}category/cute">Cute</a></li>
                <li><a href="${rootUrl}category/teen">Teen</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
            <div class="main-grids">
                <div class="top-grids">
                    <c:forEach items="${articles}" var="article" varStatus="theCount">
                        <div class="col-md-6 resent-grid recommended-grid slider-top-grids">
                            <div class="resent-grid-img recommended-grid-img">
                                <a href="${rootUrl}${article.href}" class="post-url" articleId="${article.id}"><img src="${linkRootImage}${article.thumbnail}" alt=""/></a>
                            </div>
                            <div class="resent-grid-info recommended-grid-info">
                                <h3>
                                    <a href="${rootUrl}${article.href}" articleId="${article.id}" class="title title-info post-url">${article.title}</a>
                                </h3>
                            </div>
                        </div>
                        <c:if test="${theCount.count % 2 == 0 && theCount.count > 0}">
                            <div class="clearfix"></div>
                        </c:if>
                    </c:forEach>


                </div>
            </div>
        </div>

        <div style="background-color:rgba(99, 101, 102, 0.1);padding-bottom: 25px;" class="col-lg-4 col-md-4" id="sticky">
            <div class="main-grids">
                <div class="top-grids">
                    <div class="recommended-info">
                        <h3>Most Viewed</h3>
                    </div>
                    <c:forEach items="${mostviewed}" var="mostviewed" varStatus="theCount">
                        <div class="col-md-6 resent-grid recommended-grid slider-top-grids">
                            <div class="resent-grid-img recommended-grid-img">
                                <a href="${rootlUr}${mostviewed.href}" class="post-url" articleId="${mostviewed.id}"><img src="${linkRootImage}${mostviewed.thumbnail}" alt=""/></a>
                            </div>
                            <div class="resent-grid-info recommended-grid-info">
                                <h3>
                                    <a href="${rootlUr}${mostviewed.href}" articleId="${mostviewed.id}" class="title title-info post-url">${mostviewed.title}</a>
                                </h3>
                            </div>
                        </div>
                        <c:if test="${theCount.count % 2 == 0 && theCount.count > 0}">
                            <div class="clearfix"></div>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="top-grids" style="margin-top:15px;">
                    <div class="recommended-info">
                        <h3>Advertising</h3>
                    </div>
                    <div class="col-md-12 resent-grid recommended-grid slider-top-grids">
                        <div class="resent-grid-img recommended-grid-img">
                            <a href="#"><img src="https://upload.wikimedia.org/wikipedia/commons/2/24/Ad-MediumRectangle-300x250.jpg" alt=""/></a>

                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="top-grids" style="margin-top:15px;">
                    <div class="recommended-info">
                        <h3>New Photo</h3>
                    </div>
                    <c:forEach items="${newestphoto}" var="newestphoto" varStatus="theCount">
                        <div class="col-md-6 resent-grid recommended-grid slider-top-grids">
                            <div class="resent-grid-img recommended-grid-img">
                                <a href="${rootlUr}${newestphoto.href}" class="post-url" articleId="${newestphoto.id}"><img src="${linkRootImage}${newestphoto.thumbnail}" alt=""/></a>
                            </div>
                            <div class="resent-grid-info recommended-grid-info">
                                <h3>
                                    <a href="${rootlUr}${newestphoto.href}" articleId="${newestphoto.id}" class="title title-info post-url">${newestphoto.title}</a>
                                </h3>
                            </div>
                        </div>
                        <c:if test="${theCount.count % 2 == 0 && theCount.count > 0}">
                            <div class="clearfix"></div>
                        </c:if>
                    </c:forEach>
                </div>
                <div class="top-grids" style="margin-top:15px;">
                    <div class="recommended-info">
                        <h3>Random Photo</h3>
                    </div>
                    <c:forEach items="${randomPhoto}" var="randomPhoto" varStatus="theCount">
                        <div class="col-md-4 resent-grid recommended-grid slider-top-grids">
                            <div class="resent-grid-img recommended-grid-img">
                                <a href="${rootlUr}${randomPhoto.href}" class="post-url" articleId="${randomPhoto.id}"><img src="${linkRootImage}${randomPhoto.thumbnail}" alt=""/></a>
                            </div>
                            <div class="resent-grid-info recommended-grid-info">
                                <h3>
                                    <a href="${rootlUr}${randomPhoto.href}" articleId="${randomPhoto.id}" class="title title-info post-url">${randomPhoto.title}</a>
                                </h3>
                            </div>
                        </div>
                        <c:if test="${theCount.count % 3 == 0 && theCount.count > 0}">
                            <div class="clearfix"></div>
                        </c:if>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- The content of your page would go here. -->

<footer class="footer-distributed" id="footer">

    <div class="footer-left">

        <p class="footer-links">
            <a href="${rootUrl}category/Asian">Asian</a>
            <a href="${rootUrl}category/boobs">Boobs</a>
            <a href="${rootUrl}category/Bikini">Bikini</a>
            <a href="${rootUrl}category/find her">Find Her</a>
            <a href="${rootUrl}category/hot women">Hot Women</a>
            <a href="${rootUrl}category/cute">Cute</a>
            <a href="${rootUrl}category/teen">Teen</a>
        </p>

        <p class="footer-company-name">SexyCowGirlPhotos.Com &copy; 2015</p>

    </div>

    <div class="footer-right">

        <input placeholder="Search our website" name="search" id="search" url="${rootUrl}search/"/>
        <i class="fa fa-search"></i>

    </div>

</footer>
<!-- Bootstrap core JavaScript
================================================== -->
<c:url value="/js/" var="linkJs"/>
<!-- Bootstrap Core JavaScript -->
<script src="${linkJs}jquery.js"></script>
<script src="${linkJs}bootstrap.min.js"></script>
<script src="${linkJs}myjs.js"></script>
<script type="text/javascript">
    $(function () {
        var page = new Home();
        page.init();
    });
</script>
</body>
</html>

