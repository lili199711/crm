function linkman_addcheck(){
	var lkm_name=$("#lkm_nameinp").val();
	var lkm_postion=$("#lkm_postion").val();
	var lkm_tel=$("#lkm_tel").val();
	
	if(lkm_name==""){
		$("#lkm_nameinpspan").css("color","red");
		$("#lkm_nameinpspan").html("联系人名字不能为空");
		return false;
	}else if(lkm_name!=""){
		$("#lkm_nameinpspan").css("color","green");
		$("#lkm_nameinpspan").html("(●'◡'●)");
		}
	
	if(lkm_postion==""){
		$("#lkm_postionspan").css("color","red");
		$("#lkm_postionspan").html("职位不能为空");
		return false;
	}else if(lkm_postion!=""){
		$("#lkm_postionspan").css("color","green");
		$("#lkm_postionspan").html("(●'◡'●)");
		}
	
	if(lkm_tel==""){
		$("#lkm_telspan").css("color","red");
		$("#lkm_telspan").html("联系人电话不能为空");
		return false;
	}else if(lkm_tel!=""){
		$("#lkm_telspan").css("color","green");
		$("#lkm_telspan").html("(●'◡'●)");
		}
	if(lkm_name!=""&&lkm_postion!=""&&lkm_tel!=""){
		return true;
	}else{
		alert("必要信息不能为空");
		return false;
	}
}