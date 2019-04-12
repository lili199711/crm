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
<title>客户关系管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="css/style_cn.css" type=text/css rel=stylesheet>
</head>
  <FRAMESET border=0 frameSpacing=0 rows=98,* frameBorder=NO cols=*>
	<FRAME name=topFrame src="top " noResize scrolling=no>
	<FRAMESET id=switchkey border=0 frameSpacing=0 frameBorder=NO
		cols=175,8,*>
		<FRAME id=left name=leftFrame src="left" noResize scrolling=yes>
		<FRAME name=switchFrame src="switch" noResize scrolling=no>
		<FRAME id=main name=mainFrame
			src="images/menu/welcome.jpg">
	</FRAMESET>
</FRAMESET>
<noframes>
</noframes>
</html>