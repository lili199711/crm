<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>客户关系管理系统</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo1.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />

<!-- 弹框样式 -->
<link rel="stylesheet" type="text/css" href="css/jquery.alertable.css">

<script type="text/javascript" src="script/jquery-1.4.1.js"></script>
<script type="text/javascript">
	//让表单提交
	function userlogin(){
		//使用dom(id 选择器)操作选中表单 让表单提交
		$("#loginform").submit();
	}

	/* 弹框提示错误信息 */
	var msg ="${msg}";
	if(msg){
		$(function() {
			$.alertable.alert(msg, {
				  show: function() {
					$(this.overlay).velocity('transition.fadeIn');        
					$(this.modal).velocity('transition.flipBounceYIn');
				  },
				  hide: function() {
					$(this.overlay).velocity('transition.fadeOut');
					$(this.modal).velocity('transition.perspectiveUpOut');
				  } 
				});
	   });
	}
</script>
<!-- 最终移除页面的msg信息 -->
<c:remove var="msg" scope="session"/>
<!-- 弹框插件-->
 <script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>  
 <script src='js/velocity.min.js' type="text/javascript"></script> 
 <script src='js/velocity.ui.min.js' type="text/javascript"></script>  
<script src="js/jquery.alertable.js" type="text/javascript"></script>
</head>
<body>
	<div class="container demo-1">
		<div class="content">
			<div id="large-header" class="large-header">
			    <!--利用canvas绘制粒子效果  -->
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box">
					<h1>客户关系管理系统</h1>
					<form action="login" name="f" method="post" id="loginform">
						<div class="input_outer">
							<span class="u_user"></span> <input name="username" class="text"
								style="color: #FFFFFF !important" type="text"
								placeholder="请输入账户">
						</div>
						<div class="input_outer">
							<span class="us_uer"></span> <input name="password" class="text"
								style="color: #FFFFFF !important; position: absolute; z-index: 100;"
								value="" type="password" placeholder="请输入密码">
						</div>
						<div class="mb2">
							 <span class="act-but submit" style="color: #FFFFFF" onclick="userlogin();">登录</span>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<script src="js/TweenLite.min.js"></script>
	<script src="js/EasePack.min.js"></script>
	<script src="js/rAF.js"></script>
	<!-- 星空连接样式插件 -->
	<script src="js/demo-1.js"></script>
</body>
</html>