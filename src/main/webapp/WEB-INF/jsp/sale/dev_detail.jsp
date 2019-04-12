<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/test1.css">   
<script type="text/javascript" src="script/jquery-1.8.3.min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/jquery.leanModal.min.js"></script>
<script src="script/common.js"></script> 
<style type="text/css">
	.center { display: block; text-align: center; }
	/** custom login button **/
	.flatbtn-blu { 
	  -webkit-box-sizing: border-box;
	  -moz-box-sizing: border-box;
	  box-sizing: border-box;
	  display: inline-block;
	  color: #edf4f9;
	  text-decoration: none;
	  background-color: #4f94cf;
	  border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
	  font-size: 0.9em;
	  font-weight: bold;
	  padding: 12px 15px 12px 15px;
	  line-height: normal;
	  text-align: center;
	  vertical-align: middle;
	  cursor: pointer;
	  text-transform: uppercase;
	  text-shadow: 0 1px 0 rgba(0,0,0,0.3);
	  -webkit-border-radius: 3px;
	  -moz-border-radius: 3px;
	  border-radius: 3px;
	   -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
	  -moz-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
	  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.2); 
	}
	.flatbtn-blu:hover {
	    color: #fff;
	    background-color: #519dde;
	}
	.flatbtn-blu:active {
	    -webkit-box-shadow: inset 0 1px 5px rgba(0, 0, 0, 0.1);
	    -moz-box-shadow:inset 0 1px 5px rgba(0, 0, 0, 0.1);
	    box-shadow:inset 0 1px 5px rgba(0, 0, 0, 0.1);
	}
	.txtfield { 
		display: block;
		width: 100%;
		padding: 6px 5px;
		margin-bottom: 15px;
		font-family: 'Helvetica Neue', Helvetica, Verdana, sans-serif;
		color: #7988a3;
		font-size: 0.7em;
		text-shadow: 1px 1px 0 rgba(255, 255, 255, 0.8);
		background-color: #fff;
		border: 1px solid;
		border-color: #abbce8 #c3cae0 #b9c8ef;
		-webkit-border-radius: 4px;
		-moz-border-radius: 4px;
		border-radius: 4px;
	}
	#lean_overlay {
	    position: fixed;
	    z-index:100;
	    top: 0px;
	    left: 0px;
	    height:100%;
	    width:100%;
	    background: #000;
	    display: none;
	}
	#loginmodal {
		width: 300px;
		padding: 15px 20px;
		background: #f3f6fa;
		-webkit-border-radius: 6px;
		-moz-border-radius: 6px;
		border-radius: 6px;
		-webkit-box-shadow: 0 1px 5px rgba(0, 0, 0, 0.5);
		-moz-box-shadow: 0 1px 5px rgba(0, 0, 0, 0.5);
		box-shadow: 0 1px 5px rgba(0, 0, 0, 0.5);
	}
	#loginform { /* no default styles */ }
	#loginform label { display: block; font-size: 1.1em; font-weight: bold; color: #7c8291; margin-bottom: 3px; }
</style> 
</head>
<body>
	<table width="100%" cellSpacing=0 cellPadding=0 border="0px">
		<tr>
		   <TD class="page_title">客户开发计划</TD>
		   <TD class="page_title_middle">&nbsp;</TD>
		   <TD width=3><IMG height=32 src="images/m_mpr.gif" width=3></TD>
		</tr>
	</table>
	<table class="query_form_table" cellSpacing=1 cellPadding=1 >
		<tr>
	    	<td  width=100% height=30 align=left background="images/m_table_top.jpg" colspan="6"><strong>&nbsp;查看</strong></td>
	    </tr>
		<tr>
			<th>编号</th>
			<td>${requestScope.sc.chcId }</td>
			<th>机会来源</th>
			<td>${requestScope.sc.chcSource }</td>
		</tr>
		<tr>
			<th>客户名称</th>
			<td>${requestScope.sc.chcCustName }</td>
			<th>成功机率（%）</th>
			<td>${requestScope.sc.chcRate }&nbsp;</td>
		</tr>	
		<tr>
			<th>概要</th>
			<td>${requestScope.sc.chcTitle }</td>
			<th>状态</th>
			<td style="color:red;">${requestScope.sc.chcStatus }</td>	
		</tr>
		<tr>
			<th>联系人</th>
			<td>${requestScope.sc.chcLinkman }</td>
			<th>联系人电话</th>
			<td>${requestScope.sc.chcTel }</td>
		</tr>
		<tr>
			<th>机会描述</th>
			<td colspan="3">${requestScope.sc.chcDesc }</td>
		</tr>
		<tr>
			<th>创建人</th>
			<td>${requestScope.sc.chcCreateBy }</td>
			<th>指派给</th>
			<td>${requestScope.sc.chcDueTo }</td>
		</tr>
		<tr>
	    	<td width=100% height=32 align=center colspan=6 bgcolor=#ffffff>
	        	<a href="help"><input class="common_button"  type="button" value="帮助"></a>&nbsp;&nbsp;&nbsp;
				    <a href="planController/findPage?curPage=${psc.pageNum }"><input class="common_button"  type="button" value="返回"></a>
	        </td>
	    </tr>
	</table>
<br />

	<table class="data_list_table" id="table1" cellSpacing=1 cellPadding=1>
		<tr>
			<th>计划</th>
			<th>执行效果</th>
		</tr>
		
		
		<tr>
			<td class="list_data_text" align="center">
				<a href="#loginmodal" class="modaltrigger">${requestScope.sp.plaTodo }&nbsp;
					<img title="编辑" src="images/bt_edit.gif" class="op_button"></a></td>
			<td class="list_data_text" align="center">${requestScope.sp.plaResult }</td>
		</tr>
	</table>
	
	<!-- 弹窗 -->
	<div id="loginmodal" style="display:none;">
	    <h1>编辑开发计划</h1>
	    <form id="loginform" name="loginform" method="post" action="planController/editAfter">
	      <input type="hidden" name="plaId" value="${requestScope.sp.plaId }">
	      <input type="hidden" name="plaChcId" value="${requestScope.sc.chcId }">
	      <label for="pla_todo">计划内容</label>
	      <input name="plaTodo" id="pla_todo" class="txtfield" tabindex="2" value="${requestScope.sp.plaTodo }">
	      <input type="hidden" name="plaResult" value="${requestScope.sp.plaResult }">
	      <div class="center">
	      <input type="submit" name="save" id="loginbtn" class="flatbtn-blu hidemodal" value="保存" tabindex="3"></div>
	    </form>
	</div>
  	<script type="text/javascript">
	$(function(){
	  $('.modaltrigger').leanModal({top:110,overlay:0.45,closeButton:".hidemodal"});
	});
</script>
</body>
</html>