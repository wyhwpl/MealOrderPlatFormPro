<%--
  Created by IntelliJ IDEA.
  User: wpl
  Date: 2018/12/15 0015
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <link rel="icon" href="../../favicon.ico">

    <title>首页</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="jumbotron.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">OnlineOrderingSystem</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">XX在线订餐系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <div class="navbar-form navbar-right">

                <button  class="btn btn-success" onclick="userlogin()">在线订餐</button>
                <button  class="btn btn-success" onclick="riderlogin()">成为骑手</button>
                <button  class="btn btn-success" onclick="sellerlogin()">商家入驻</button>

            </div>
        </div><!--/.navbar-collapse -->
    </div>
</nav>

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <div class="container">
        <h2>欢迎使用XX订餐系统</h2>
        <p>本系统是一个在线订餐平台，内容丰富，机会多多。&nbsp;在这里，对于一些懒癌患者，你可以足不出户地吃到各种各样的美食；&nbsp对于那些有心赚外快的，你可以成为一名兼职的骑手；&nbsp;对于那些线下美食店主来说，还可以选择入驻我们，增加自己的销售渠道。</p>
        <p><a class="btn btn-primary btn-lg" href="javascript:;" role="button" onclick="userlogin()">了解更多 &raquo;</a></p>
    </div>
</div>

<div class="container">
    <!-- Example row of columns -->
    <div class="row">

        <div class="col-md-3" style="background-color:rgba(212, 210, 210, 0.671)">
            <h2>在线点餐</h2>
            <p>快捷下单，一键点餐</p>
            <br>
            <br>
            <p onclick="userlogin()"><a class="btn btn-default" href="javascript:;" role="button">了解更多 &raquo;</a></p>
        </div>
        <div class="col-md-1" >

        </div>
        <div class="col-md-3" style="background-color:rgba(212, 210, 210, 0.671)">
            <h2 >入驻我们</h2>
            <p>全村的希望 </p>
            <br>
            <br>
            <p onclick="sellerlogin()"><a class="btn btn-default" href="javascript:;" role="button">了解更多 &raquo;</a></p>
        </div>
        <div class="col-md-1" >

        </div>
        <div class="col-md-3" style="background-color:rgba(212, 210, 210, 0.671)">
            <h2>成为骑手</h2>
            <p>外卖小王子</p>
            <br>
            <br>
            <p onclick="riderlogin()"><a class="btn btn-default" href="javascript:;" role="button">了解更多 &raquo;</a></p>
        </div>
    </div>

    <hr>
    <br>
    <br>
    <br>

    <footer>
        <p>&copy; 201* NUAA 1615303小队, Inc.</p>
    </footer>
</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
<script>
    function userlogin(){
        window.location.href="http://localhost:8083";

    }
    function riderlogin(){
        window.location.href="http://localhost:8082"
    }
    function sellerlogin(){
        window.location.href="http://localhost:8081"
    }
</script>
</body>
</html>

