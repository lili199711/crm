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
<title>My JSP 'role_update.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/test1.css"
	rel="stylesheet" type="text/css">
<script src="script/common.js"></script>
</head>
<body>
   <table width="100%" cellSpacing=0 cellPadding=0 border="0px">
		<tr>
			<td class="page_title">系统设置</td>
			<td class="page_title_middle">&nbsp;</td>
			<td width=3><IMG height=32
				src="images/m_mpr.gif" width=3></td>
		</tr>
	</table>
	<form action="roleManageController/roleUpdateAfter" method="post">
		<table class="query_form_table" cellSpacing=1 cellPadding=1>
			<tr>
				<td width=100% height=30 align=left
					background="images/m_table_top.jpg"
					colspan="6"><strong>&nbsp;修改角色</strong></td>
			</tr>
			<tr>
				<th>编号</th>
				<td><input readonly="readonly" name="roleId" type="text"
					value="${sessionScope.role.roleId }" /></td>
			</tr>
			<tr>
				<th>角色名</th>
				<td><input type="text" name="roleName"
					value="${sessionScope.role.roleName }" /><span class="red_star">*</span></td>

			</tr>
			<tr>
				<th>描述</th>
				<td><textarea cols="50" rows="4" name="roleDesc">${sessionScope.role.roleDesc }</textarea>
					<span class="red_star">*</span></td>
			</tr>
			<tr>
				<th>状态</th>
				<c:if test="${sessionScope.role.roleFlag==1 }">
				<td colspan="3"><input name="roleFlag" type="radio" value="1"
					checked="checked" />有效
					<input name="roleFlag" type="radio" value="0"/>无效
				</td>
				</c:if>
				<c:if test="${sessionScope.role.roleFlag==0 }">
				<td colspan="3"><input name="roleFlag" type="radio" value="1"/>有效
					<input name="roleFlag" type="radio" value="0" 
					checked="checked" />无效
				</td>
				</c:if>
				
			</tr>
			<tr>
				<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
					<a href="help"><input class="common_button" type="button"
						value="帮助"></a>&nbsp;&nbsp;&nbsp;
					<button class="common_button" onClick="back()">返回</button>
					&nbsp;&nbsp; <input class="common_button" type="submit" value="保存 " />
				</td>
			</tr>

		</table>
	</form>
</body>
</html>