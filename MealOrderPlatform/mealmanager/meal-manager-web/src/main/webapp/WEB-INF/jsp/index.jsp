<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<meta name="MobileOptimized" content="320">
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="/assets/plugins/font-awesome/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="/assets/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link href="/assets/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css"/>
<link href="/assets/plugins/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css"/>
<link href="/assets/plugins/jqvmap/jqvmap.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="/assets/css/style-conquer.css" rel="stylesheet" type="text/css"/>
<link href="/assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="/assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="/assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="/assets/css/pages/tasks.css" rel="stylesheet" type="text/css"/>
<link href="/assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="/assets/css/custom.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="/css/index.css" rel="stylesheet" type="text/css">
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
<!-- BEGIN HEADER -->
<div class="header navbar navbar-fixed-top">
	<!-- BEGIN TOP NAVIGATION BAR -->
	<div class="header-inner">
		<!-- BEGIN LOGO -->
		<div class="page-logo">
            <a href="index.jsp">
                <img src="/assets/img/logo.png" alt="logo"/>
            </a>
        </div>
        <form class="search-form search-form-header" role="form" action="index.jsp">
            <div class="input-icon right">
                <i class="icon-magnifier"></i>
                <input type="text" class="form-control input-sm" name="query" placeholder="Search...">
            </div>
        </form>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
		<img src="/assets/img/menu-toggler.png" alt=""/>
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<ul class="nav navbar-nav pull-right">
			<!-- BEGIN NOTIFICATION DROPDOWN -->
			<li class="dropdown" id="header_notification_bar">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
				<i class="icon-bell"></i>
				<span class="badge badge-success">
				6 </span>
				</a>
				<ul class="dropdown-menu extended notification">
					<li>
						<p>
							 You have 14 new notifications
						</p>
					</li>
					<li>
						<ul class="dropdown-menu-list scroller" style="height: 250px;">
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-success">
								<i class="fa fa-plus"></i>
								</span>
								New user registered. <span class="time">
								Just now </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-danger">
								<i class="fa fa-bolt"></i>
								</span>
								Server #12 overloaded. <span class="time">
								15 mins </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-warning">
								<i class="fa fa-bell"></i>
								</span>
								Server #2 not responding. <span class="time">
								22 mins </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-info">
								<i class="fa fa-bullhorn"></i>
								</span>
								Application error. <span class="time">
								40 mins </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-danger">
								<i class="fa fa-bolt"></i>
								</span>
								Database overloaded 68%. <span class="time">
								2 hrs </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-danger">
								<i class="fa fa-bolt"></i>
								</span>
								2 user IP blocked. <span class="time">
								5 hrs </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-warning">
								<i class="fa fa-bell"></i>
								</span>
								Storage Server #4 not responding. <span class="time">
								45 mins </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-info">
								<i class="fa fa-bullhorn"></i>
								</span>
								System Error. <span class="time">
								55 mins </span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="label label-sm label-icon label-danger">
								<i class="fa fa-bolt"></i>
								</span>
								Database overloaded 68%. <span class="time">
								2 hrs </span>
								</a>
							</li>
						</ul>
					</li>
					<li class="external">
						<a href="#">See all notifications <i class="fa fa-angle-right"></i></a>
					</li>
				</ul>
			</li>
			<!-- END NOTIFICATION DROPDOWN -->
			<!-- BEGIN INBOX DROPDOWN -->
			<li class="dropdown" id="header_inbox_bar">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
				<i class="icon-envelope-open"></i>
				<span class="badge badge-info">
				5 </span>
				</a>
				<ul class="dropdown-menu extended inbox">
					<li>
						<p>
							 You have 12 new messages
						</p>
					</li>
					<li>
						<ul class="dropdown-menu-list scroller" style="height: 250px;">
							<li>
								<a href="inbox.html?a=view">
								<span class="photo">
								<img src="/assets/img/avatar2.jpg" alt=""/>
								</span>
								<span class="subject">
								<span class="from">
								Lisa Wong </span>
								<span class="time">
								Just Now </span>
								</span>
								<span class="message">
								Vivamus sed auctor nibh congue nibh. auctor nibh auctor nibh... </span>
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo">
								<img src="/assets/img/avatar3.jpg" alt=""/>
								</span>
								<span class="subject">
								<span class="from">
								Richard Doe </span>
								<span class="time">
								16 mins </span>
								</span>
								<span class="message">
								Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh auctor nibh... </span>
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo">
								<img src="/assets/img/avatar1.jpg" alt=""/>
								</span>
								<span class="subject">
								<span class="from">
								Bob Nilson </span>
								<span class="time">
								2 hrs </span>
								</span>
								<span class="message">
								Vivamus sed nibh auctor nibh congue nibh. auctor nibh auctor nibh... </span>
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo">
								<img src="/assets/img/avatar2.jpg" alt=""/>
								</span>
								<span class="subject">
								<span class="from">
								Lisa Wong </span>
								<span class="time">
								40 mins </span>
								</span>
								<span class="message">
								Vivamus sed auctor 40% nibh congue nibh... </span>
								</a>
							</li>
							<li>
								<a href="inbox.html?a=view">
								<span class="photo">
								<img src="/assets/img/avatar3.jpg" alt=""/>
								</span>
								<span class="subject">
								<span class="from">
								Richard Doe </span>
								<span class="time">
								46 mins </span>
								</span>
								<span class="message">
								Vivamus sed congue nibh auctor nibh congue nibh. auctor nibh auctor nibh... </span>
								</a>
							</li>
						</ul>
					</li>
					<li class="external">
						<a href="inbox.html">See all messages <i class="fa fa-angle-right"></i></a>
					</li>
				</ul>
			</li>
			<!-- END INBOX DROPDOWN -->
			<!-- BEGIN TODO DROPDOWN -->
			<li class="dropdown" id="header_task_bar">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
				<i class="icon-calendar"></i>
				<span class="badge badge-warning">
				5 </span>
				</a>
				<ul class="dropdown-menu extended tasks">
					<li>
						<p>
							 You have 12 pending tasks
						</p>
					</li>
					<li>
						<ul class="dropdown-menu-list scroller" style="height: 250px;">
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								New release v1.2 </span>
								<span class="percent">
								30% </span>
								</span>
								<span class="progress">
								<span style="width: 40%;" class="progress-bar progress-bar-success" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								40% Complete </span>
								</span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								Application deployment </span>
								<span class="percent">
								65% </span>
								</span>
								<span class="progress progress-striped">
								<span style="width: 65%;" class="progress-bar progress-bar-danger" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								65% Complete </span>
								</span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								Mobile app release </span>
								<span class="percent">
								98% </span>
								</span>
								<span class="progress">
								<span style="width: 98%;" class="progress-bar progress-bar-success" aria-valuenow="98" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								98% Complete </span>
								</span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								Database migration </span>
								<span class="percent">
								10% </span>
								</span>
								<span class="progress progress-striped">
								<span style="width: 10%;" class="progress-bar progress-bar-warning" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								10% Complete </span>
								</span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								Web server upgrade </span>
								<span class="percent">
								58% </span>
								</span>
								<span class="progress progress-striped">
								<span style="width: 58%;" class="progress-bar progress-bar-info" aria-valuenow="58" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								58% Complete </span>
								</span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								Mobile development </span>
								<span class="percent">
								85% </span>
								</span>
								<span class="progress progress-striped">
								<span style="width: 85%;" class="progress-bar progress-bar-success" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								85% Complete </span>
								</span>
								</span>
								</a>
							</li>
							<li>
								<a href="#">
								<span class="task">
								<span class="desc">
								New UI release </span>
								<span class="percent">
								18% </span>
								</span>
								<span class="progress progress-striped">
								<span style="width: 18%;" class="progress-bar progress-bar-important" aria-valuenow="18" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								18% Complete </span>
								</span>
								</span>
								</a>
							</li>
						</ul>
					</li>
					<li class="external">
						<a href="#">See all tasks <i class="fa fa-angle-right"></i></a>
					</li>
				</ul>
			</li>
			<!-- END TODO DROPDOWN -->
			<li class="devider">
				 &nbsp;
			</li>
			<!-- BEGIN USER LOGIN DROPDOWN -->
			<li class="dropdown user">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
				<img alt="" src="/assets/img/avatar3_small.jpg"/>
				<span class="username username-hide-on-mobile">Nick </span>
				<i class="fa fa-angle-down"></i>
				</a>
				<ul class="dropdown-menu">
					<li>
						<a href="extra_profile.html"><i class="fa fa-user"></i> My Profile</a>
					</li>
					<li>
						<a href="page_calendar.html"><i class="fa fa-calendar"></i> My Calendar</a>
					</li>
					<li>
						<a href="page_inbox.html"><i class="fa fa-envelope"></i> My Inbox <span class="badge badge-danger">
						3 </span>
						</a>
					</li>
					<li>
						<a href="#"><i class="fa fa-tasks"></i> My Tasks <span class="badge badge-success">
						7 </span>
						</a>
					</li>
					<li class="divider">
					</li>
					<li>
						<a href="login.html"><i class="fa fa-key"></i> 退出登录</a>
					</li>
				</ul>
			</li>
			<!-- END USER LOGIN DROPDOWN -->
		</ul>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END TOP NAVIGATION BAR -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
		<div class="page-sidebar navbar-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->
			<!-- DOC: for circle icon style menu apply page-sidebar-menu-circle-icons class right after sidebar-toggler-wrapper -->
			<ul class="page-sidebar-menu">
				<li class="sidebar-toggler-wrapper">
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler">
					</div>
					<div class="clearfix">
					</div>
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
				</li>
				<li class="sidebar-search-wrapper">
					<form class="search-form" role="form" action="index.jsp" method="get">
						<div class="input-icon right">
							<i class="icon-magnifier"></i>
							<input type="text" class="form-control" name="query" placeholder="Search...">
						</div>
					</form>
				</li>
				<li class="my-menu start active ">
					<a href="javascript:;">
					<i class="icon-home"></i>
					<span class="title">主页</span>
					<span class="selected"></span>
					</a>
				</li>
				<li class="my-menu">
					<a href="javascript:;" data-toggle="tab" data-target="#tab_1_0" onclick="allSeller('pageNum=1&&pageSize=30')">
					<i class="icon-present"></i>
					<span class="title">商家信息</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_1_1" onclick="auditSeller('pageNum=1&&pageSize=30')">
							已审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_1_2" onclick="notAuditSeller('pageNum=1&&pageSize=30')">
							未审核</a>
						</li>
						<li>
							<a href="#tab_1_4" data-toggle="tab" onclick="notThoughSeller('pageNum=1&&pageSize=30')">
							未通过审核</a>
						</li>
						<li>
							<a href="#tab_1_3" data-toggle="tab" onclick="thoughSeller('pageNum=1&&pageSize=30')">
							通过审核</a>
						</li>
					</ul>
				</li>
				<li class="my-menu">
					<a href="javascript:;" data-toggle="tab" data-target="#tab_2_0" onclick="allRider('pageNum=1&&pageSize=30')">
					<i class="fa fa-motorcycle"></i>
					<span class="title">骑手信息</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_1" onclick="auditRider('pageNum=1&&pageSize=30')">
							已审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_2" onclick="notAuditRider('pageNum=1&&pageSize=30')">
							未审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_3" onclick="thoughRider('pageNum=1&&pageSize=30')">
							通过</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_4" onclick="notThoughRider('pageNum=1&&pageSize=30')">
							未通过</a>
						</li>
					</ul>
				</li>
				<li class="my-menu">
					<a href="javascript:;" data-toggle="tab" data-target="#tab_1_0" onclick="allSeller('pageNum=1&&pageSize=30')">
						<i class="icon-docs"></i>
						<span class="title">任务</span>
						<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_1_1" onclick="auditSeller('pageNum=1&&pageSize=30')">
								已审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_1_2" onclick="notAuditSeller('pageNum=1&&pageSize=30')">
								未审核</a>
						</li>
						<li>
							<a href="#tab_1_4" data-toggle="tab" onclick="notThoughSeller('pageNum=1&&pageSize=30')">
								未通过审核</a>
						</li>
						<li>
							<a href="#tab_1_3" data-toggle="tab" onclick="thoughSeller('pageNum=1&&pageSize=30')">
								通过审核</a>
						</li>
					</ul>
				</li>
				<li class="my-menu">
					<a href="javascript:;" data-toggle="tab" data-target="#tab_2_0" onclick="allRider('pageNum=1&&pageSize=30')">
						<i class="icon-user"></i>
						<span class="title">个人信息</span>
						<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_1" onclick="auditRider('pageNum=1&&pageSize=30')">
								已审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_2" onclick="notAuditRider('pageNum=1&&pageSize=30')">
								未审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_3" onclick="thoughRider('pageNum=1&&pageSize=30')">
								通过</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_2_4" onclick="notThoughRider('pageNum=1&&pageSize=30')">
								未通过</a>
						</li>
					</ul>
				</li>

			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
							<h4 class="modal-title">Modal title</h4>
						</div>
						<div class="modal-body">
							 Widget settings form goes here
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-success">Save changes</button>
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<!-- BEGIN STYLE CUSTOMIZER -->
			<div class="theme-panel hidden-xs hidden-sm">
				<div class="toggler">
					<i class="fa fa-gear"></i>
				</div>
				<div class="theme-options">
					<div class="theme-option theme-colors clearfix">
						<span>
						主题颜色 </span>
						<ul>
							<li class="color-black current color-default tooltips" data-style="default" data-original-title="Default">
							</li>
							<li class="color-grey tooltips" data-style="grey" data-original-title="Grey">
							</li>
							<li class="color-blue tooltips" data-style="blue" data-original-title="Blue">
							</li>
							<li class="color-red tooltips" data-style="red" data-original-title="Red">
							</li>
							<li class="color-light tooltips" data-style="light" data-original-title="Light">
							</li>
						</ul>
					</div>
					<div class="theme-option">
						<span>
						布局 </span>
						<select class="layout-option form-control input-small">
							<option value="fluid" selected="selected">流式</option>
							<option value="boxed">盒式</option>
						</select>
					</div>
					<div class="theme-option">
						<span>
						头部 </span>
						<select class="header-option form-control input-small">
							<option value="fixed" selected="selected">固定</option>
							<option value="default">默认</option>
						</select>
					</div>
					<div class="theme-option">
						<span>
						工具栏 </span>
						<select class="sidebar-option form-control input-small">
							<option value="fixed">固定</option>
							<option value="default" selected="selected">默认</option>
						</select>
					</div>
					<div class="theme-option">
						<span>
						工具栏位置 </span>
						<select class="sidebar-pos-option form-control input-small">
							<option value="left" selected="selected">左</option>
							<option value="right">右</option>
						</select>
					</div>
					<div class="theme-option">
						<span>
						页面底部 </span>
						<select class="footer-option form-control input-small">
							<option value="fixed">固定</option>
							<option value="default" selected="selected">默认</option>
						</select>
					</div>
				</div>
			</div>
			<!-- END BEGIN STYLE CUSTOMIZER -->
			<!-- BEGIN PAGE HEADER-->
			<h3 class="page-title">
			XXX <small>订餐系统管理后台</small>
			</h3>
			<div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="fa fa-home"></i>
						<a href="index.jsp">首页</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="#">Dashboard</a>
					</li>
				</ul>
			</div>
			<!-- END PAGE HEADER-->
			<!-- BEGIN OVERVIEW STATISTIC BARS-->
			<div class="row stats-overview-cont">
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block">
						<div class="display stat ok huge">
							<span class="line-chart">
							5, 6, 7, 11, 14, 10, 15, 19, 15, 2 </span>
							<div class="percent">
								 +66%
							</div>
						</div>
						<div class="details">
							<div class="title">
								 商家数量
							</div>
							<div class="numbers">
								 1360
							</div>
						</div>
						<div class="progress">
							<span style="width: 40%;" class="progress-bar progress-bar-info" aria-valuenow="66" aria-valuemin="0" aria-valuemax="100">
							<span class="sr-only">
							66% Complete </span>
							</span>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block">
						<div class="display stat good huge">
							<span class="line-chart">
							2,6,8,12, 11, 15, 16, 11, 16, 11, 10, 3, 7, 8, 12, 19 </span>
							<div class="percent">
								 +16%
							</div>
						</div>
						<div class="details">
							<div class="title">
								 Site Visits
							</div>
							<div class="numbers">
								 1800
							</div>
							<div class="progress">
								<span style="width: 16%;" class="progress-bar progress-bar-warning" aria-valuenow="16" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								16% Complete </span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block">
						<div class="display stat bad huge">
							<span class="line-chart">
							2,6,8,11, 14, 11, 12, 13, 15, 12, 9, 5, 11, 12, 15, 9,3 </span>
							<div class="percent">
								 +6%
							</div>
						</div>
						<div class="details">
							<div class="title">
								 Orders
							</div>
							<div class="numbers">
								 509
							</div>
							<div class="progress">
								<span style="width: 16%;" class="progress-bar progress-bar-success" aria-valuenow="16" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								16% Complete </span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block">
						<div class="display stat good huge">
							<span class="bar-chart">
							1,4,9,12, 10, 11, 12, 15, 12, 11, 9, 12, 15, 19, 14, 13, 15 </span>
							<div class="percent">
								 +86%
							</div>
						</div>
						<div class="details">
							<div class="title">
								 Revenue
							</div>
							<div class="numbers">
								 1550
							</div>
							<div class="progress">
								<span style="width: 56%;" class="progress-bar progress-bar-warning" aria-valuenow="56" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								56% Complete </span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block">
						<div class="display stat ok huge">
							<span class="line-chart">
							2,6,8,12, 11, 15, 16, 17, 14, 12, 10, 8, 10, 2, 4, 12, 19 </span>
							<div class="percent">
								 +72%
							</div>
						</div>
						<div class="details">
							<div class="title">
								 Sales
							</div>
							<div class="numbers">
								 9600
							</div>
							<div class="progress">
								<span style="width: 72%;" class="progress-bar progress-bar-danger" aria-valuenow="72" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								72% Complete </span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block">
						<div class="display stat bad huge">
							<span class="line-chart">
							1,7,9,11, 14, 12, 6, 7, 4, 2, 9, 8, 11, 12, 14, 12, 10 </span>
							<div class="percent">
								 +15%
							</div>
						</div>
						<div class="details">
							<div class="title">
								 Stock
							</div>
							<div class="numbers">
								 2090
							</div>
							<div class="progress">
								<span style="width: 15%;" class="progress-bar progress-bar-success" aria-valuenow="15" aria-valuemin="0" aria-valuemax="100">
								<span class="sr-only">
								15% Complete </span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- END OVERVIEW STATISTIC BARS-->
			<div class="clearfix">
			</div>
			<div class="row hid hidden">
				
				<div class="col-md-12 col-sm-12">
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="icon-bell"></i>商家信息
							</div>
							<div class="tools">
								<a href="" class="collapse"></a>
								<a href="#portlet-config" data-toggle="modal" class="config"></a>
								<a href="" class="reload"></a>
								<a href="" class="remove"></a>
							</div>
						</div>
						<div class="portlet-body">
							<!--BEGIN TABS-->
							<ul class="nav nav-tabs" id="nav_1">
								<li class="active">
									<a href="#tab_1_0" data-toggle="tab" onclick="allSeller('pageNum=1&&pageSize=30')">全部商家</a>
								</li>
								<li>
									<a href="#tab_1_1" data-toggle="tab" onclick="auditSeller('pageNum=1&&pageSize=30')">已审核</a>
								</li>
								<li>
									<a href="#tab_1_2" data-toggle="tab" onclick="notAuditSeller('pageNum=1&&pageSize=30')">未审核</a>
								</li>
								<li>
									<a href="#tab_1_3" data-toggle="tab" onclick="thoughSeller('pageNum=1&&pageSize=30')">通过审核</a>
								</li>
								<li>
									<a href="#tab_1_4" data-toggle="tab" onclick="notThoughSeller('pageNum=1&&pageSize=30')">未通过审核</a>
								</li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="tab_1_0">
									<div class="table-scrollable">
								<table class="table table-striped table-bordered table-hover">
								<thead>
								<tr>
									<th>
										 商家ID
									</th>
									<th>
										 店铺名
									</th>
									<th>
										 商家姓名
									</th>
									<th>
										注册时间
									</th>
									<th>
										状态
									</th>
									<th>
									</th>
								</tr>
								</thead>
								<tbody>
								
								</tbody>
								</table>
							</div>
								</div>
								<div class="tab-pane" id="tab_1_1">
									<div class="table-scrollable">
								       <table class="table table-striped table-bordered table-hover">
								       <thead>
								       <tr>
									<th>
										 商家ID
									</th>
									<th>
										 店铺名
									</th>
									<th>
										 商家名字
									</th>
										   <th>
											   注册时间
										   </th>
										   <th>
											   状态
										   </th>
									<th>
									</th>
								</tr>
								</thead>
								<tbody>

								</tbody>
								</table>
							</div>
								</div>
								<div class="tab-pane" id="tab_1_2">
									<div class="table-scrollable">
								<table class="table table-striped table-bordered table-hover">
								<thead>
								<tr>
									<th>
										 商家ID
									</th>
									<th>
										 店铺名
									</th>
									<th>
										 商家名
									</th>
									<th>
										注册时间
									</th>
									<th>
										状态
									</th>
									<th>
									</th>
								</tr>
								</thead>
								<tbody>

								</tbody>
								</table>
							</div>
								</div>
								<div class="tab-pane" id="tab_1_3">
									<div class="table-scrollable">
								<table class="table table-striped table-bordered table-hover">
								<thead>
								<tr>
									<th>
										 商家ID
									</th>
									<th>
										 店铺名字
									</th>
									<th>
										 商家名字
									</th>
									<th>
										注册时间
									</th>
									<th>
										状态
									</th>
									<th>
									</th>
								</tr>
								</thead>
								<tbody>

								</tbody>
								</table>
							</div>
								</div>
								<div class="tab-pane" id="tab_1_4">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
											<th>
												 商家ID
											</th>
											<th>
										 		店铺名
											</th>
											<th>
												 商家名
											</th>
												<th>
													注册时间
												</th>
												<th>
													状态
												</th>
											<th>
											</th>
											</tr>
											</thead>
											<tbody>
								
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div class="page-nav page1">
                                <div id="nav_1_0" aria-label="Page navigation" class="page_1_0 active">
                                    <ul class="pagination">

                                    </ul>
                                </div>
                                <div id="nav_1_1" aria-label="Page navigation" class="page_1_1">
                                    <ul class="pagination">

                                    </ul>
                                </div>
                                <div id="nav_1_2" aria-label="Page navigation" class="page_1_2">
                                    <ul class="pagination">

                                    </ul>
                                </div>
                                <div id="nav_1_3" aria-label="Page navigation" class="page_1_3">
                                    <ul class="pagination">

                                    </ul>
                                </div>
                                <div id="nav_1_4" aria-label="Page navigation" class="page_1_4">
                                    <ul class="pagination">

                                    </ul>
                                </div>
                            </div>
                            <!--END TABS-->
						</div>

					</div>
				</div>
			</div>
			<div class="clearfix">
			</div>
			<div class="row hid hidden">
				<div class="col-md-12 col-sm-12">
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-motorcycle"></i>骑手信息
							</div>
							<div class="tools">
								<a href="" class="collapse"></a>
								<a href="#portlet-config" data-toggle="modal" class="config"></a>
								<a href="" class="reload"></a>
								<a href="" class="remove"></a>
							</div>
						</div>
						<div class="portlet-body">
							<!--BEGIN TABS-->
							<ul class="nav nav-tabs" id="nav_2">
								<li class="active">
									<a href="#tab_2_0" data-toggle="tab" onclick="allRider('pageNum=1&&pageSize=30')">全部骑手</a>
								</li>
								<li>
									<a href="#tab_2_1" data-toggle="tab" onclick="auditRider('pageNum=1&&pageSize=30')">已审核</a>
								</li>
								<li>
									<a href="#tab_2_2" data-toggle="tab" onclick="notAuditRider('pageNum=1&&pageSize=30')">未审核</a>
								</li>
								<li>
									<a href="#tab_2_3" data-toggle="tab" onclick="thoughRider('pageNum=1&&pageSize=30')">通过审核</a>
								</li>
								<li>
									<a href="#tab_2_4" data-toggle="tab" onclick="notThoughRider('pageNum=1&&pageSize=30')">未通过审核</a>
								</li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="tab_2_0">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													骑手ID
												</th>
												<th>
													骑手名
												</th>
												<th>
													商家姓名
												</th>
												<th>
													注册时间
												</th>
												<th>
													状态
												</th>
												<th>
												</th>
											</tr>
											</thead>
											<tbody>

											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="tab_2_1">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													骑手ID
												</th>
												<th>
													骑手名
												</th>
												<th>
													商家名字
												</th>
												<th>
													注册时间
												</th>
												<th>
													状态
												</th>
												<th>
												</th>
											</tr>
											</thead>
											<tbody>

											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="tab_2_2">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													骑手ID
												</th>
												<th>
													骑手名
												</th>
												<th>
													商家名
												</th>
												<th>
													注册时间
												</th>
												<th>
													状态
												</th>
												<th>
												</th>
											</tr>
											</thead>
											<tbody>

											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="tab_2_3">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													骑手ID
												</th>
												<th>
													骑手名字
												</th>
												<th>
													商家名字
												</th>
												<th>
													注册时间
												</th>
												<th>
													状态
												</th>
												<th>
												</th>
											</tr>
											</thead>
											<tbody>

											</tbody>
										</table>
									</div>
								</div>
								<div class="tab-pane" id="tab_2_4">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													骑手ID
												</th>
												<th>
													骑手名
												</th>
												<th>
													商家名
												</th>
												<th>
													注册时间
												</th>
												<th>
													状态
												</th>
												<th>
												</th>
											</tr>
											</thead>
											<tbody>

											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div class="page-nav page2">
								<div id="nav_2_0" aria-label="Page navigation" class="page_2_0 active">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_2_1" aria-label="Page navigation" class="page_2_1">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_2_2" aria-label="Page navigation" class="page_2_2">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_2_3" aria-label="Page navigation" class="page_2_3">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_2_4" aria-label="Page navigation" class="page_2_4">
									<ul class="pagination">

									</ul>
								</div>
							</div>
							<!--END TABS-->
						</div>

					</div>
				</div>
			</div>
			<div class="clearfix">
			</div>
			<div class="row hid hidden">
				<div class="col-md-6 col-sm-6">
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-bell"></i>Recent Orders
							</div>
							<div class="actions">
								<div class="btn-group">
									<a class="btn btn-default btn-sm dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
									Filter By <i class="fa fa-angle-down"></i>
									</a>
									<div class="dropdown-menu hold-on-click dropdown-checkboxes pull-right">
										<label><input type="checkbox"/> Finance</label>
										<label><input type="checkbox" checked=""/> Membership</label>
										<label><input type="checkbox"/> Customer Support</label>
										<label><input type="checkbox" checked=""/> HR</label>
										<label><input type="checkbox"/> System</label>
									</div>
								</div>
							</div>
						</div>
						<div class="portlet-body">
							<div class="table-scrollable">
								<table class="table table-striped table-bordered table-hover">
								<thead>
								<tr>
									<th>
										 From
									</th>
									<th>
										 Contact
									</th>
									<th>
										 Amount
									</th>
									<th>
									</th>
								</tr>
								</thead>
								<tbody>
								<tr>
									<td>
										<a href="#">Ikea</a>
									</td>
									<td>
										 Elis Yong
									</td>
									<td>
										 4560.60$ <span class="label label-warning label-sm">
										Paid </span>
									</td>
									<td>
										<a href="#" class="btn btn-default btn-xs">View</a>
									</td>
								</tr>
								<tr>
									<td>
										<a href="#">Apple</a>
									</td>
									<td>
										 Daniel Kim
									</td>
									<td>
										 360.60$
									</td>
									<td>
										<a href="#" class="btn btn-default btn-xs">View</a>
									</td>
								</tr>
								<tr>
									<td>
										<a href="#">37Singals</a>
									</td>
									<td>
										 Edward Cooper
									</td>
									<td>
										 960.50$ <span class="label label-success label-sm">
										Pending </span>
									</td>
									<td>
										<a href="#" class="btn btn-default btn-xs">View</a>
									</td>
								</tr>
								<tr>
									<td>
										<a href="#">Google</a>
									</td>
									<td>
										 Paris Simpson
									</td>
									<td>
										 1101.60$ <span class="label label-success label-sm">
										Pending </span>
									</td>
									<td>
										<a href="#" class="btn btn-default btn-xs">View</a>
									</td>
								</tr>
								<tr>
									<td>
										<a href="#">Ikea</a>
									</td>
									<td>
										 Elis Yong
									</td>
									<td>
										 4560.60$ <span class="label label-warning label-sm">
										Paid </span>
									</td>
									<td>
										<a href="#" class="btn btn-default btn-xs">View</a>
									</td>
								</tr>
								<tr>
									<td>
										<a href="#">Google</a>
									</td>
									<td>
										 Paris Simpson
									</td>
									<td>
										 1101.60$ <span class="label label-success label-sm">
										Pending </span>
									</td>
									<td>
										<a href="#" class="btn btn-default btn-xs">View</a>
									</td>
								</tr>
								</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-sm-6">
					<div class="portlet tasks-widget">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-check"></i>Tasks
							</div>
							<div class="tools">
								<a href="#portlet-config" data-toggle="modal" class="config"></a>
								<a href="" class="reload"></a>
							</div>
							<div class="actions">
								<div class="btn-group">
									<a class="btn btn-info btn-sm dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
									More <i class="fa fa-angle-down"></i>
									</a>
									<ul class="dropdown-menu pull-right">
										<li>
											<a href="#"><i class="i"></i> All Project</a>
										</li>
										<li class="divider">
										</li>
										<li>
											<a href="#">AirAsia</a>
										</li>
										<li>
											<a href="#">Cruise</a>
										</li>
										<li>
											<a href="#">HSBC</a>
										</li>
										<li class="divider">
										</li>
										<li>
											<a href="#">Pending <span class="badge badge-important">
											4 </span>
											</a>
										</li>
										<li>
											<a href="#">Completed <span class="badge badge-success">
											12 </span>
											</a>
										</li>
										<li>
											<a href="#">Overdue <span class="badge badge-warning">
											9 </span>
											</a>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="portlet-body">
							<div class="task-content">
								<div class="scroller" style="height: 305px;" data-always-visible="1" data-rail-visible1="1">
									<!-- START TASK LIST -->
									<ul class="task-list">
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Present 2013 Year IPO Statistics at Board Meeting </span>
												<span class="label label-sm label-success">
												Company </span>
												<span class="task-bell">
												<i class="fa fa-bell-o"></i>
												</span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
													<i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Hold An Interview for Marketing Manager Position </span>
												<span class="label label-sm label-danger">
												Marketing </span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
													<i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												AirAsia Intranet System Project Internal Meeting </span>
												<span class="label label-sm label-success">
												AirAsia </span>
												<span class="task-bell">
												<i class="fa fa-bell-o"></i>
												</span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
													<i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Technical Management Meeting </span>
												<span class="label label-sm label-warning">
												Company </span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"><i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Kick-off Company CRM Mobile App Development </span>
												<span class="label label-sm label-info">
												Internal Products </span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"><i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Prepare Commercial Offer For SmartVision Website Rewamp </span>
												<span class="label label-sm label-danger">
												SmartVision </span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"><i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Sign-Off The Comercial Agreement With AutoSmart </span>
												<span class="label label-sm label-default">
												AutoSmart </span>
												<span class="task-bell">
												<i class="fa fa-bell-o"></i>
												</span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"><i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												Company Staff Meeting </span>
												<span class="label label-sm label-success">
												Cruise </span>
												<span class="task-bell">
												<i class="fa fa-bell-o"></i>
												</span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"><i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
										<li class="last-line">
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												KeenThemes Investment Discussion </span>
												<span class="label label-sm label-warning">
												KeenThemes </span>
											</div>
											<div class="task-config">
												<div class="task-config-btn btn-group">
													<a class="btn btn-xs btn-default dropdown-toggle" href="#" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"><i class="fa fa-cog"></i><i class="fa fa-angle-down"></i></a>
													<ul class="dropdown-menu pull-right">
														<li>
															<a href="#"><i class="fa fa-check"></i> Complete</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-pencil"></i> Edit</a>
														</li>
														<li>
															<a href="#"><i class="fa fa-trash-o"></i> Cancel</a>
														</li>
													</ul>
												</div>
											</div>
										</li>
									</ul>
									<!-- END START TASK LIST -->
								</div>
							</div>
							<div class="task-footer">
								<span class="pull-right">
								<a href="#">See All Tasks</a> &nbsp; </span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="clearfix">
			</div>
			<div class="row hid hidden">
			
				<div class="col-md-6 col-sm-12">
					<!-- BEGIN PORTLET-->
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-signal"></i>Realtime Server Load
							</div>
							<div class="actions">
								<div class="btn-group" data-toggle="buttons">
									<label class="btn btn-success btn-sm">
									<input type="radio" name="options" class="toggle">Database </label>
									<label class="btn btn-success btn-sm">
									<input type="radio" name="options" class="toggle">Web </label>
								</div>
							</div>
						</div>
						<div class="portlet-body">
							<div id="load_statistics_loading">
								<img src="/assets/img/loading.gif" alt="loading"/>
							</div>
							<div id="load_statistics_content" class="display-none">
								<div id="load_statistics" style="height: 340px;">
								</div>
							</div>
						</div>
					</div>
					<!-- END PORTLET-->
				</div>
			</div>
			<div class="clearfix">
			</div>
			<!-- BEGIN OVERVIEW STATISTIC BLOCKS-->
			<div class="row hid hidden">
				<div class="col-md-3 col-sm-6">
					<div class="circle-stat stat-block">
						<div class="visual">
							<input class="knobify" data-width="115" data-thickness=".2" data-skin="tron" data-displayprevious="true" value="+89" data-max="100" data-min="-100"/>
						</div>
						<div class="details">
							<div class="title">
								 Unique Visits <i class="fa fa-caret-up"></i>
							</div>
							<div class="number">
								 10112
							</div>
							<span class="label label-success">
							<i class="fa fa-map-marker"></i> 123 </span>
							<span class="label label-warning">
							<i class="fa fa-comment"></i> 3 </span>
							<span class="label label-info">
							<i class="fa fa-bullhorn"></i> 3 </span>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="circle-stat stat-block">
						<div class="visual">
							<input class="knobify" data-width="115" data-fgcolor="#66EE66" data-thickness=".2" data-skin="tron" data-displayprevious="true" value="+19" data-max="100" data-min="-100"/>
						</div>
						<div class="details">
							<div class="title">
								 New Users <i class="fa fa-caret-up"></i>
							</div>
							<div class="number">
								 987
							</div>
							<span class="label label-danger">
							<i class="fa fa-bullhorn"></i> 567 </span>
							<span class="label label-default">
							<i class="fa fa-plus"></i> 16 </span>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6" data-tablet="span6 fix-margin" data-desktop="span3">
					<div class="circle-stat stat-block">
						<div class="visual">
							<input class="knobify" data-width="115" data-fgcolor="#e23e29" data-thickness=".2" data-skin="tron" data-displayprevious="true" value="-12" data-max="100" data-min="-100"/>
						</div>
						<div class="details">
							<div class="title">
								 Downtime <i class="fa fa-caret-down down"></i>
							</div>
							<div class="number">
								 0.01%
							</div>
							<span class="label label-info">
							<i class="fa fa-bookmark-empty"></i> 23 </span>
							<span class="label label-warning">
							<i class="fa fa-check"></i> 31 </span>
							<span class="label label-success">
							<i class="fa fa-briefcase"></i> 39 </span>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="circle-stat stat-block">
						<div class="visual">
							<input class="knobify" data-width="115" data-fgcolor="#fdbb39" data-thickness=".2" data-skin="tron" data-displayprevious="true" value="+58" data-max="100" data-min="-100"/>
						</div>
						<div class="details">
							<div class="title">
								 Profit <i class="fa fa-caret-up"></i>
							</div>
							<div class="number">
								 1120.32$
							</div>
							<span class="label label-success">
							<i class="fa fa-comment"></i> 453 </span>
							<span class="label label-default">
							<i class="fa fa-globe"></i> 123 </span>
						</div>
					</div>
				</div>
			</div>
			<!-- END OVERVIEW STATISTIC BLOCKS-->
			<div class="clearfix">
			</div>
			<div class="row hid hidden">
				<div class="col-md-6 col-sm-6">
					<!-- BEGIN PORTLET-->
					<div class="portlet calendar">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-calendar"></i>Event Calendar
							</div>
						</div>
						<div class="portlet-body">
							<div id="calendar">
							</div>
						</div>
					</div>
					<!-- END PORTLET-->
				</div>
				<div class="col-md-6 col-sm-6">
					<!-- BEGIN PORTLET-->
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-comments"></i>Conversations
							</div>
							<div class="tools">
								<a href="" class="collapse"></a>
								<a href="#portlet-config" data-toggle="modal" class="config"></a>
								<a href="" class="reload"></a>
								<a href="" class="remove"></a>
							</div>
						</div>
						<div class="portlet-body" id="chats">
							<div class="scroller" style="height: 435px;" data-always-visible="1" data-rail-visible1="1">
								<ul class="chats">
									<li class="in">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar1.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="out">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar2.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Lisa Wong</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="in">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar1.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="out">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Richard Doe</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="in">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Richard Doe</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="out">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar1.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="in">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Richard Doe</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </span>
										</div>
									</li>
									<li class="out">
										<img class="avatar img-responsive" alt="" src="/assets/img/avatar1.jpg"/>
										<div class="message">
											<span class="arrow">
											</span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">
											at Jul 25, 2012 11:09 </span>
											<span class="body">
											Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. sed diam nonummy nibh euismod tincidunt ut laoreet. </span>
										</div>
									</li>
								</ul>
							</div>
							<div class="chat-form">
								<div class="input-cont">
									<input class="form-control" type="text" placeholder="Type a message here..."/>
								</div>
								<div class="btn-cont">
									<span class="arrow">
									</span>
									<a href="" class="btn btn-primary icn-only"><i class="fa fa-check"></i></a>
								</div>
							</div>
						</div>
					</div>
					<!-- END PORTLET-->
				</div>
			</div>
		</div>
	</div>
	<!-- END CONTENT -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="footer">
	<div class="footer-inner">
		 2013 &copy; Conquer by keenthemes.
	</div>
	<div class="footer-tools">
		<span class="go-top">
		<i class="fa fa-angle-up"></i>
		</span>
	</div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
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
<script src="/assets/scripts/index.js" type="text/javascript"></script>
<script src="/assets/scripts/tasks.js" type="text/javascript"></script>
<script src="/js/seller.js" type="text/javascript"></script>
<script src="/js/rider.js" type="text/javascript"></script>
<script src="/js/index.js" type="text/javascript"></script>
<script src="/js/pagebar.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
jQuery(document).ready(function() {    
   App.init(); // initlayout and core plugins
   Index.init();
   Index.initJQVMAP(); // init index page's custom scripts
   Index.initCalendar(); // init index page's custom scripts
   Index.initCharts(); // init index page's custom scripts
   Index.initChat();
   Index.initMiniCharts();
   Index.initPeityElements();
   Index.initKnowElements();
   Index.initDashboardDaterange();
   Tasks.initDashboardWidget();
});
</script>
<!-- END JAVASCRIPTS -->
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  ga('create', 'UA-37564768-1', 'keenthemes.com');
  ga('send', 'pageview');
</script>
</body>

<!-- END BODY -->
</html>