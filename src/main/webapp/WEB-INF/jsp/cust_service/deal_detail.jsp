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
<title>服务管理-操作</title>
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
   &nbsp;
			<table width="100%" cellSpacing=0 cellPadding=0 border="0px">
				<tr>
					<TD class="page_title">客户服务管理</TD>
					<TD class="page_title_middle">&nbsp;</TD>
					<TD width=3><IMG height=32
						src="images/m_mpr.gif" width=3>
					</TD>
				</tr>
			</table>

			<table class="query_form_table" cellSpacing=1 cellPadding=1>
				<tr>
					<td width=100% height=30 align=left
						background="images/m_table_top.jpg"
						colspan="6"><strong>&nbsp;服务处理</strong></td>
				</tr>
				<tr>
					<th>编号</th>
					<td><input type="text" name="svr_id" id="cs.svr_id"
						value="${sessionScope.cstService.svrId }" /></td>
					<th>服务类型</th>
					<td><input type="text" name="svr_type" id="cs.svr_type"
						value="${sessionScope.cstService.svrType }" /></td>
				</tr>
				<tr>
					<th>概要</th>
					<td colspan="3"><input type="text" name="svr_title"
						id="cst.svr_title" value="${sessionScope.cstService.svrTitle }" /></td>
				</tr>
				<tr>
					<th>客户</th>
					<td><input type="text" name="svr_cust_name"
						id="cst.svr_cust_name" value="${sessionScope.cstService.svrCustName }" /></td>
					<th>状态</th>
					<td><input type="text" name="svr_status"
						id="cst.svr_status" value="${sessionScope.cstService.svrStatus }"></td>
				</tr>
				<tr>
					<th>服务请求</th>
					<td colspan="3"><input type="text" name="svr_request"
						id="cst.svr_request" value="${sessionScope.cstService.svrRequest } " /><br></td>
				</tr>
				<tr>
					<th>创建人</th>
					<td><input type="text" name="svr_create_by"
						id="cst.svr_create_by" value="${sessionScope.cstService.svrCreateBy }" /></td>
					<th>分配给</th>
					<td><input type="text" name="svr_due_to"
						id="cst.svr_due_to" value="${sessionScope.cstService.svrDueTo }" /></td>
				</tr>
			</table>
			
			<br />
			
			<form action="serviceController/editDealAfter" name="frm" method="post">
				<input type="hidden" name="svrId" value="${sessionScope.cstService.svrId }" />
				<input type="hidden" name="svrType" value="${sessionScope.cstService.svrType }" />
				<input type="hidden" name=svrTitle value="${sessionScope.cstService.svrTitle }" />
				<input type="hidden" name="svrCustName" value="${sessionScope.cstService.svrCustName }" />
				<input type="hidden" name="svrStatus" id="svr_status" value="${sessionScope.cstService.svrStatus}"/> 
				<input type="hidden" name="svrCreateBy" value="${sessionScope.cstService.svrCreateBy }" />
				<input type="hidden" name="svrDueTo" value="${sessionScope.cstService.svrDueTo }" />
				<table class="query_form_table" id="table1" cellSpacing=1 cellPadding=1>
					<tr>
						<th>服务处理</th>
						<td colspan="5"><input type="text" name="svrRequest"
							id="cs.svr_deal" value="${sessionScope.cstService.svrRequest } " size="53" /><span
							class="red_star">*</span></td>
					</tr>
					<tr>
						<th>处理人</th>
						<td><input name="text" value="${sessionScope.cstService.svrDeal }"
							name="svrDeal" id="" size="20" /><span class="red_star">*</span></td>
					</tr>

					<tr>
						<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
							<a href="help"><input class="common_button" type="button" value="帮助"></a>
							&nbsp;&nbsp;&nbsp;
							<button class="common_button">保存</button>
						</td>
					</tr>
				</table>
			</form>
	<br />
   
</body>
</html>