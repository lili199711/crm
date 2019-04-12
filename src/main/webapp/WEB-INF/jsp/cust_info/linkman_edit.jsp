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
<title>编辑联系人</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<script src="script/common.js"></script>
	<script src="script/jquery-1.4.1.js"></script>
	<script src="js/linkman_edit.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 联系人 &gt; 编辑联系人</div>
<form action="linkManController/linkEditAfter" method="post" id="updatelkmform">
<div class="button_bar">
	<a href="help"><input class="common_button"  type="button" value="帮助"></a>
	<a href="linkManController/linkEditAfter">
	<button class="common_button" type="submit">保存/返回</button></a>
</div>
<input type="hidden" name="lkmId" value="${requestScope.linkman.lkmId }"/>
<input type="hidden" name="lkmCustId" value="${requestScope.linkman.lkmCustId }" />
<input type="hidden" name="lkmCustNo" value="${requestScope.linkman.lkmCustNo }"/>
<input type="hidden" name="lkmCustName" value="${requestScope.linkman.lkmCustName }"/>
<table class="query_form_table" id="table1">
	<tr>
		<th>姓名</th>
		<td><input name="lkmName" value="${requestScope.linkman.lkmName }" size="20" id="lkm_nameinp"/>
			<span class="red_star" id="lkm_nameinpspan">*</span></td>
		<th>性别</th>
		<c:if test="${requestScope.linkman.lkmSex eq '男' }">
		<td>
			<input type="radio" name="lkmSex" value="男" checked />男
			<input type="radio" name="lkmSex" value="女" />女
		</td>
		</c:if>
		<c:if test="${requestScope.linkman.lkmSex eq '女' }">
		<td>
			<input type="radio" name="lkmSex" value="男"  />男
			<input type="radio" name="lkmSex" value="女" checked/>女
		</td>
		</c:if>
			
	</tr>
	<tr>
		<th>职位</th>
		<td><input name="lkmPostion" value="${requestScope.linkman.lkmPostion }" size="20" id="lkm_postion"/><span class="red_star" id="lkm_postionspan">*</span></td>
		<th>办公电话</th>
		<td><input name="lkmTel" value="${requestScope.linkman.lkmTel }" size="20" id="lkm_tel"/><span class="red_star" id="lkm_telspan">*</span></td>
	</tr>	
	<tr>
		<th>手机</th>
		<td><input name="lkmMobile" value="${requestScope.linkman.lkmMobile }" size="20" /></td>
		<th>备注</th>
		<td><input name="lkmMemo" value="${requestScope.linkman.lkmMemo }" size="20" /></td>
	</tr>
</table>
</form>
</body>
</html>