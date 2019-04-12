package com.briup.web.controller.cust_info;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.CstActivity;
import com.briup.bean.CstCustomer;
import com.briup.bean.CstLinkman;
import com.briup.service.impl.CustomerServiceImpl;
import com.briup.util.CrmCommonException;
@RequestMapping("/activitiesController")
@Controller
public class ActivitiesController {
	@Autowired
	private CustomerServiceImpl custService;
	//查询
	@RequestMapping("/findActivities")
	public String findActivites(long custId,HttpServletRequest request){
		try {
			List<CstActivity> activities = custService.findAllCstActivityByCstId(custId);
			request.setAttribute("activities", activities);
			CstCustomer customer = custService.findCustomerById(custId);
			request.setAttribute("cust", customer);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/activities";
	}
	//新建
	@RequestMapping("/activitiesAddBefore")
	public String activitiesAddBefore(long custId,HttpServletRequest request){
		try {
			CstCustomer customer = custService.findCustomerById(custId);
			request.setAttribute("customer", customer);
			request.setAttribute("time", new Date(System.currentTimeMillis()));
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/activities_add";
	}
	@RequestMapping("/activitiesAddAfter")
	public String linkAdd(CstActivity act){
		Long custId = null;
		try {
			custService.saveCstActivity(act);
			custId = act.getAtvCustId();
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/activitiesController/findActivities?custId=" + custId;
	}
	//编辑
	@RequestMapping("/activitiesEditBefore")
	public String activitiesEditBefore(long atvId,HttpServletRequest request){
		try {
			System.out.println(atvId);
			CstActivity activity = custService.findCstActivityById(atvId);
			request.setAttribute("activity", activity);
			System.out.println(activity + "编辑");
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/activities_edit";
	}
	@RequestMapping("/activitiesEditAfter")
	public String activitiesEditAfter(CstActivity act){
		try {
			System.out.println("act值：" + act);
			custService.updateAtv(act);
			
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/activitiesController/findActivities?custId=" + act.getAtvCustId();
	}
	//删除
	@RequestMapping("/activitiesDelete")
	public String activitiesDelete(long atvId){
		Long custId = null;
		try {
			CstActivity act = custService.findCstActivityById(atvId);
			custId = act.getAtvCustId();
			System.out.println(act);
			custService.deleteAtvById(atvId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/activitiesController/findActivities?custId=" + custId;
	}
}
