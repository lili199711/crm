package com.briup.web.controller.cust_service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.CstService;
import com.briup.service.impl.CstServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;

@RequestMapping("/serviceController")
@Controller
public class ServiceController {
	@Autowired
	private CstServiceImpl serService;
	//服务创建
	@RequestMapping("/add")
	public String add(CstService cstService){
		try {
			serService.save(cstService);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_service/add";
	}
	//服务分配(查询)
	@RequestMapping("/findSerPage")
	public String findSerPage(int curPage,CstService cser, HttpSession session){
		PageInfo<CstService> cs;
		try {
			System.out.println(cser);
			cs = serService.findCstServiceByCondition(cser, curPage, 6);
			session.setAttribute("cs", cs);
			session.setAttribute("sc", cser);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_service/dispatch"; 
	}
	@RequestMapping("/findPage")
	public String findPage(int curPage, HttpSession session){
		CstService cser = (CstService) session.getAttribute("sc");
		return findSerPage(curPage,cser,session); 
	}
	//分配人更新
	@RequestMapping("/updateDispatch")
	public String updateDispatch(CstService cstService, HttpSession session){
		try {
			serService.updateCstService(cstService);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
//		return "forward:/serviceController/findSerPage";
		return "forward:/serviceController/findPage?curPage=1";
	}
	//分配人删除
	@RequestMapping("/deleteDispatch")
	public String deleteDispatch(long svrId, HttpSession session){
		try {
			serService.delete(svrId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/serviceController/findPage?curPage=1";
//		return "forward:/serviceController/findSerPage";
	}
	//服务处理(查询)
	@RequestMapping("/findDelPage")
	public String findDelPage(int curPage,CstService cser, HttpSession session){
		PageInfo<CstService> cs;
		try {
			System.out.println(cser);
			cs = serService.findCstServiceByCondition(cser, curPage, 6);
			session.setAttribute("cs", cs);
			session.setAttribute("sc", cser);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_service/deal"; 
	}
	@RequestMapping("/findDPage")
	public String findDPage(int curPage, HttpSession session){
		CstService cser = (CstService) session.getAttribute("sc");
		return findDelPage(curPage,cser,session); 
	}
	//服务处理设置
	@RequestMapping("/editDealBefore")
	public String editDealBefore(long svrId,HttpSession session){
			try {
				CstService cstService = serService.findServiceById(svrId);
				session.setAttribute("cstService", cstService);
			} catch (CrmCommonException e) {
				e.printStackTrace();
			}
		return "cust_service/deal_detail";
	}
	@RequestMapping("/editDealAfter")
	public String editDealAfter(CstService cser){
			try {
				 serService.updateCstService(cser);
			} catch (CrmCommonException e) {
				e.printStackTrace();
			}
		return "forward:/serviceController/findDPage?curPage=1";
	}	
	//服务反馈
	@RequestMapping("/findFeedPage")
	public String findFeedPage(int curPage,CstService cser, HttpSession session){
		PageInfo<CstService> cs;
		try {
			System.out.println(cser);
			cs = serService.findCstServiceByCondition(cser, curPage, 6);
			session.setAttribute("cs", cs);
			session.setAttribute("sc", cser);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_service/feedback"; 
	}
	@RequestMapping("/findFPage")
	public String findFPage(int curPage, HttpSession session){
		CstService cser = (CstService) session.getAttribute("sc");
		return findFeedPage(curPage,cser,session); 
	}
	//服务反馈设置
		@RequestMapping("/editFeedBefore")
		public String editFeedBefore(long svrId,HttpSession session){
				try {
					CstService cstService = serService.findServiceById(svrId);
					if("已处理".equals(cstService.getSvrStatus())){
						session.setAttribute("cstService", cstService);
					}else{
						throw CrmCommonException.getException(408);
					}
				} catch (CrmCommonException e) {
					e.printStackTrace();
				}
			return "cust_service/feedback_detail";
		}
		@RequestMapping("/editFeedAfter")
		public String editFeedAfter(CstService cser){
				try {
					 serService.updateCstService(cser);
				} catch (CrmCommonException e) {
					e.printStackTrace();
				}
			return "forward:/serviceController/findFPage?curPage=1";
		}	
	
	
}
