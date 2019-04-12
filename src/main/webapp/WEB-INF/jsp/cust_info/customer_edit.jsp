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
<title>编辑</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script/common.js"></script>
<script type="text/javascript" src="script/jquery-1.4.1.js"></script>
<script type="text/javascript" src="js/edit.js"></script>
</head>
<body>
  <div class="page_title">客户信息管理 &gt; 客户信息</div>
	<!--将表单提交给controller进行顾客信息修改保存 存入数据库  -->
	<form action="customerController/custEditAfter" method="post" >
		<div class="button_bar">
			<a href="help"> <input class="common_button" type="button" value="帮助"></a>
			<a href="customerController/custEditAfter">
				<input class="common_button" type="submit" value="保存/返回"  />
			</a>
		</div>
		<input type="hidden" name="custId" value="${sessionScope.customer.custId }" />

		<table class="query_form_table">
			<tr>
				<th>客户编号</th>
				<td><input type="hidden" name="custNo"
					value="${sessionScope.customer.custNo }" /></td>
				<th>名称</th>
				<td><input name="custName" value="${sessionScope.customer.custName }"
					id="cust_name" /><span class="red_star" id="cust_namespan">*</span></td>
			</tr>
			<tr>
				<th>地区</th>
				<td><select name="custRegion">
						<option value="0">请选择...</option>
						<option selected="selected" value="北京">北京</option>
						<option value="华北">华北</option>
						<option value="中南">中南</option>
						<option value="东北">东北</option>
						<option value="西部">西部</option>
				</select> <span class="red_star">*</span></td>
				<th>客户经理</th>
				<td>
					<input name="custManagerName" value="${customer.custManagerName }" 
					id="cust_manager_name"/><span class="red_star" id="cust_manager_namesapce">*</span>
				</td>
			</tr>
			<tr>
				<th>客户等级</th>
				<td><select name="custLevelLabel">
						<option value="请选择...">请选择...</option>
						<option selected="selected" value="普通客户">普通客户</option>
						<option value="重点开发客户">重点开发客户</option>
						<option value="大客户">大客户</option>
						<option value="合作伙伴">合作伙伴</option>
						<option value="战略合作伙伴">战略合作伙伴</option>
				</select><span class="red_star">*</span></td>
				<th></th>
				<td></td>
			</tr>
			<tr>
				<th>客户满意度</th>
				<td><select name="custSatisfy">
						<option value="0">未指定</option>
						<option value="5">☆☆☆☆☆</option>
						<option value="4">☆☆☆☆</option>
						<option value="3" selected="selected">☆☆☆</option>
						<option value="2">☆☆</option>
						<option value="1">☆</option>
				</select><span class="red_star">*</span></td>
				<th>客户信用度</th>
				<td><select name="custCredit">
						<option value="0">未指定</option>
						<option value="5">☆☆☆☆☆</option>
						<option value="4">☆☆☆☆</option>
						<option value="3" selected="selected">☆☆☆</option>
						<option value="2">☆☆</option>
						<option value="1">☆</option>
				</select><span class="red_star">*</span></td>
			</tr>
		</table>
		<br />
		<table class="query_form_table" id="table1">
			<tr>
				<th>地址</th>
				<td><input name="custAddr" id="cust_addr"
					value="${customer.custAddr }" /><span id="cust_addrspan">*</span></td>
				<th>邮政编码</th>
				<td><input name="custZip" size="20" id="cust_zip"
					value="${customer.custZip }" /><span class="red_star"
					id="cust_zipspan">*</span></td>
			</tr>
			<tr>
				<th>电话</th>
				<td><input name="custTel" size="20" id="cust_tel"
					value="${customer.custTel }" /><span class="red_star"
					id="cust_telspan">*</span></td>
				<th>传真</th>
				<td><input name="custFax" size="20" id="cust_fax"
					value="${customer.custFax }" /><span class="red_star"
					id="cust_faxspan">*</span></td>
			</tr>
			<tr>
				<th>网址</th>
				<td><input name="custWebsite" size="20" id="cust_website"
					value="${customer.custWebsite}" /><span class="red_star"
					id="cust_websitespan">*</span></td>
				<th></th>
				<td></td>
			</tr>
		</table>
		<br />
		<table class="query_form_table" id="table2">
			<tr>
				<th>营业执照注册号</th>
				<td><input name="custLicenceNo" size="20"
					value="${customer.custLicenceNo }" /></td>
				<th>法人</th>
				<td><input name="custChieftain" size="20" id="cust_chieftain"
					value="${customer.custChieftain }" /><span class="red_star"
					id="cust_chieftainspan">*</span></td>
			</tr>
			<tr>
				<th>注册资金（万元）</th>
				<td><input name="custBankroll" size="20"
					value="${customer.custBankroll }" /></td>
				<th>年营业额</th>
				<td><input name="custTurnover" size="20"
					value="${customer.custTurnover }" /></td>
			</tr>
			<tr>
				<th>开户银行</th>
				<td><input name="custBank" size="20" id="cust_bank"
					value="${customer.custBank }" /><span class="red_star"
					id="cust_bankspan">*</span></td>
				<th>银行帐号</th>
				<td><input name="custBankAccount" size="20"
					id="cust_bank_account" value="${customer.custBankAccount }" /><span
					class="red_star" id="cust_bank_accountspan">*</span></td>
			</tr>
			<tr>
				<th>地税登记号</th>
				<td><input name="custLocalTaxNo" size="20"
					value="${customer.custLocalTaxNo }" /></td>
				<th>国税登记号</th>
				<td><input name="custNationalTaxNo" size="20"
					value="${customer.custNationalTaxNo }" /></td>
			</tr>
			<tr>
				<th>客户状态</th>
				<td><select name="custStatus">
						<option value="0">流失</option>
						<option selected="selected" value="">正常</option>
				</select>
			</tr>
		</table>
	</form>
</body>
</html>