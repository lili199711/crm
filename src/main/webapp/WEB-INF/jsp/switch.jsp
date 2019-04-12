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
<title>My JSP 'switch.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<LINK href="css/switchPage.css" type=text/css rel=stylesheet>
</head>
<body>
 <TABLE height="100%" cellSpacing=0 cellPadding=0 width=8 border=0>
		<TBODY>
			<TR>
				<TD vAlign=center width=8 height="100%"><IMG id=switchImg
					src="images/cdsstsjal.png"></TD>
			</TR>
			<TR>
				<TD></TD>
			</TR>
		</TBODY>
	</TABLE>
</body>
</html>