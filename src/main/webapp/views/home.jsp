<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Twitter Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link href="static/css/bootstrap.css" rel="stylesheet">
    <link href="static/css/font-awesome.css" rel="stylesheet">
    <style type="text/css">

            /* Sticky footer styles
            -------------------------------------------------- */

        html,
        body {
            height: 100%;
            /* The html and body elements cannot have any padding or margin. */
        }

        div.navbar-inner {
            font-family: FontAwesome, MuseoSlabThin, "Helvetica Neue", Helvetica, Arial, sans-serif;
        }

            /* Wrapper for page content to push down footer */
        #wrap {
            min-height: 100%;
            height: auto !important;
            height: 100%;
            /* Negative indent footer by it's height */
            margin: 0 auto -30px;
        }

            /* Set the fixed height of the footer here */
        #push,
        #footer {
            height: 30px;
        }

        #footer {
            background-color: #1eb0f0;
        }

        p.credit {
            font-family: MuseoSlabThin, "Helvetica Neue", Helvetica, Arial, sans-serif;
            color: white;
        }

        img {
            float: right;
            margin-top: -40px;
        }

            /* Lastly, apply responsive CSS fixes as necessary */
        @media (max-width: 767px) {
            #footer {
                margin-left: -20px;
                margin-right: -20px;
                padding-left: 20px;
                padding-right: 20px;
            }
        }

            /* Custom page CSS
            -------------------------------------------------- */
            /* Not required for template or sticky footer method. */

        #wrap > .container {
            padding-top: 40px;
        }

        .container .credit {
            margin: 7px 0;
            height: 10px;
        }

        code {
            font-size: 80%;
        }

    </style>
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">


    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="static/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144"
          href="http://twitter.github.io/bootstrap/assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114"
          href="http://twitter.github.io/bootstrap/assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72"
          href="http://twitter.github.io/bootstrap/assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed"
          href="http://twitter.github.io/bootstrap/assets/ico/apple-touch-icon-57-precomposed.png">
    <link rel="shortcut icon" href="images/cloud_nine_partners-small-ico.png">
</head>

<body>


<!-- Part 1: Wrap all page content here -->
<div id="wrap">

    <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="brand" href="index.html#">HeloWorld</a>

                <div class="nav-collapse collapse">
                    <ul class="nav">
                        <li><a href="index.html#about">About</a></li>
                        <li><a href="index.html#contact">Contact</a></li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>

    <!-- Begin page content -->
    <div class="container">
        <div class="page-header">
            <h1>Mockup Base Template 10.0.1.18</h1>
        </div>
        <p class="lead">Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom
            HTML and CSS. A fixed navbar has been added within <code>#wrap</code> with <code>padding-top: 60px;</code>
            on the <code>.container</code>.</p>
    </div>

    <div id="push"></div>
</div>

<div id="footer">
    <div class="container">
        <p class="credit">&copy; 2013 Cloud Nine Partners LLC &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a>
            <img class="footer-logo" src="static/images/cloud_nine_partners-small-300.png" align="bottom" width="80px"/></p>
    </div>
</div>


<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="static/js/jquery.js"></script>
<script src="static/js/bootstrap-transition.js"></script>
<script src="static/js/bootstrap-alert.js"></script>
<script src="static/js/bootstrap-modal.js"></script>
<script src="static/js/bootstrap-dropdown.js"></script>
<script src="static/js/bootstrap-scrollspy.js"></script>
<script src="static/js/bootstrap-tab.js"></script>
<script src="static/js/bootstrap-tooltip.js"></script>
<script src="static/js/bootstrap-popover.js"></script>
<script src="static/js/bootstrap-button.js"></script>
<script src="static/js/bootstrap-collapse.js"></script>
<script src="static/js/bootstrap-carousel.js"></script>
<script src="static/js/bootstrap-typeahead.js"></script>
</body>
</html>