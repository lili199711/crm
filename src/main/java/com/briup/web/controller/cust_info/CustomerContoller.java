package com.briup.web.controller.cust_info;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.CstCustomer;
import com.briup.service.impl.CustomerServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;
@RequestMapping("/customerController")
@Controller
public class CustomerContoller {
	@Autowired
	private CustomerServiceImpl custService;
	
	//查询
	@RequestMapping("/findCustPage")
	public String showCustomer(int curPage,CstCustomer cust, HttpSession session){
		PageInfo<CstCustomer> pc;
		try {
			System.out.println(cust);
			pc = custService.findCustomerPageByCon(curPage, 8, cust);
			session.setAttribute("pc", pc);
			session.setAttribute("cp", cust);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showList"; 
	}
	@RequestMapping("/findPage")
	public String findPage(int curPage, HttpSession session){
		CstCustomer cust = (CstCustomer) session.getAttribute("cp");
		return showCustomer(curPage,cust,session); 
	}
	//新建
	@SuppressWarnings("unchecked")
	@RequestMapping("/addCustomer")
	public String addCustomer(CstCustomer cst,HttpSession session){
		try {
			System.out.println(cst);
			custService.saveCustomer(cst);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<CstCustomer> pc = (PageInfo<CstCustomer>) session.getAttribute("pc");
		if(pc.getTotal()%pc.getPageSize()==0){
			return "forward:/customerController/findPage?curPage=" +( pc.getNavigateLastPage()+1) ;
		}else{
			return "forward:/customerController/findPage?curPage=" + pc.getNavigateLastPage() ;
		}
//		return "forward:/customerController/findCustPage?curPage=1";
	}
	//编辑
	@RequestMapping("/custEditBefore")
	public String custEditBefore(long custId,HttpSession session){
		try {
			System.out.println("传入的custId：" + custId);
			CstCustomer customer = custService.findCustomerById(custId);
			System.out.println("查找出来的客户：" + customer);
			session.setAttribute("customer", customer);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showCustEdit";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/custEditAfter")
	public String custEditAfter(CstCustomer cust,HttpSession session){
		try {
			System.out.println("更新之前客户：" + cust);
			custService.updateCustomer(cust);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<CstCustomer> pc = (PageInfo<CstCustomer>) session.getAttribute("pc");
		return "forward:/customerController/findPage?curPage=" + pc.getPageNum();
//		return "forward:/customerController/findCustPage?curPage=1";
	}
	//删除
	@SuppressWarnings("unchecked")
	@RequestMapping("/deleteCust")
	public String deleteCust(long custId,HttpSession session){
		try {
			custService.deleteCustomerById(custId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<CstCustomer> pc =  (PageInfo<CstCustomer>) session.getAttribute("pc");
		if(pc.getTotal()%pc.getPageSize()==1){
			return "forward:/customerController/findPage?curPage=" + pc.getPrePage() ;
		}else{
			return "forward:/customerController/findPage?curPage="+ pc.getPageNum();
		}
//		return "forward:/customerController/findCustPage?curPage=1";
	}
	
}
