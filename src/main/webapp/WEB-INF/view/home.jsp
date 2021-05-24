<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <!-- basic -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="viewport" content="initial-scale=1, maximum-scale=1" />
    <!-- site metas -->
    <title>Home Book</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!-- bootstrap css -->
    <link rel="stylesheet" href="/WEB-INF/css/bootstrap.min.css" />
    <!-- style css -->
    <link rel="stylesheet" href="/WEB-INF/css/style.css" />
    <!-- Responsive-->
    <link rel="stylesheet" href="/WEB-INF/css/responsive.css" />
    <!-- fevicon -->
    <link rel="icon" href="${ pageContext.request.contextPath }/resource/images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="/WEB-INF/css/jquery.mCustomScrollbar.min.css" />
    <!-- Tweaks for older IEs-->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
      media="screen"
    />
    <style>
    <%@include file="/WEB-INF/css/bootstrap.min.css"%>
     <%@include file="/WEB-INF/css/style.css"%>
      <%@include file="/WEB-INF/css/responsive.css"%>
       <%@include file="/WEB-INF/css/jquery.mCustomScrollbar.min.css"%>
        <%@include file="/WEB-INF/css/logo.css"%>
      
    
    
    </style>
</head>
<body class="main-layout">
    <!-- loader  -->
    <div class="loader_bg">
      <div class="loader"><img src="${ pageContext.request.contextPath }/resource/images/loading.gif" alt="#" /></div>
    </div>
    <!-- end loader -->
    <!-- header -->
    <header>
      <!-- header inner -->
      <div class="header">
        <div class="container">
          <div class="row">
            <div class="col-xl-3 col-lg-3 col-md-3 col-sm-12 col logo_section">
              <div class="full">
                <div class="center-desk">
                  <div class="logo Logo">
                    <a href="home.jps"
                      ><img src="${ pageContext.request.contextPath }/resource/images/logo1.png" alt="#"
                    /></a>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
            </div>
          </div>
          <div class="row">
            <div class="col-md-12 location_icon_bottum">
              <div class="row">
                <div class="col-md-8">
                  <div class="menu-area">
                    <div class="limit-box">
                      <nav class="main-menu">
                        <ul class="menu-area-main">
                           <li class="active"><a href="home">Home</a></li>
                          <li><a href="list">Books</a></li>
                          <li><a href="#product">Authors</a></li>
                          <li><a href="#testimonial">Bonus</a></li>
                          <li><a href="#contact">Admin</a></li>
                        </ul>
                      </nav>
                    </div>
                  </div>
                </div>
                <div class="col-xl-4 col-lg-4 col-md-4 col-sm-4">
                  <form class="search">
                    <input
                      class="form-control"
                      type="text"
                      placeholder="Search"
                    />
                    <button><img src="${ pageContext.request.contextPath }/resource/images/search_icon.png" /></button>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- end header inner -->
    </header>
    <!-- end header -->
    <section class="slider_section">
      <div
        id="myCarousel"
        class="carousel slide banner-main"
        data-ride="carousel"
      >
        <ul class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class=""></li>
          <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="2" class=""></li>
        </ul>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img
              class="first-slide"
              src="${ pageContext.request.contextPath }/resource/images/banner3.jpg"
              alt="First slide"
            />
            <div class="container">
              <div class="carousel-caption relative">
                	 <h1>.</h1>
                <span>.</span>
                 <h1>.</h1>
                <span>.</span>
                 <h1>.</h1>
                <span>.</span>

   
                <a class="buynow" href="list">Java Books</a
                ><a class="buynow ggg" href="#">Others</a>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img
              class="second-slide"
              src="${ pageContext.request.contextPath }/resource/images/banner4.jpg"
              alt="Second slide"
            />
            <div class="container">
              <div class="carousel-caption relative">
              
				 <h1>.</h1>
                <span>.</span>
                 <h1>.</h1>
                <span>.</span>
                 <h1>.</h1>
                <span>.</span>
                
       
                <a class="buynow" href="list">Java Books</a
                ><a class="buynow ggg" href="#">Others</a>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img
              class="third-slide"
              src="${ pageContext.request.contextPath }/resource/images/banner5.jpg"
              alt="Third slide"
            />
            <div class="container">
              <div class="carousel-caption relative">
               	  <h1>.</h1>
                <span>.</span>
                 <h1>.</h1>
                <span>.</span>
                 <h1>.</h1>
                <span>.</span>
                
                <a class="buynow" href="list">Java Books</a
                ><a class="buynow ggg" href="#">Others</a>
              </div>
            </div>
          </div>
        </div>
        <a
          class="carousel-control-prev"
          href="#myCarousel"
          role="button"
          data-slide="prev"
        >
          <i class="fa fa-angle-left"></i>
        </a>
        <a
          class="carousel-control-next"
          href="#myCarousel"
          role="button"
          data-slide="next"
        >
          <i class="fa fa-angle-right"></i>
        </a>
      </div>
    </section>

    <!-- end contact -->

    <!-- footer -->
    <!--  footer -->
    <footr>
      <div class="footer top_layer">
        <div class="container">
          <div class="row">
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
              <div class="address">
                <a href="index.html">
                  <img src="${ pageContext.request.contextPath }/resource/images/logo1.png" alt="logo"
                /></a>
              </div>
            </div>
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
              <div class="address">
                <h3>Quick links</h3>
                <ul class="Links_footer">
                  <li>
                    <img src="${ pageContext.request.contextPath }/resource/icon/3.png" alt="#" /> <a href="#"> Join Us</a>
                  </li>
                  <li>
                    <img src="${ pageContext.request.contextPath }/resource/icon/3.png" alt="#" /> <a href="#">Maintenance</a>
                  </li>
                  <li>
                    <img src="${ pageContext.request.contextPath }/resource/icon/3.png" alt="#" />
                    <a href="#">Language Packs</a>
                  </li>
                  <li>
                    <img src="${ pageContext.request.contextPath }/resource/icon/3.png" alt="#" /> <a href="#">LearnPress</a>
                  </li>
                  <li>
                    <img src="${ pageContext.request.contextPath }/resource/icon/3.png" alt="#" />
                    <a href="#">Release Status</a>
                  </li>
                </ul>
              </div>
            </div>

            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
              <div class="address">
                <h3>Subcribe email</h3>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
                  do
                </p>
                <input
                  class="form-control"
                  placeholder="Your Email"
                  type="type"
                  name="Your Email"
                />
                <button class="submit-btn">Submit</button>
              </div>
            </div>

            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
              <div class="address">
                <h3>Contact Us</h3>

                <ul class="loca">
                  <li>
                    <a href="#"><img src="${ pageContext.request.contextPath }/resource/icon/loc.png" alt="#" /></a>London 145
                    <br />United Kingdom
                  </li>
                  <li>
                    <a href="#"><img src="${ pageContext.request.contextPath }/resource/icon/email.png" alt="#" /></a
                    >demo@gmail.com
                  </li>
                  <li>
                    <a href="#"><img src="${ pageContext.request.contextPath }/resource/icon/call.png" alt="#" /></a
                    >+12586954775
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="copyright">
        <div class="container">
          <p>
            © 2019 All Rights Reserved. Design By<a href="https://html.design/">
              Free Html Templates</a
            >
          </p>
        </div>
      </div>
    </footr>

    <!-- end footer -->
    <!-- Javascript files-->
    <script src="${ pageContext.request.contextPath }/resource/js/jquery.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resource/js/popper.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resource/js/bootstrap.bundle.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resource/js/jquery-3.0.0.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resource/js/plugin.js"></script>
    <!-- sidebar -->
    <script src="${ pageContext.request.contextPath }/resource/js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resource/js/custom.js"></script>
    <!-- javascript -->
    <script src="${ pageContext.request.contextPath }/resource/js/owl.carousel.js"></script>
    <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
    <script>
      $(document).ready(function () {
        $(".fancybox").fancybox({
          openEffect: "none",
          closeEffect: "none",
        });

        $(".zoom").hover(
          function () {
            $(this).addClass("transition");
          },
          function () {
            $(this).removeClass("transition");
          }
        );
      });
    </script>
    <script>
      // This example adds a marker to indicate the position of Bondi Beach in Sydney,
      // Australia.
      function initMap() {
        var map = new google.maps.Map(document.getElementById("map"), {
          zoom: 11,
          center: {
            lat: 40.645037,
            lng: -73.880224,
          },
        });

        var image = "images/maps-and-flags.png";
        var beachMarker = new google.maps.Marker({
          position: {
            lat: 40.645037,
            lng: -73.880224,
          },
          map: map,
          icon: image,
        });
      }
    </script>
    <!-- google map js -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA8eaHt9Dh5H57Zh0xVTqxVdBFCvFMqFjQ&callback=initMap"></script>
    <!-- end google map js -->
  </body>
</html>