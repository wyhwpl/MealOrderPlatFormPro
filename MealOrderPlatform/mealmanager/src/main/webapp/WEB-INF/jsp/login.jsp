<%--
  Created by IntelliJ IDEA.
  User: wpl
  Date: 2018/11/23 0023
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>
    <meta name="MobileOptimized" content="320">
    <%--<link href="/assets/plugins/font-awesome/font-awesome.min.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>--%>
    <link href="/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <%--<link href="/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>--%>
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
    <%--<link href="/assets/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/plugins/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/plugins/jqvmap/jqvmap.css" rel="stylesheet" type="text/css"/>--%>
    <!-- END PAGE LEVEL PLUGIN STYLES -->
    <!-- BEGIN THEME STYLES -->
    <%--<link href="/assets/css/style-conquer.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/css/style.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/css/plugins.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/css/pages/tasks.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link href="/assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>--%>
    <%--<link href="/assets/css/custom.css" rel="stylesheet" type="text/css"/>--%>
    <link href="/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<%
    String account="";
    String password="";
    Cookie[] cookies=request.getCookies();
    for (int i = 0; i <cookies.length ; i++) {
        System.out.println(cookies[i].getName()+" "+cookies[i].getValue());
        if("loginId".equals(cookies[i].getName())){
            account=cookies[i].getValue();
        }
        if("password".equals(cookies[i].getName())){
            password=cookies[i].getValue();
        }
    }
%>

    <div class="login container">

        <form role="form" class="form-signin" id="loginForm" enctype="application/json">

            <h2 class="form-sign-head">欢迎登录</h2>
            <input type="text" name="loginid" value="<%=account%>" class="form-control" placeholder="LoginId" required autofocus/>
            <input type="password" name="password" value="<%=password%>" class="form-control" placeholder="Password" required/>
            <div class="submit">
                <a href="javascript:;" class="btn btn-lg btn-primary lg" onclick="loginHandler()">登录</a>
            </div>
        </form>

    </div>

    <script src="/assets/plugins/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
    <script src="/assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <script src="/assets/plugins/jqvmap/jquery.vmap.js" type="text/javascript"></script>
    <script src="/assets/plugins/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
    <script src="/assets/plugins/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
    <script src="/assets/plugins/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
    <script src="/assets/plugins/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
    <script src="/assets/plugins/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
    <script src="/assets/plugins/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery.peity.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery.pulsate.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery-knob/jquery.knob.js" type="text/javascript"></script>
    <script src="/assets/plugins/flot/jquery.flot.js" type="text/javascript"></script>
    <script src="/assets/plugins/flot/jquery.flot.resize.js" type="text/javascript"></script>
    <script src="/assets/plugins/bootstrap-daterangepicker/moment.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>
    <script src="/assets/plugins/gritter/jquery.gritter.js" type="text/javascript"></script>
    <!-- IMPORTANT! fullcalendar depends on jquery-ui-1.10.3.custom.min.js for drag & drop support -->
    <script src="/assets/plugins/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery-easypiechart/jquery.easypiechart.min.js" type="text/javascript"></script>
    <script src="/assets/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN PAGE LEVEL SCRIPTS -->
    <script src="/assets/scripts/app.js" type="text/javascript"></script>
    <script src="/js/login.js" type="text/javascript"></script>
</body>
</html>
