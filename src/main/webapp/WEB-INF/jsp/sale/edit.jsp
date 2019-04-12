<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta charset="UTF-8">
<title>jb-aptech毕业设计项目</title>
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
			<TD class="page_title">销售机会管理</TD>
			<TD class="page_title_middle">&nbsp;</TD>
			<TD width=3><IMG height=32
				src="images/m_mpr.gif" width=3></TD>
	</table>
	<form action="chanceController/chanceEditAfter" method="post">
		<table class="query_form_table" cellSpacing=1 cellPadding=1>
			<tr>
				<td width=100% height=30 align=left background="images/m_table_top.jpg"
					colspan="6"><strong>&nbsp;销售机会编辑</strong></td>
			</tr>

			<tr>
				<th>编号</th>
				<td><input readonly name="chcId"
					value="${requestScope.sc.chcId }" /></td>
				<th>机会来源</th>
				<td><input type="text" name="chcSource"
					value="${requestScope.sc.chcSource }" size="20" /></td>
			</tr>
			<tr>
				<th>客户名称</th>
				<td><input type="text" name="chcCustName"
					value="${requestScope.sc.chcCustName }" /><span
					class="red_star">*</span></td>
				<th>成功机率（%）</th>
				<td><input type="text" name="chcRate"
					value="${requestScope.sc.chcRate }" /><span class="red_star">*</span></td>
			</tr>
			<tr>
				<th>概要</th>
				<td colspan="3"><input type="text" name="chcTitle"
					value="${requestScope.sc.chcTitle }" size="52" /><span
					class="red_star">*</span></td>
			</tr>
			<tr>
				<th>联系人</th>
				<td><input type="text" name="chcLinkman"
					value="${requestScope.sc.chcLinkman }" size="20" /></td>
				<th>联系人电话</th>
				<td><input type="text" name="chcTel"
					value="${requestScope.sc.chcTel }"  size="20" /></td>
			</tr>
			<tr>
				<th>机会描述</th>
				<td colspan="3"><textarea rows="6" cols="50" type="text" name="chcDesc"></textarea>
					<span class="red_star">*</span>
				</td>
			</tr>
			<tr>
				<th>创建人</th>
				<td colspan="3"><input name="chcCreateBy" value="${requestScope.sc.chcCreateBy }" readonly size="20" />
				<span class="red_star">*</span></td>
			</tr>

			<tr>
				<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
					<a href="help">
					<input class="common_button" type="button" value="帮助"></a>&nbsp;&nbsp;&nbsp;
					<input class="common_button" type="submit" value="保存">
				</td>
			</tr>
		</table>
	</form>
	<br />
</body>
</html>