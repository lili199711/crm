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
<meta charset="utf-8">
<title>客户关系管理系统</title>

<link rel="stylesheet" type="text/css" href="css/nav.css">
<link rel="stylesheet" type="text/css" href="css/iconfont.css">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/nav.js"></script>

<script type="text/javascript">
	//点击跳转
	function forward(url) {
		parent.frames["mainFrame"].location.href = url;
	}
</script>
</head>
<body>
	<div class="nav">
		<div class="nav-top">
			<div id="mini"
				style="border-bottom: 1px solid rgba(255, 255, 255, .1)">
				<img src="images/mini.png">
			</div>
		</div>
		<ul>
			<c:if test="${sessionScope.user.usrRoleId>1&&sessionScope.user.usrRoleId<5 }">
			<!--只有主管 高管 客户经理有营销管理-->
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon  icon-iconset0253"></i><span>营销管理</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<c:if test="${sessionScope.user.usrRoleId==2||sessionScope.user.usrRoleId==3 }">
					<!--只有主管和高管才有销售机会管理   -->
					<li onclick=""><a href="chanceController/findChancePage?curPage=1" target="mainFrame"><span>销售机会管理</span></a></li>
					</c:if>
					<c:if test="${sessionScope.user.usrRoleId==2||sessionScope.user.usrRoleId==4 }">
					<!--只有经理和高管才有客户开发计划  -->
					<li onclick=""><a href="planController/findPlanPage?curPage=1" target="mainFrame"><span>客户开发计划</span></a></li>
					</c:if>
				</ul>
			</li>
			</c:if>
			<!-- 都有 -->
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon-touxiang"></i><span>客户管理</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li onclick=""><a href="customerController/findCustPage?curPage=1" target="mainFrame"><span>客户信息管理</span></a></li>
				</ul>
			</li>
			<c:if test="${sessionScope.user.usrRoleId>1&&sessionScope.user.usrRoleId<5 }">
			<!--只有高管 主管 经理有  -->
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon-worldwide"></i><span>服务管理</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<c:if test="${sessionScope.user.usrRoleId==2||sessionScope.user.usrRoleId==4 }">
					<!-- 高管、经理有 -->
					<li onclick=""><a href="showPage/showAdd"
						target="mainFrame"><span>服务创建</span></a></li>
					</c:if>
					<c:if test="${sessionScope.user.usrRoleId==2||sessionScope.user.usrRoleId==3 }">
					<!-- 高管、主管有 -->
					<li onclick=""><a href="serviceController/findSerPage?curPage=1"
						target="mainFrame"><span>服务分配</span></a></li>
					</c:if>
					<c:if test="${sessionScope.user.usrRoleId==2||sessionScope.user.usrRoleId==4 }">
					<!-- 高管、经理有 -->
					<li onclick=""><a href="serviceController/findDelPage?curPage=1"
						target="mainFrame"><span>服务处理</span></a></li>
					</c:if>
					<c:if test="${sessionScope.user.usrRoleId==2||sessionScope.user.usrRoleId==3 }">
					<!-- 高管、主管有 -->
					<li onclick=""><a href="serviceController/findFeedPage?curPage=1"
						target="mainFrame"><span>服务反馈</span></a></li>
					</c:if>
				</ul>
			</li>
			</c:if>
			<c:if test="${sessionScope.user.usrRoleId<4 }">
			<!--只有管理员 高管 主管有  -->
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon-alarm"></i><span>统计报表</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li onclick=""><a href="showPage/showContr"
						target="mainFrame"><span>客户贡献分析</span></a></li>
					<li onclick=""><a href="showPage/showCons"
						target="mainFrame"><span>客户构成分析</span></a></li>
				</ul>
			</li>
			</c:if>
			<!-- 都有 -->
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon-shengyuliuliang"></i><span>基础数据</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li onclick=""><a href="basicController/findProPage?curPage=1" target="mainFrame"><span>查询产品信息</span></a></li>
					<li onclick=""><a href="basicController/findStoPage?curPage=1" target="mainFrame"><span>查询库存</span></a></li>
				</ul>
			</li>
			<c:if test="${sessionScope.user.usrRoleId==1||sessionScope.user.usrRoleId==2 }">
			<!--只有系统管理员和高管有  -->
			<li class="nav-item"><a href="javascript:;"><i
					class="my-icon nav-icon icon-chilun"></i><span>系统设置</span><i
					class="my-icon nav-more"></i></a>
				<ul>
					<li onclick=""><a href="roleManageController/roleManage"
						target="mainFrame"><span>角色管理</span></a></li>
					<li onclick=""><a href="userManageController/userManage?curPage=1"
						target="mainFrame"><span>用户管理</span></a></li>
					<li onclick=""><a href="logController/logReview?curPage=1" 
						target="mainFrame"><span>日志查看</span></a></li>
				</ul>
			</li>
			</c:if>
		</ul>
	</div>
</body>
</html>