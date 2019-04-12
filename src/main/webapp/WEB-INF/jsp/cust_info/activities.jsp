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
<meta charset="UTF-8">
<title>交往记录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script src="script/common.js"></script>
<script type="text/javascript" src="script/jquery-1.4.1.js"></script>
</head>
<body>
  	<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录</div>
	<div class="button_bar">
		<a href="help"><input class="common_button" type="button" value="帮助"></a>
		<a href="activitiesController/activitiesAddBefore?custId=${requestScope.cust.custId }"><button class="common_button">新建</button></a>
		<a href="customerController/findCustPage?curPage=1"><input class="common_button" type="button" value="返回"></a>
	</div>

	<br />

	<table class="data_list_table">
		<tr>
			<th>地点</th>
			<th>概要</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${requestScope.activities }" var="act">
		<tr>
			<td class="list_data_text">${act.atvPlace }</td>
			<td class="list_data_ltext">${act.atvTitle }</td>
			<td class="list_data_ltext">${act.atvDesc }</td>
			<td class="list_data_op">
			<img
				onclick="to('activitiesController/activitiesEditBefore?atvId=${act.atvId}');"
				title="编辑"
				src="images/bt_edit.gif"
				class="op_button" />
				
			<img
				onclick="to('activitiesController/activitiesDelete?atvId=${act.atvId}');"
				title="删除"
				src="images/bt_del.gif"
				class="op_button" /></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>