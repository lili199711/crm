function CheckNull() {
	var svr_type = document.getElementById("cs.svr_type").value;
	var svr_title = document.getElementById("cs.svr_title").value;
	var svr_request = document.getElementById("cs.svr_request").value;
	if(svr_type==""){
		alert("服务类型不能为空");
		return false;
	}else if(svr_title==""){
		alert("概要不能为空");
		return false;
	}else if(svr_request==""){
		alert("要求不能为空");
		return false;
	}else{
		alert("新建成功");
	}
}