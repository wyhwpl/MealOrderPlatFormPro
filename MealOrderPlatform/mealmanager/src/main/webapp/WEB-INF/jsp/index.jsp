<%@ page import="java.net.URLDecoder" %>
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

<%
	String imgUrl="/images/admindefault";
	String adminId="1";
	String adminName="管理员";
	Cookie[] cookies=request.getCookies();
	if(cookies!=null){
		for (int i = 0; i < cookies.length; i++) {
			if("imgUrl".equals(cookies[i].getName())){
			    if(cookies[i].getValue()!=null&&(!cookies[i].getValue().equals(""))){
			        imgUrl=cookies[i].getValue();
				}
			}
			if("adminId".equals(cookies[i].getName())){
			    adminId=cookies[i].getValue();
			}
			if("adminName".equals(cookies[i].getName())){
			    adminName= URLDecoder.decode(cookies[i].getValue(),"UTF-8");
			}
		}
	}
	String smallImag=imgUrl+"_29x29.jpg";
	String midImg=imgUrl+"_45x45.jpg";
%>
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

		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
		<img src="/assets/img/menu-toggler.png" alt=""/>
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<ul class="nav navbar-nav pull-right">
			<!-- BEGIN NOTIFICATION DROPDOWN -->

			<!-- END NOTIFICATION DROPDOWN -->
			<!-- BEGIN INBOX DROPDOWN -->

			<li class="devider">
				 &nbsp;
			</li>
			<!-- BEGIN USER LOGIN DROPDOWN -->
			<li class="dropdown user" onmouseover="showTaskNum(<%=adminId%>)">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
				<img alt="" src="<%=smallImag%>"/>
				<span class="username username-hide-on-mobile"><%=adminName%></span>
				<i class="fa fa-angle-down"></i>
				</a>
				<ul class="dropdown-menu">
					<li>
						<a href="javascript:;" onclick="adminInfo()"><i class="fa fa-user"></i>我的资料</a>
					</li>
					<li>
						<a href="javascript:;" onclick="taskInfo()"><i class="fa fa-tasks"></i>我的任务<span class="badge badge-success">
						7 </span>
						</a>
					</li>
					<li class="divider">
					</li>
					<li>
						<a href="/logout"><i class="fa fa-key"></i> 退出登录</a>
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
				<li class="my-menu active">
					<a href="javascript:;">
						<i class="icon-home"></i>
						<span class="title">主页</span>
						<span class="selected"></span>
					</a>
				</li>
				<li class="my-menu">
					<a href="javascript:;">
					<i class="icon-present"></i>
					<span class="title">商家信息</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="#tab_1_1" data-toggle="tab" onclick="auditSeller('pageNum=1&&pageSize=30')">
							已审核</a>
						</li>
						<li>
							<a href="#tab_1_2" data-toggle="tab" onclick="notAuditSeller('pageNum=1&&pageSize=30')">
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
					<a href="javascript:;">
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
					<a href="javascript:;">
						<i class="icon-present"></i>
						<span class="title">菜品信息</span>
						<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_3_1" onclick="auditFood('pageNum=1&&pageSize=30')">
								已审核</a>
						</li>
						<li>
							<a href="javascript:;" data-toggle="tab" data-target="#tab_3_2" onclick="notAuditFood('pageNum=1&&pageSize=30')">
								未审核</a>
						</li>
						<li>
							<a href="#tab_3_4" data-toggle="tab" onclick="notThoughFood('pageNum=1&&pageSize=30')">
								未通过审核</a>
						</li>
						<li>
							<a href="#tab_3_3" data-toggle="tab" onclick="thoughFood('pageNum=1&&pageSize=30')">
								通过审核</a>
						</li>
					</ul>
				</li>
				<li class="my-menu">
					<a href="javascript:;" class="my-task" data-toggle="tab" onclick="getSomeTasks(10,<%=adminId%>)">
						<i class="icon-docs"></i>
						<span class="title">任务</span>
						<span class="selected"></span>
					</a>
				</li>
				<li class="my-menu">
					<a href="javascript:;" class="my-info" data-toggle="tab" onclick="getAdminInfo('<%=adminId%>')">
						<i class="icon-user"></i>
						<span class="title">个人信息</span>
						<span class="selected "></span>
					</a>

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
					<div class="stats-overview stat-block color-first">

						<div class="details">
							<div class="title">
								 商家数量
							</div>
							<div class="numbers">
								 0
							</div>
						</div>

					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block color-second">

						<div class="details">
							<div class="title">
								 骑手数量
							</div>
							<div class="numbers">
								 0
							</div>

						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block color-third">
						<div class="details">
							<div class="title">
								 用户数量
							</div>
							<div class="numbers">
								 0
							</div>

						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block color-forth">

						<div class="details">
							<div class="title">
								 订单交易数量
							</div>
							<div class="numbers">
								 0
							</div>

						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block color-fifth">

						<div class="details">
							<div class="title">
								 菜品数量
							</div>
							<div class="numbers">
								 0
							</div>

						</div>
					</div>
				</div>
				<div class="col-md-2 col-sm-4">
					<div class="stats-overview stat-block color-sixth">

						<div class="details">
							<div class="title">
								 任务完成量
							</div>
							<div class="numbers">
								 0
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- END OVERVIEW STATISTIC BARS-->
			<div class="row hid hidden">
				<div class="col-md-2 col-sm-2"></div>
				<div class="col-md-8 col-sm-8">
					<div class="portlet tasks-widget">
						<div class="portlet-title">
							<div class="caption">
								<i class="icon-bell"></i>最新消息
							</div>
						</div>
						<div class="portlet-body">
							<div class="task-content">
								<div class="scroller" style="height: 305px;" data-always-visible="1" data-rail-visible1="1">
									<!-- START TASK LIST -->
									<ul class="news task-list">
										<li>
											<div class="task-checkbox">
												<i class="icon-bell"></i>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												 </span>
												<span class="label label-sm label-success">
												</span>
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
												</span>
												<span class="label label-sm label-danger">
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
												 </span>
												<span class="label label-sm label-success">
												 </span>
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
												</span>
												<span class="label label-sm label-warning">
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
												</span>
												<span class="label label-sm label-info">
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
												</span>
												<span class="label label-sm label-danger">
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
												</span>
												<span class="label label-sm label-default">
												</span>
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
												 </span>
												<span class="label label-sm label-success">
												 </span>
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
												</span>
												<span class="label label-sm label-warning">
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
									</ul>
									<!-- END START TASK LIST -->
								</div>
							</div>
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
													地址
												</th>
												<th>
													性别
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
													地址
												</th>
												<th>
													性别
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
													地址
												</th>
												<th>
													性别
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
													地址
												</th>
												<th>
													性别
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
													地址
												</th>
												<th>
													性别
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

				<div class="col-md-12 col-sm-12">
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="icon-bell"></i>菜品信息
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
							<ul class="nav nav-tabs" id="nav_3">
								<li class="active">
									<a href="#tab_3_0" data-toggle="tab" onclick="allFood('pageNum=1&&pageSize=30')">全部商家</a>
								</li>
								<li>
									<a href="#tab_3_1" data-toggle="tab" onclick="auditFood('pageNum=1&&pageSize=30')">已审核</a>
								</li>
								<li>
									<a href="#tab_3_2" data-toggle="tab" onclick="notAuditFood('pageNum=1&&pageSize=30')">未审核</a>
								</li>
								<li>
									<a href="#tab_3_3" data-toggle="tab" onclick="thoughFood('pageNum=1&&pageSize=30')">通过审核</a>
								</li>
								<li>
									<a href="#tab_3_4" data-toggle="tab" onclick="notThoughFood('pageNum=1&&pageSize=30')">未通过审核</a>
								</li>
							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="tab_3_0">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													菜品ID
												</th>
												<th>
													菜品名
												</th>
												<th>
													菜品描述
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
								<div class="tab-pane" id="tab_3_1">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													菜品ID
												</th>
												<th>
													菜品名
												</th>
												<th>
													菜品描述
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
								<div class="tab-pane" id="tab_3_2">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													菜品ID
												</th>
												<th>
													菜品名
												</th>
												<th>
													菜品描述
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
								<div class="tab-pane" id="tab_3_3">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													菜品ID
												</th>
												<th>
													菜品名
												</th>
												<th>
													菜品描述
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
								<div class="tab-pane" id="tab_3_4">
									<div class="table-scrollable">
										<table class="table table-striped table-bordered table-hover">
											<thead>
											<tr>
												<th>
													菜品ID
												</th>
												<th>
													菜品名
												</th>
												<th>
													菜品描述
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
							<div class="page-nav page3">
								<div id="nav_3_0" aria-label="Page navigation" class="page_3_0 active">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_3_1" aria-label="Page navigation" class="page_3_1">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_3_2" aria-label="Page navigation" class="page_3_2">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_3_3" aria-label="Page navigation" class="page_3_3">
									<ul class="pagination">

									</ul>
								</div>
								<div id="nav_3_4" aria-label="Page navigation" class="page_3_4">
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
					<div class="portlet tasks-widget">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-check"></i>任务
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
											<a href="javascript:;" onclick="getAllTasks(<%=adminId%>)"><i class="i"></i>全部任务</a>
										</li>
										<li class="divider">
										</li>
										<li>
											<a href="javascript:;" onclick="getTaskByExample(1,<%=adminId%>)">未完成任务</a>
										</li>
										<li>
											<a href="javascript:;" onclick="getTaskByExample(2,<%=adminId%>)">已完成任务</a>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="portlet-body">
							<div class="task-content">
								<div class="scroller" style="height: 305px;" data-always-visible="1" data-rail-visible1="1">
									<!-- START TASK LIST -->
									<ul class="tasks task-list">
										<li>
											<div class="task-checkbox">
												<input type="checkbox" class="liChild" value=""/>
											</div>
											<div class="task-title">
												<span class="task-title-sp">
												 </span>
												<span class="label label-sm label-success">
												 </span>
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
												 </span>
												<span class="label label-sm label-danger">
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
												</span>
												<span class="label label-sm label-success">
												 </span>
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
												</span>
												<span class="label label-sm label-warning">
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
												</span>
												<span class="label label-sm label-info">
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
												</span>
												<span class="label label-sm label-danger">
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
												</span>
												<span class="label label-sm label-default">
												</span>
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
												</span>
												<span class="label label-sm label-success">
												</span>
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
												 </span>
												<span class="label label-sm label-warning">
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
									</ul>
									<!-- END START TASK LIST -->
								</div>
							</div>
							<div class="task-footer">
								<span class="pull-right">
								<a href="javascript:;" onclick="getAllTasks(<%=adminId%>)">See All Tasks</a> &nbsp; </span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="clearfix">
			</div>
			<div class="row hid hidden">
			
				<div class="col-md-12 col-sm-12">
					<!-- BEGIN PORTLET-->
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption">
								<i class="icon-user"></i>我的资料
							</div>
							<div class="actions">

							</div>
						</div>
						<div class="portlet-body">
							<ul class="nav navbar-nav">
								<li>
									<a href="javascript:;">
										<img src="<%=midImg%>" alt="管理员的头像" class="img-circle">
									</a>
									<p>
										你好,
										<strong><%=adminName%></strong>
									</p>
								</li>
								<li class="divider"></li>
								<li>
									<div>
										<div class="head">我的任务</div>
										<div class="div-body tasknumber">
											<span class="number">1</span>个
										</div>
									</div>
								</li>
								<li class="divider"></li>
								<li>
									<div>
										<div class="head">我的成就</div>
										<div class="div-body tasknumber">
											<span class="number">1</span>个
										</div>
									</div>
								</li>
								<li class="divider"></li>
								<li><div>
									<div class="head">最近登录</div>
									<div class="div-body reclogin">
										<span class="time">1</span>个
									</div>
								</div></li>
							</ul>
						</div>
					</div>
					<!-- END PORTLET-->
				</div>
			</div>
			<div class="clearfix">
			</div>
			<div class="modal fade" id="sellerModal" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">商家详细信息</h4>
						</div>
						<div class="modal-body">
							<div class="row">
								<div class="col-md-4 col-sm-4 sellercenter">
									<img class="sellerimg" src="/images/sellerdefault.jpg" alt="商家头像">
								</div>
								<div class="col-md-8 col-sm-8">
									<div class="information">
										<div class="info-seller-span col-md-4 col-sm-4">
											<span><i class="icon-present"></i>店铺名</span>
											<span><i class="icon-user"></i>商家姓名</span>
											<span><i class="icon-credit-card"></i>身份证件号</span>
											<span><i class="icon-screen-smartphone"></i>手机号</span>

										</div>
										<div class="info-seller-label col-md-8 col-sm-8">
											<label class="s_sellername"></label>
											<label class="s_name"></label>
											<label class="s_IDcard"></label>
											<label class="s_phone"></label>
										</div>
									</div>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
							<div class="row row-top">
								<div class="info-seller-span col-md-4 col-sm-4">
									<span class="center">商家地址</span>
									<span class="center">申请时间</span>
									<span class="center">账号状态</span>
									<span class="center">通过审核时间</span>
									<span class="center">未通过原因</span>
									<span class="center">商家评分</span>
									<span class="center">注销时间</span>
								</div>
								<div class="info-seller-label col-md-8 col-sm-8">
									<label class="s_address"></label>
									<label class="s_regtime"></label>
									<label class="s_status"></label>
									<label class="s_though"></label>
									<label class="s_reason"></label>
									<label class="s_score"></label>
									<label class="s_logout"></label>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="riderModal" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">骑手详细信息</h4>
						</div>
						<div class="modal-body">
							<div class="row">
								<div class="col-md-4 col-sm-4 sellercenter">
									<img class="sellerimg" src="/images/riderdefault.jpg" alt="骑手头像">
								</div>
								<div class="col-md-8 col-sm-8">
									<div class="information">
										<div class="info-rider-span col-md-4 col-sm-4">
											<span><i class="fa fa-motorcycle"></i>骑手名</span>
											<span><i class="icon-screen-smartphone"></i>手机号</span>
											<span><i class="fa fa-transgender"></i>性别</span>
										</div>
										<div class="info-rider-label col-md-8 col-sm-8">
											<label class="r_ridername"></label>
											<label class="r_phone"></label>
											<label class="r_sex"></label>
										</div>
									</div>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
							<div class="row row-top">
								<div class="info-rider-span col-md-4 col-sm-4">
									<span class="center">骑手地址</span>
									<span class="center">申请时间</span>
									<span class="center">账号状态</span>
									<span class="center">通过审核时间</span>
									<span class="center">接单状态</span>
									<span class="center">骑手评分</span>
									<span class="center">注销时间</span>
								</div>
								<div class="info-rider-label col-md-8 col-sm-8">
									<label class="r_address"></label>
									<label class="r_regtime"></label>
									<label class="r_status"></label>
									<label class="r_though"></label>
									<label class="r_currentstatus"></label>
									<label class="r_score"></label>
									<label class="r_logout"></label>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="foodModal" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">菜品详细信息</h4>
						</div>
						<div class="modal-body">
							<div class="row">
								<div class="col-md-4 col-sm-4 sellercenter">
									<img class="sellerimg" src="/images/fooddefault.jpg" alt="菜品图片">
								</div>
								<div class="col-md-8 col-sm-8">
									<div class="information">
										<div class="info-rider-span col-md-4 col-sm-4">
											<span><i class="fa fa-motorcycle"></i>菜品名</span>
											<span><i class="icon-screen-smartphone"></i>菜品标签</span>
											<span><i class="fa fa-transgender"></i>店铺名称</span>
										</div>
										<div class="info-rider-label col-md-8 col-sm-8">
											<label class="f_foodname"></label>
											<label class="f_tag"></label>
											<label class="f_seller"></label>
										</div>
									</div>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
							<div class="row row-top">
								<div class="info-rider-span col-md-4 col-sm-4">
									<span class="center">菜品描述</span>
									<span class="center">申请时间</span>
									<span class="center">菜品状态</span>
									<span class="center">通过审核时间</span>
									<span class="center">价格</span>
									<span class="center">菜品评分</span>
									<span class="center">下架时间</span>
								</div>
								<div class="info-rider-label col-md-8 col-sm-8">
									<label class="f_description"></label>
									<label class="f_applicationtime"></label>
									<label class="f_status"></label>
									<label class="f_though"></label>
									<label class="f_price"></label>
									<label class="f_score"></label>
									<label class="f_logout"></label>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="sellerTask" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">商家详细信息</h4>
						</div>
						<div class="modal-body" data-id="">
							<div class="row">
								<div class="col-md-4 col-sm-4 sellercenter">
									<img class="sellerimg" src="/images/sellerdefault.jpg" alt="商家头像">
								</div>
								<div class="col-md-8 col-sm-8">
									<div class="information">
										<div class="info-seller-span col-md-4 col-sm-4">
											<span><i class="icon-present"></i>店铺名</span>
											<span><i class="icon-user"></i>商家姓名</span>
											<span><i class="icon-credit-card"></i>身份证件号</span>
											<span><i class="icon-screen-smartphone"></i>手机号</span>

										</div>
										<div class="info-seller-label col-md-8 col-sm-8">
											<label class="s_sellername"></label>
											<label class="s_name"></label>
											<label class="s_IDcard"></label>
											<label class="s_phone"></label>
										</div>
									</div>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
							<div class="row row-top">
								<div class="info-seller-span col-md-4 col-sm-4">
									<span class="center">商家地址</span>
									<span class="center">申请时间</span>
									<span class="center">账号状态</span>
									<span class="center">通过审核时间</span>
									<span class="center">未通过原因</span>
									<span class="center">商家评分</span>
									<span class="center">注销时间</span>
								</div>
								<div class="info-seller-label col-md-8 col-sm-8">
									<label class="s_address"></label>
									<label class="s_regtime"></label>
									<label class="s_status"></label>
									<label class="s_though"></label>
									<label class="s_reason"></label>
									<label class="s_score"></label>
									<label class="s_logout"></label>
								</div>
							</div>
							<div class="clearfix-line">

							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="riderTask" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">骑手详细信息</h4>
						</div>
						<div class="modal-body" data-id="">
							<div class="row">
								<div class="col-md-4 col-sm-4 sellercenter">
									<img class="sellerimg" src="/images/riderdefault.jpg" alt="骑手头像">
								</div>
								<div class="col-md-8 col-sm-8">
									<div class="information">
										<div class="info-rider-span col-md-4 col-sm-4">
											<span><i class="fa fa-motorcycle"></i>骑手名</span>
											<span><i class="icon-screen-smartphone"></i>手机号</span>
											<span><i class="fa fa-transgender"></i>性别</span>
										</div>
										<div class="info-rider-label col-md-8 col-sm-8">
											<label class="r_ridername"></label>
											<label class="r_phone"></label>
											<label class="r_sex"></label>
										</div>
									</div>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
							<div class="row row-top">
								<div class="info-rider-span col-md-4 col-sm-4">
									<span class="center">骑手地址</span>
									<span class="center">申请时间</span>
									<span class="center">账号状态</span>
									<span class="center">通过审核时间</span>
									<span class="center">接单状态</span>
									<span class="center">骑手评分</span>
									<span class="center">注销时间</span>
								</div>
								<div class="info-rider-label col-md-8 col-sm-8">
									<label class="r_address"></label>
									<label class="r_regtime"></label>
									<label class="r_status"></label>
									<label class="r_though"></label>
									<label class="r_currentstatus"></label>
									<label class="r_score"></label>
									<label class="r_logout"></label>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="foodTask" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">菜品详细信息</h4>
						</div>
						<div class="modal-body" data-id="">
							<div class="row">
								<div class="col-md-4 col-sm-4 sellercenter">
									<img class="sellerimg" src="/images/fooddefault.jpg" alt="菜品图片">
								</div>
								<div class="col-md-8 col-sm-8">
									<div class="information">
										<div class="info-rider-span col-md-4 col-sm-4">
											<span><i class="fa fa-motorcycle"></i>菜品名</span>
											<span><i class="icon-screen-smartphone"></i>菜品标签</span>
											<span><i class="fa fa-transgender"></i>店铺名称</span>
										</div>
										<div class="info-rider-label col-md-8 col-sm-8">
											<label class="f_foodname"></label>
											<label class="f_tag"></label>
											<label class="f_seller"></label>
										</div>
									</div>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
							<div class="row row-top">
								<div class="info-rider-span col-md-4 col-sm-4">
									<span class="center">菜品描述</span>
									<span class="center">申请时间</span>
									<span class="center">菜品状态</span>
									<span class="center">通过审核时间</span>
									<span class="center">价格</span>
									<span class="center">菜品评分</span>
									<span class="center">下架时间</span>
								</div>
								<div class="info-rider-label col-md-8 col-sm-8">
									<label class="f_description"></label>
									<label class="f_applicationtime"></label>
									<label class="f_status"></label>
									<label class="f_though"></label>
									<label class="f_price"></label>
									<label class="f_score"></label>
									<label class="f_logout"></label>
								</div>
							</div>
							<div class="clearfix-line">

							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="Confirm" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">确认框</h4>
						</div>
						<div class="modal-body" data-id="">

							<div class="row row-top">
								<div class="col-md-4 col-sm-4">

								</div>
								<div class="info-seller-label col-md-4 col-sm-4">
									<label>确认提交么?</label>
								</div>
								<div class="col-md-4 col-sm-4">

								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary btn-confirm" data-task="" data-kind="" data-id="" data-status="">确定</button>
							<button type="button" class="btn btn-primary btn-cancle" data-dismiss="modal" aria-label="Close">取消</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="reason" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">

							<h4 class="modal-title">不通过原因</h4>
						</div>
						<div class="modal-body" data-id="">

							<div class="row row-top">
								<div class="col-md-2 col-sm-2">

								</div>
								<div class="info-rider-label col-md-2 col-sm-2">
									<label>原因</label>
								</div>
								<div class="col-md-4 col-sm-4">
									<input type="text">
								</div>
								<div class="col-md-4 col-sm-4">

								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#Confirm" data-kind="seller" data-id="" data-task="" data-status="no">提交</button>
							<button type="button" class="btn btn-primary" data-dismiss="modal" aria-label="Close">关闭</button>
						</div>
					</div>
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
		 2018 &copy; Conquer by wpl xsc qx lyc.
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
<script src="/js/food.js" type="text/javascript"></script>
<script src="/js/task.js" type="text/javascript"></script>
<script src="/js/index.js" type="text/javascript"></script>
<script src="/js/pagebar.js" type="text/javascript"></script>
<script src="/js/adminInfo.js" type="text/javascript"></script>
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