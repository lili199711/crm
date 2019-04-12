
function help(msg){
	alert('欢迎使用'+msg);
}

function to(url){
	window.location.href=url;
}

//返回按钮的js操作
function back(){
	history.go(-1);
}

function save(url){
	alert('保存成功！');
	to(url);
}

function add(url){
	alert('新建成功！');
	to(url);
}

function del(msg){
	if (window.confirm("确认删除"+msg+"吗？")){
		reload();
	}
}

function setCurTime(oid){
	var now=new Date();
	var year=now.getYear();
	var month=now.getMonth();
	var day=now.getDate();
	var hours=now.getHours();
	var minutes=now.getMinutes();
	var seconds=now.getSeconds();
	var timeString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
	var oCtl = document.getElementById(oid);
	oCtl.value = timeString;
}