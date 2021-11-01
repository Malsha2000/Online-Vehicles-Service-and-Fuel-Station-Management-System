<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page import="java.util.*,com.product.Product" %>
    

    
<!DOCTYPE html>
<html lang="en" class="no-js" lang="zxx">

<head>


<!-- Basic page needs
        ============================================ -->
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Product view| Tinker </title>
        <meta name="description" content="">

        <!-- Mobile specific metas
        ============================================ -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- favicon.ico -->
        <link rel="icon" type="image/png" sizes="96x96" href="img/favicon-96x96.png">

        <!-- ============== All CSS ================ -->
        <!-- normalize css
        ============================================ -->
        <link rel="stylesheet" href="css/normalize.css">

        <!-- animate css
        ============================================ -->
        <link rel="stylesheet" href="css/animate.css">

        <!-- bootstrap css
        ============================================ -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- meanmenu css
        ============================================ -->
        <link rel="stylesheet" href="css/meanmenu.min.css">

        <!-- font-awesome css
        ============================================ -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- icofont css
        ============================================ -->
        <link rel="stylesheet" href="css/icofont.css">

        <!-- change-text css
        ============================================ -->
        <link rel="stylesheet" href="css/change-text.css">

        <!-- YTPlayer css
        ============================================ -->
        <link rel="stylesheet" href="css/jquery.mb.YTPlayer.min.css">

        <!-- main css
        ============================================ -->
        <link rel="stylesheet" href="css/main.css">

        <!-- owl.carousel css
        ============================================ -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.css">
        <link rel="stylesheet" href="css/owl.transitions.css">

        <!-- nivo-slider css
        ============================================ -->
        <link rel="stylesheet" href="lib/css/nivo-slider.css">
        <link rel="stylesheet" href="lib/css/preview.css">

        <!-- style css
        ============================================ -->
        <link rel="stylesheet" href="style.css">

        <!-- responsive css
        ============================================ -->
        <link rel="stylesheet" href="css/responsive.css">

        <!-- modernizr js
        ============================================ -->
        <script src="js1/vendor/modernizr-2.8.3.min.js"></script>









<meta charset="ISO-8859-1">
<title>Product view| Tinker</title>

<link rel="stylesheet" href="./plugins/node_modules/bootstrap/dist/css/bootstrap.css">
<script src="./plugins/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<script src="./plugins/node_modules/bootstrap/dist/js/bootstrap.js.map"></script>

<style>

body{
	background-color:#0C020D;
}

 .card {
    display:grid;
    grid-gap:20px 20px;
    grid-template-columns:auto auto auto auto;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  	max-width: 300px;
    margin: auto;
    text-align: center;
    font-family: arial;
    margin:0 100px 0 150px;
    background-color:#0C020D;
}

.oop{
	width:300px;
	height: 800px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	background-color:white;
}

.price {
    color: grey;
    font-size: 22px;
  
}

.photo{
	width:200px;
    height:375px;
    }
    
p{
	justify-content:center;
    padding:0 16px 0 16px;
    }

.card button {
    border: none;
    outline: 0;
    padding: 12px;
    color: white;
    background-color: #ee2050;
    text-align: center;
    cursor: pointer;
    width: 100%;
    font-size: 18px;
}

.card button:hover {
    opacity: 0.7;
}
    
    
</style>


</head>

