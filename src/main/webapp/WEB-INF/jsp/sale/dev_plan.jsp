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
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/test1.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script/common.js">
</script>
</head>
<body>
   <table width="100%" cellSpacing=0 cellPadding=0 border="0px">
		<tr>
			<td class="page_title">销售机会管理</td>
			<td class="page_title_middle">&nbsp;</td>
			<td width=3><IMG height=32 src="images/m_mpr.gif" width=3></td>
		</tr>
	</table>
	<table class="query_form_table" cellSpacing=1 cellPadding=1>
		<tr>
			<td width=100% height=30 align=left background="images/m_table_top.jpg"
				colspan="6"><strong>&nbsp;制定计划</strong>
			</td>
		</tr>
		<tr>
			<th>编号</th>
			<td>${requestScope.sc.chcId }</td>
			<th>机会来源</th>
			<td>${requestScope.sc.chcSource }</td>
		</tr>
		<tr>
			<th>客户名称</th>
			<td>${requestScope.sc.chcCustName }</td>
			<th>成功机率（%）</th>
			<td>${requestScope.sc.chcRate }&nbsp;</td>
		</tr>
		<tr>
			<th>概要</th>
			<td colspan="3">${requestScope.sc.chcTitle }</td>
		</tr>
		<tr>
			<th>联系人</th>
			<td>${requestScope.sc.chcLinkman }</td>
			<th>联系人电话</th>
			<td>${requestScope.sc.chcTel }</td>
		</tr>
		<tr>
			<th>机会描述</th>
			<td colspan="3">${requestScope.sc.chcDesc }</td>
		</tr>
		<tr>
			<th>创建人</th>
			<td>${requestScope.sc.chcCreateBy }</td>
			<th>指派给</th>
			<td>${requestScope.sc.chcDueTo }</td>
		</tr>
		<tr>
			<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
				<a href="help"><input class="common_button" type="button" value="帮助"></a>&nbsp;&nbsp;&nbsp; 
			<c:choose>
				<c:when test="${sc.chcCreateBy eq 'zhuguan' }">
				<a href="planController/executeBefore?chcId=${sc.chcId }">
					<button class="common_button">执行</button></a> &nbsp;&nbsp;&nbsp; 
				</c:when>	
				<c:otherwise>
					<button class="common_button" ><font color="#ABA8AB">执行</font></button>&nbsp;&nbsp;&nbsp;
				</c:otherwise>	
			</c:choose>
				<a href="planController/findPage?curPage=${psc.pageNum }"><input class="common_button" type="button" value="返回"></a>
			</td>
		</tr>
	</table>
	<br />
</body>
</html>