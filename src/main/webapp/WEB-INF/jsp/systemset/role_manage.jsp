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
<title>My JSP 'role_manage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/test1.css"
	rel="stylesheet" type="text/css">
<script src="script/common.js"></script>
<script src="js/changetrcolor.js" type="text/javascript"></script>
</head>
<body>
   <table width="100%" cellSpacing=0 cellPadding=0 border="0px">
   <tr>
   <td class="page_title">系统设置</td>
   <td class="page_title_middle">&nbsp;</td>
   <td width=3><img height=32 src="images/m_mpr.gif" width=3></td>
	</tr>
</table>
<table class="query_form_table" cellSpacing=1 cellPadding=1>
	<tr>
    	<td  width=100% height=30 align=left background = "images/m_table_top.jpg" colspan="6">
    		<strong>&nbsp;角色管理</strong>
				<a href="showPage/showAddRole"><input class="common_button" type="button" value="新增"></a>
    	</td>
    </tr>
	<tr>
		
</table>
<br />

<table id="data_list_table" class="data_list_table" cellSpacing=1 cellPadding=1>
	<tr>
		<th id="firstth">编号</th>
		<th>角色名</th>
		<th>描述</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${sessionScope.role }" var="roles">
	<tr>
		<td class="list_data_number">${roles.roleId }</td>
		<td class="list_data_ltext" >${roles.roleName }</td>
		<td class="list_data_ltext" >${roles.roleDesc }</td>
		<td class="list_data_text">
		<c:if test="${roles.roleFlag==1 }">
			有效
		</c:if>
		<c:if test="${roles.roleFlag==0 }">
			无效
		</c:if>
		</td>
		<td class="list_data_op">
			<img onClick="to('/Crm_XN/roleManageController/roleUpdateBefore?roleId=${roles.roleId}');" 
			                  title="编辑" 
			                  src="images/bt_edit.gif" 
			                  class="op_button" />
			<img onClick="to('/Crm_XN/roleManageController/roleDelete?roleId=${roles.roleId}');"
							  title="删除" 
							  src="images/bt_del.gif" 
							  class="op_button" />
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>