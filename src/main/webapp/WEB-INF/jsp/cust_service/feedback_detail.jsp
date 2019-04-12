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
<link href="css/test1.css" rel="stylesheet" type="text/css">
<script src="script/common.js"></script>
</head>
<body>
    &nbsp;  
	
		<table width="100%" cellSpacing=0 cellPadding=0 border="0px">
		<tr>
			<TD class="page_title">
				客户服务管理
			</TD>
			<TD class="page_title_middle">
				&nbsp;
			</TD>
			<TD width=3>
				<IMG height=32
					src="images/m_mpr.gif" width=3>
			</TD>
		</tr>
		</table>
		<table class="query_form_table" cellSpacing=1 cellPadding=1>
			<tr>
				<td width=100% height=30 align=left
					background="images/m_table_top.jpg"
					colspan="6">
					<strong>&nbsp;服务反馈</strong>
				</td>
			</tr>
			<tr>
				<th>
					编号
				</th>
				<td>
					<input type="text" name="svr_id" id="cs.svr_id"
						value="${sessionScope.cstService.svrId }" />
				</td>
				<th>
					服务类型
				</th>
				<td>
					<input type="text" name="svr_type" id="cs.svr_type"
						value="${sessionScope.cstService.svrType }" />
				</td>
			</tr>
			<tr>
				<th>
					概要
				</th>
				<td >
					<input type="text" name="svr_title" id="cst.svr_title"
						value="${sessionScope.cstService.svrTitle }" />
				</td>
				<th>
					客户
				</th>
				<td>
					<input type="text" name="svr_cust_name" id="cst.svr_cust_name"
						value="${sessionScope.cstService.svrCustName }" />
				</td>
			</tr>
			<tr>
				<th>
					状态
				</th>
				<td>
					<input type="text" name="svr_status" id="cst.svr_status"
						value="${sessionScope.cstService.svrStatus }">
				</td>
				<th>
					服务请求
				</th>
				<td >
					<input type="text" name="svr_request" id="cst.svr_request"
						value="${sessionScope.cstService.svrRequest } " />
					<br>
				</td>
			</tr>
			<tr>
				<th>
					创建人
				</th>
				<td>
					<input type="text" name="svr_create_by" id="cst.svr_create_by"
						value="${sessionScope.cstService.svrCreateBy }" />
				</td>
				<th>
					分配给
				</th>
				<td>
					<input type="text" name="svr_due_to" id="cst.svr_due_to"
						value="${sessionScope.cstService.svrDueTo }" />
				</td>
			</tr>
			<tr>
				<th>
					服务处理
				</th>
				<td >
					<input type="text" name="svr_deal" id="cst.svr_deal"
						value="${sessionScope.cstService.svrRequest } " />
				</td>
				<th>
					处理人
				</th>
				<td>
					<input type="text" name="svr_create_by" id="cst.svr_create_by"
						value="${sessionScope.cstService.svrDeal }" />
				</td>
			</tr>
		</table>
		<br />
		<form action="serviceController/editFeedAfter" method="post" >
		<input type="hidden" name="svr_id" value="${sessionScope.cstService.svrId }" />
			<table class="query_form_table" id="table2" >
				<tr>
					<th>
						处理结果
					</th>
					<td >
						<input type="text" name="svrResult"  value="${sessionScope.cstService.svrResult }" size="53" />
						<span class="red_star">*</span>
					</td>
					<th>
						满意度
					</th>
					<td>
					<select name="svrSatisfy" id="cs.svr_satisfy">
							<option value="${sessionScope.cstService.svrSatisfy }" selected="selected">
								--请选择--
							</option>
							<option value="5">
								☆☆☆☆☆
							</option>
							<option value="4">
								☆☆☆☆
							</option>
							<option value="3">
								☆☆☆
							</option>
							<option value="2">
								☆☆
							</option>
							<option value="1">
								☆
							</option>
						</select>
						<span class="red_star">*</span>
					</td>
				</tr>
				<tr>
					<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
						<a href="help"><input class="common_button"  type="button" value="帮助"></a>
						&nbsp;&nbsp;&nbsp;
						<button class="common_button">
							保存
						</button>
					</td>
				</tr>
			</table>
		</form>

</body>
</html>