<body>



        <!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

        <!-- header area start -->
        <header id="sticker">
            <div class="header-top">
                <div class="container">
                    <div class="row">
                        <div class="col-md-7">
                            <!-- welcome message start -->
                            <div class="welcome-msg">
                                <ul>
                                    <li> <p> <span> Contact: </span>033-2267862</p></li>
                                    <li> <p> <span> Opening Hours: </span>Mon-Sun:  8:30am-6:30pm</p></li>
                                </ul>
                            </div>
                            <!-- welcome message end -->
                        </div>
                        <div class="col-md-5">
                            <div class="header-top-menu">
                                <!-- top social start -->
                                <div class="top-social">
                                    <ul>
                                        <li><a href="#"> <i class="fa fa-facebook"></i> </a></li>
                                        <li><a href="#"> <i class="fa fa-google-plus"></i> </a></li>
                                        <li><a href="#"> <i class="fa fa-twitter"></i> </a></li>
                                        <li><a href="#"> <i class="fa fa-instagram"></i> </a></li>
                                        <li><a href="#"> <i class="fa fa-pinterest-p"></i> </a></li>
                                    </ul>
                                </div>
                                <!-- top social end -->
                                <!-- cart menu start -->
                                <div class="cart-menu">
                                    <ul>
                                        
                                    </ul>
                                </div>
                                <!-- cart menu end -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- mainmenu area start -->
            <div class="main-menu-area hidden-xs">
                <div class="container">
                    <div class="menu-position">
                        <div class="row">
                            <div class="col-md-3 col-sm-2">
                                <!-- logo start -->
                                <div class="logo">
                                    <a href="index.html">
                                        <img src="img/logo.png" alt="">
                                    </a>
                                </div>
                                <!-- logo end -->
                            </div>
                            <div class="col-md-9 col-sm-10 static">
                                <!-- main-menu start -->
                                <div class="main-menu">
                                    <nav>
                                        <ul>
                                            <!-- single menu -->
                                            <li class="has-sub"><a href="index.html">Home</a></li>
                                            <!-- single menu -->
                                            <li><a href="about-us.html">About us</a></li>
                                            
                                            <!-- single menu -->
                                            <li><a href="shop.html">Shop</a></li>
                                            
                                            <li><a href="adminhome.jsp">Admin Home</a></li>
                                            <!-- single menu -->
                                            <li class="has-mega"><a href="#">pages<i class="icofont icofont-simple-down"></i></a>
                                                <!-- mega-menu start -->
                                                <div class="mega-menu" style="width: 500px;">
                                                    <span>
                                                        
                                                        
                                                    </span>
                                                    <span>
                                                        <a href="about-us.html">about us</a>
                                                        <a href="contact.html">contact us</a>
                                                        <a href="our-services.html">our services</a>
                                                        <a href="#">Reservation</a>
                                                        <a href="shop.html">shop</a>
                                                        <a href="#">Admin</a>
                                                    </span>
                                                    
                                                    
                                                </div>
                                                <!-- mega-menu end -->
                                            </li>
                                            <li><a href="#">Login</a></li>
                                        </ul>
                                    </nav>
                                </div>
                                <!-- main-menu start -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- mainmenu area end -->
            <!-- mobile menu area start -->
            <div class="mobile-menu-area hidden-lg hidden-md hidden-sm">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="logo">
                                <a href="index.html">
                                    <img src="img/logo-light.png" alt="">
                                </a>
                            </div>
                            <div class="mobile-menu">
                                <nav>
                                    <ul>
                                        <li><a href="index.html">Home</a></li>
                                        <li><a href="about-us.html">About Us</a></li>
                                        <li><a href="shop.html">Shop</a></li>
                                        <li><a href="#">Pages</a>
                                            <ul>
                                                <li><a href="about-us.html">about us</a></li>
                                                <li><a href="blog.html">blog</a></li>
                                                <li><a href="blog-details.html">blog details</a></li>
                                                <li><a href="our-services.html">our services</a></li>
                                                <li><a href="contact.html">contact us</a></li>
                                                <li><a href="shop.html">shop</a></li>
                                                <li><a href="shop-details.html">shop details</a></li>
                                                <li><a href="cart.html">shopping cart</a></li>
                                                <li><a href="checkout.html">checkout</a></li>
                                                <li><a href="wishlist.html">wishlist</a></li>
                                                <li><a href="eror-404.html">eror 404</a></li>
                                                <li><a href="eror-500.html">eror 500</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- mobile menu area end -->
        </header>
            
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        







    

<h1 style="text-align:center; color:white">OUR PRODUCTS</h1><br>

	<div class="card">

		<c:forEach var="products" items="${product_list}">


			<div class="oop">
			
  				<img src=${products.image} class="photo" alt="Denim Jeans" style="width:100%"><br><br>
  				
  				<h5><b>${products.productname}</b></h5><br>
  				
  				<p>${products.description}</p>
  				
  				<p class="price">LKR ${products.price}</p>
  				
  				<p><a href="payment.jsp"><button>BUY</button></a></p>
  				
  			</div>


		</c:forEach>

	</div>
	<br>
	<br>
	<br>
	<br>



