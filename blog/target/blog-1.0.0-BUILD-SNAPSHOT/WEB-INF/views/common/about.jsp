<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- ==============================
    Project:        Metronic "Aircv" Frontend Freebie - Responsive HTML Template Based On Twitter Bootstrap 3.3.4
    Version:        1.0
    Author:         KeenThemes
    Primary use:    Corporate, Business Themes.
    Email:          support@keenthemes.com
    Follow:         http://www.twitter.com/keenthemes
    Like:           http://www.facebook.com/keenthemes
    Website:        http://www.keenthemes.com
    Premium:        Premium Metronic Admin Theme: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
================================== -->
<html lang="en" class="no-js">
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8"/>
        <title>거스 소개</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport"/>
        <meta content="" name="description"/>
        <meta content="" name="author"/>

        <!-- GLOBAL MANDATORY STYLES -->
        <link href="resources/about/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <!-- PAGE LEVEL PLUGIN STYLES -->
        <link href="resources/about/css/animate.css" rel="stylesheet">

        <!-- THEME STYLES -->
        <link href="resources/about/css/layout.min.css" rel="stylesheet" type="text/css"/>
		<%@ include file="head.jsp" %>
        
    </head>
    <!-- END HEAD -->

    <!-- BODY -->
    <body id="body" data-spy="scroll" data-target=".header">
	
        
        <!--========== END HEADER ==========-->
		<%@ include file="navbar.jsp" %>
        <!--========== SLIDER ==========-->
        <div class="promo-block parallax-window" data-parallax="scroll" data-image-src="../resources/img/profile/main_4.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="promo-block-divider">
                            <h1 class="promo-block-title">Gus</h1>
                            <p class="promo-block-text">Backend Developer &amp; Big-Data Engineer</p>
                        </div>

                    </div>
                </div>
                <!--// end row -->
            </div>
        </div>
        <!--========== SLIDER ==========-->

        <!--========== PAGE LAYOUT ==========-->
        <!-- About -->
        <div id="about">
            <div class="container content-lg">
                <div class="row">
                    <div class="col-sm-3 sm-margin-b-30">
                        <div class="text-right sm-text-left">
                            <h2 class="margin-b-0">Intro</h2>
                            <p>What I am all about.</p>
                        </div>
                    </div>
                    <div class="col-sm-8 col-sm-offset-1">
                        <div class="margin-b-60">
                            <p>거스입니다. 소프트웨어로 어떻게 하면 조금 더 생활을 편리하게 할 수 있을지를 고민합니다.</p>
                            <p>Spring,AWS,알고리즘 문제풀이 등에 관심이 있습니다.</p>
                        </div>

                        <!-- Progress Box -->
                        <div class="progress-box">
                            <h5>Java <span class="color-heading pull-right">30%</span></h5>
                            <div class="progress">
                                <div class="progress-bar bg-color-base" role="progressbar" data-width="30"></div>
                            </div>
                        </div>
                        <div class="progress-box">
                            <h5>Spring <span class="color-heading pull-right">20%</span></h5>
                            <div class="progress">
                                <div class="progress-bar bg-color-base" role="progressbar" data-width="20"></div>
                            </div>
                        </div>
                        <div class="progress-box">
                            <h5>AWS <span class="color-heading pull-right">20%</span></h5>
                            <div class="progress">
                                <div class="progress-bar bg-color-base" role="progressbar" data-width="20"></div>
                            </div>
                        </div>
                        <div class="progress-box">
                            <h5>Scala <span class="color-heading pull-right">15%</span></h5>
                            <div class="progress">
                                <div class="progress-bar bg-color-base" role="progressbar" data-width="15"></div>
                            </div>
                        </div>
                        <!-- End Progress Box -->
                    </div>
                </div>
                <!--// end row -->
            </div>
        </div>
        <!-- End About -->

        <!-- Experience -->
        <div id="experience">
            <div class="bg-color-sky-light" data-auto-height="true">
                <div class="container content-lg">
                    <div class="row">
                        <div class="col-sm-3 sm-margin-b-30">
                            <div class="text-right sm-text-left">
                                <h2 class="margin-b-0">Experience</h2>
                                <p>Batman would be jealous.</p>
                            </div>
                        </div>
                        <div class="col-sm-8 col-sm-offset-1">
                            <div class="row row-space-2 margin-b-4">
                                <div class="col-md-4 md-margin-b-4">
                                    <div class="service" data-height="height">
                                        <div class="service-element">
                                            <i class="service-icon icon-chemistry"></i>
                                        </div>
                                        <div class="service-info">
                                            <h3>Baro</h3>
                                            <p class="margin-b-5">자세 교정 인형.</p>
                                        </div>
                                        <a href="#" class="content-wrapper-link"></a>
                                    </div>
                                </div>
                                <div class="col-md-4 md-margin-b-4">
                                    <div class="service bg-color-base wow zoomIn" data-height="height" data-wow-duration=".3" data-wow-delay=".1s">
                                        <div class="service-element">
                                            <i class="service-icon color-white icon-screen-tablet"></i>
                                        </div>
                                        <div class="service-info">
                                            <h3 class="color-white">My Blog</h3>
                                            <p class="color-white margin-b-5">Spring & AWS</p>
                                        </div>
                                        <a href="#" class="content-wrapper-link"></a>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="service" data-height="height">
                                        <div class="service-element">
                                            <i class="service-icon icon-badge"></i>
                                        </div>
                                        <div class="service-info">
                                            <h3>Git Watcher(working...)</h3>
                                            <p class="margin-b-5">깃 습관 들이기 서비스.</p>
                                        </div>
                                        <a href="#" class="content-wrapper-link"></a>
                                    </div>
                                </div>
                            </div>
                            <!--// end row -->
                        </div>
                    </div>
                    <!--// end row -->
                </div>
            </div>
        </div>
        <!-- End Experience -->



        <!-- Contact -->
        <div id="contact">

                <div class="container content-lg">
                    <div class="row">
                        <div class="col-sm-3 sm-margin-b-30">
                            <div class="text-right sm-text-left">
                                <h2 class="margin-b-0">Contacts</h2>
                                <p>Hire me.</p>
                            </div>
                        </div>
                        <div class="col-sm-8 col-sm-offset-1">
                            <div class="row">
                                <div class="col-md-3 col-xs-6 md-margin-b-30">
                                    <h5>Location</h5>
                                    <a href="#">Seoul,South Korea</a>
                                </div>
                                <div class="col-md-3 col-xs-6">
                                    <h5>Email</h5>
                                    <a href="mailto:#">anstkd07@gmail.com</a>
                                </div>
                                <div class="col-md-3 col-xs-6">
                                    <h5>Web</h5>
                                    <a href="#">http://www.thebogus.net</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--// end row -->
                </div>

        </div>
        <!-- End Contact -->
        <!--========== END PAGE LAYOUT ==========-->

        <!--========== FOOTER ==========-->


        <!-- Back To Top -->
        <a href="javascript:void(0);" class="js-back-to-top back-to-top">Top</a>

        <!-- JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
        <!-- CORE PLUGINS -->
        <script src="resources/about/vendor/jquery.min.js" type="text/javascript"></script>
        <script src="resources/about/vendor/jquery-migrate.min.js" type="text/javascript"></script>
        <script src="resources/about/vendor/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

        <!-- PAGE LEVEL PLUGINS -->
        <script src="resources/about/vendor/jquery.easing.js" type="text/javascript"></script>
        <script src="resources/about/vendor/jquery.back-to-top.js" type="text/javascript"></script>
        <script src="resources/about/vendor/jquery.smooth-scroll.js" type="text/javascript"></script>
        <script src="resources/about/vendor/jquery.wow.min.js" type="text/javascript"></script>
        <script src="resources/about/vendor/jquery.parallax.min.js" type="text/javascript"></script>
        <script src="resources/about/vendor/jquery.appear.js" type="text/javascript"></script>
        <script src="resources/about/vendor/masonry/jquery.masonry.pkgd.min.js" type="text/javascript"></script>
        <script src="resources/about/vendor/masonry/imagesloaded.pkgd.min.js" type="text/javascript"></script>

        <!-- PAGE LEVEL SCRIPTS -->
        <script src="resources/about/js/layout.min.js" type="text/javascript"></script>
        <script src="resources/about/js/components/progress-bar.min.js" type="text/javascript"></script>
        <script src="resources/about/js/components/masonry.min.js" type="text/javascript"></script>
        <script src="resources/about/js/components/wow.min.js" type="text/javascript"></script>

    </body>
    <!-- END BODY -->
</html>
