function editcheck(){
	var cust_name=$("#cust_name").val();
	var cust_addr=$("#cust_addr").val();
	var cust_zip=$("#cust_zip").val();
	var cust_tel=$("#cust_tel").val();
	var cust_fax=$("#cust_fax").val();
	var cust_website=$("#cust_website").val();
	var cust_chieftain=$("#cust_chieftain").val();
	var cust_bank=$("#cust_bank").val();
	var cust_bank_account=$("#cust_bank_account").val();
	
	if(cust_name==""){
		$("#cust_namespan").css("color","red");
		$("#cust_namespan").html("公司名字不能为空");
		return false;
	}else if(cust_name!=""){
		$("#cust_namespan").css("color","green");
		$("#cust_namespan").html("success");
		}
	
	if(cust_addr==""){
		$("#cust_addrspan").css("color","red");
		$("#cust_addrspan").html("地址不能为空");
		return false;
	}else if(cust_addr!=""){
		$("#cust_addrspan").css("color","green");
		$("#cust_addrspan").html("success");
		}
		
	if(cust_zip==""){
		$("#cust_zipspan").css("color","red");
		$("#cust_zipspan").html("邮政编码不能为空");
		return false;
	}else if(cust_zip!=""){
		$("#cust_zipspan").css("color","green");
		$("#cust_zipspan").html("success");
		}
		
	if(cust_tel==""){
		$("#cust_telspan").css("color","red");
		$("#cust_telspan").html("电话不能为空");
		return false;
	}else if(cust_tel!=""){
		$("#cust_telspan").css("color","green");
		$("#cust_telspan").html("success");
	}
	
	if(cust_fax==""){
		$("#cust_faxspan").css("color","red");
		$("#cust_faxspan").html("传真不能为空");
		return false;
	}else if(cust_fax!=""){
		$("#cust_faxspan").css("color","green");
		$("#cust_faxspan").html("success");
	}
	
	if(cust_website==""){
		$("#cust_websitespan").css("color","red");
		$("#cust_websitespan").html("网站不能为空");
		return false;
	}else if(cust_website!=""){
		$("#cust_websitespan").css("color","green");
		$("#cust_websitespan").html("success");
	}
	
	if(cust_chieftain==""){
		$("#cust_chieftainspan").css("color","red");
		$("#cust_chieftainspan").html("法人不能为空");
		return false;
	}else if(cust_chieftain!=""){
		$("#cust_chieftainspan").css("color","green");
		$("#cust_chieftainspan").html("success");
	}
	
	if(cust_bank==""){
		$("#cust_bankspan").css("color","red");
		$("#cust_bankspan").html("开户银行不能为空");
		return false;
	}else if(cust_bank!=""){
		$("#cust_bankspan").css("color","green");
		$("#cust_bankspan").html("success");
	}
	
	if(cust_bank_account==""){
		$("#cust_bank_accountspan").css("color","red");
		$("#cust_bank_accountspan").html("银行账号不能为空");
		return false;
	}else if(cust_bank_account!=""){
		$("#cust_bank_accountspan").css("color","green");
		$("#cust_bank_accountspan").html("success");
	}
	if(cust_addr!=""&&cust_zip!=""&&cust_tel!=""&&cust_fax!=""&&cust_website!=""&&cust_chieftain!=""&&cust_bank!=""&&cust_bank_account!=""){
		return true;
	}else{
		alert("信息缺失,请补充完整");
		return false;
	}
	}