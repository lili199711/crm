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
<title>联系人</title>
<meta charset="UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/test1.css" rel="stylesheet" type="text/css">
<script src="script/common.js"></script>
<script src="script/jquery-1.4.1.js"></script>
</head>
<body>
<table width="100%" cellSpacing=0 cellPadding=0 border="0px">
	<tr>
		<td class="page_title">客户信息管理</td>
		<td class="page_title_middle">&nbsp;</td>
		<td width=3><IMG height=32 src="images/m_mpr.gif" width=3></td>
	</tr>
</table>
<table class="query_form_table" cellSpacing=1 cellPadding=1>
	<tr>
		<td width=100% height=30 align=left background="images/m_table_top.jpg" 
			colspan="6"><strong>&nbsp;客户信息 > 联系人 </strong></td>
	</tr>
	<tr>
		<td colspan="4" align="center"><a href="help">
			<input class="common_button" type="button" value="帮助"></a>&nbsp;&nbsp;
			<a href="showPage/showlinkmanAdd">
				<button class="common_button" type="button">新建</button></a>&nbsp;&nbsp;
			<a href="customerController/findCustPage?curPage=1"><input class="common_button" type="button" value="返回"></a>
		</td>
	</tr>
</table>
<br />
<table class="data_list_table" cellSpacing=1 cellPadding=1>
	<tr>
		<th>姓名</th>
		<th>性别</th>
		<th>职位</th>
		<th>办公电话</th>
		<th>手机</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${requestScope.link }" var="links">
	<tr>
		<td class="list_data_text">${links.lkmName }</td>
		<td class="list_data_ltext">${links.lkmSex }</td>
		<td class="list_data_text">${links.lkmPostion }</td>
		<td class="list_data_text">${links.lkmTel }</td>
		<td class="list_data_text">${links.lkmMobile }</td>
		<td class="list_data_op">${links.lkmMemo }</td>
		<td class="list_data_op">
		<img onClick="to('linkManController/linkEditBefore?lkmId=${links.lkmId}');" title="编辑"  src="images/bt_edit.gif" class="op_button"/>
		<img onClick="to('linkManController/linkDelete?lkmId=${links.lkmId}');" title="删除" src="images/bt_del.gif" class="op_button" /></td>
	</tr>
	</c:forEach>
	
</table>
</body>
</html>