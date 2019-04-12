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
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="script/common.js"></script>
	<script src="script/jquery-1.4.1.js"></script>
  	<script src="js/linkman_add.js"></script>
</head>
<body>
  <input type="button" class="common_button" value="返回" onclick="back()"/>
    欢迎使用客户关系管理系统！
</body>
</html>