<!-- quick book area end -->
        <!-- footer top start -->
        <div class="footer-top-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-4">
                        <!-- single footer start -->
                        <div class="single-footer-top">
                            <div class="footer-about-us">
                                <!-- small logo start -->
                                <a href="index.html" class="footer-logo"> <img src="img/logo-light.png" alt=""> </a>
                                <!-- small logo end -->
                                <!-- address start -->
                                <div class="footer-address">
                                    <p> <span> ADDRESS: </span>449, Kandy Road </p>
                                    <p>Kadawatha</p>
                                </div>
                                <!-- address end -->
                                <!-- contact info start -->
                                <div class="footer-contact-info">
                                    <p> <span> Telephone:</span> 033 2267862</p>
                                    <p> <span> Email:</span> info@tinkerfillingauto.com</p>
                                </div>
                                <!-- contact info end -->
                            </div>
                        </div>
                        <!-- single footer end -->
                    </div>
                    <div class="col-sm-2" style="margin-left: 200px;">
                        <!-- single footer start -->
                        <div class="single-footer-top">
                            <!-- section title start -->
                            <div class="footer-top-title">
                                <h3>Services</h3>
                            </div>
                            <!-- section title end -->
                            <!-- footer menu start -->
                            <div class="footer-top-menu">
                                <ul>
                                    <li><a href="#">About us</a></li>
                                    <li><a href="#">Return Policy</a></li>
                                    <li><a href="#">Our Blog</a></li>
                                    <li><a href="#">Contact Us</a></li>
                                    <li><a href="#">FAQ's</a></li>
                                </ul>
                            </div>
                            <!-- footer menu end -->
                        </div>
                        <!-- single footer end -->
                    </div>
                    <div class="col-md-2 col-md-offset-1 col-sm-3" style="margin-left: 247px;">
                        <!-- single footer start -->
                        <div class="single-footer-top">
                            <!-- section title start -->
                            <div class="footer-top-title">
                                <h3>USEFULL LINKS</h3>
                            </div>
                            <!-- section title end -->
                            <!-- footer menu start -->
                            <div class="footer-top-menu">
                                <ul>
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">Our Services</a></li>
                                    <li><a href="#">About Us</a></li>
                                    <li><a href="#">How it works</a></li>
                                    <li><a href="#">Terms & Condition</a></li>
                                </ul>
                            </div>
                            <!-- footer menu end -->
                        </div>
                        <!-- single footer end -->
                    </div>
                    
                </div>
            </div>
        </div>
        <!-- footer top end -->
        <!-- footer area start -->
        <div class="footer-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-4">
                        <!-- footer social start -->
                        <div class="footer-social">
                            <ul>
                                <li><a href="#"> <i class="fa fa-facebook"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-google-plus"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-twitter"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-instagram"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-pinterest-p"></i> </a></li>
                            </ul>
                        </div>
                        <!-- footer social end -->
                    </div>
                    <div class="col-md-6 col-sm-4">
                        <!-- copyright text start -->
                        <div class="footer-copyright">
                            <p>Copyright &copy; 2021- Tinker car repair and wash</p>
                        </div>
                        <!-- copyright text end -->
                    </div>
                    <div class="col-md-3 col-sm-4">
                        <!-- payment method start -->
                        <div class="footer-payment-method">
                            <img src="img/payment-method.png" alt="">
                        </div>
                        <!-- payment method end -->
                    </div>
                </div>
            </div>
        </div>
        <!-- footer area end -->


        
    <!-- ============== All JS ================ -->
    <!-- jquery js
    =========================================== -->
    <script src="js1/vendor/jquery-1.12.0.min.js"></script>

    <!-- bootstrap js
    =========================================== -->
    <script src="js1/bootstrap.min.js"></script>

    <!-- meanmenu js
    =========================================== -->
    <script src="js1/jquery.meanmenu.js"></script>

    <!-- scrollUp js
    =========================================== -->
    <script src="js1/jquery.scrollUp.min.js"></script>

    <!-- wow js
    =========================================== -->
    <script src="js1/wow.min.js"></script>

    <!-- owl.carousel js
    =========================================== -->
    <script src="js1/owl.carousel.min.js"></script>

    <!-- change-text js
    =========================================== -->
    <script src="js1/change-text.js"></script>

    <!-- YTPlayer js
    =========================================== -->
    <script src="js1/jquery.mb.YTPlayer.min.js"></script>

    <!-- textillate js
    =========================================== -->
    <script src="js1/jquery.lettering.js"></script>
    <script src="js1/jquery.textillate.js"></script>

    <!-- nivo.slider js
    =========================================== -->
    <script src="lib/js1/jquery.nivo.slider.js"></script>
    <script src="lib/home.js"></script>

    <!-- plugins js
    =========================================== -->
    <script src="js1/plugins.js"></script>

    <!-- main js
    =========================================== -->
    <script src="js1/main.js"></script>






</body>

</html>