package com.briup.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/showPage")
@Controller
public class ShowPageController {
//	显示角色相关页面
	@RequestMapping("/showRoleManage")
	public String showRoleManage(){
		return "systemset/role_manage";
	}
	@RequestMapping("/showAddRole")
	public String showAddRole(){
		return "systemset/addRole";
	}
	@RequestMapping("/showUpdateRole")
	public String showUpdateRole(){
		return "systemset/role_update";
	}
//	显示用户相关页面
	@RequestMapping("/showUserManage")
	public String showUserManage(){
		return "systemset/user_manage";
	}
	@RequestMapping("/showAddUser")
	public String showAddUser(){
		return "systemset/addUser";
	}
	@RequestMapping("/showUpdateUser")
	public String showUpdateUser(){
		return "systemset/user_update";
	}
//	显示日志相关页面
	@RequestMapping("/showlogReview")
	public String showlogReview(){
		return "systemset/log_review";
	}
//	显示客户信息相关页面
	@RequestMapping("/showList")
	public String showList(){
		return "cust_info/list";
	}
	@RequestMapping("/showAddCustomer")
	public String showAddCustomer(){
		return "cust_info/add_customer";
	}
	@RequestMapping("/showCustEdit")
	public String showCustEdit(){
		return "cust_info/customer_edit";
	}
	//联系人相关页面
	@RequestMapping("/showlinkmanAdd")
	public String showlinkmanAdd(){
		return "cust_info/linkman_add";
	}
//	jfreechart相关页面显示
	@RequestMapping("/showContr")
	public String showContr(){
		return "jfreechart/contr";
	}
	@RequestMapping("/showCons")
	public String showCons(){
		return "jfreechart/cons";
	}
	//基础数据相关页面
	@RequestMapping("/showAddChance")
	public String showAddChance(){
		return "sale/add_salchance";
	}
	//服务创建页面
	@RequestMapping("/showAdd")
	public String showAdd(){
		return "cust_service/add";
	}
	//服务分配
	@RequestMapping("/showServiceDispatch")
	public String showServiceDispatch(){
		return "cust_service/dispatch";
	}
	//服务处理
		@RequestMapping("/showServiceDeal")
		public String showServiceDeal(){
			return "cust_service/deal";
		}
	//服务反馈
	@RequestMapping("/showServiceFeedback")
	public String showServiceFeedback(){
		return "cust_service/feedback";
	}
	
}
