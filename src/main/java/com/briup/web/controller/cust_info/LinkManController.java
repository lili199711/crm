package com.briup.web.controller.cust_info;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.CstCustomer;
import com.briup.bean.CstLinkman;
import com.briup.service.impl.CustomerServiceImpl;
import com.briup.util.CrmCommonException;
@RequestMapping("/linkManController")
@Controller
public class LinkManController {
	@Autowired
	private CustomerServiceImpl custService;
	//查找
	@RequestMapping("/findLinkMan")
	public String findLinkMan(long custId,HttpServletRequest request,HttpSession session){
		try {
			System.out.println(custId);
			List<CstLinkman> list = custService.findAllLinkManByCstId(custId);
			request.setAttribute("link", list);
			session.setAttribute("custId", custId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/linkman";
	}
	//新建
	@RequestMapping("/linkAdd")
	public String linkAdd(CstLinkman linkMan,HttpSession session){
		System.out.println("设置之前" + linkMan);
		Long custId =  (long) session.getAttribute("custId");
		System.out.println("拿到session中的值：" + custId);
		try {
			List<CstLinkman> list = custService.findAllCstLinkman();
			long max = 0;
			for (int i = 0; i < list.size(); i++) {
				long id = list.get(i).getLkmId();
				if(id >= max){
					long temp = max;
					max = id;
					id = temp;
				}
			}
			long index = max + 1;
			linkMan.setLkmId(index);//设置联系人id
			//设置客户id
			linkMan.setLkmCustId(custId);
			//设置客户编号和客户名
			CstCustomer customer = custService.findCustomerById(custId);
			linkMan.setLkmCustNo(customer.getCustNo());
			linkMan.setLkmCustName(customer.getCustName());
			System.out.println("设置值后：" + linkMan);
			//执行插入
			custService.saveLinkMan(linkMan);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/linkManController/findLinkMan?custId=" + custId;
	}
	//编辑
	@RequestMapping("/linkEditBefore")
	public String linkEditBefore(long lkmId,HttpServletRequest request){
		try {
			System.out.println(lkmId);
			CstLinkman linkman = custService.findLinkManById(lkmId);
			request.setAttribute("linkman", linkman);
			System.out.println(linkman + "编辑");
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "cust_info/linkman_edit";
	}
	@RequestMapping("/linkEditAfter")
	public String linkEditAfter(CstLinkman linkman){
		try {
			System.out.println("linkman值：" + linkman);
			custService.updateLinkman(linkman);
			
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/linkManController/findLinkMan?custId=" + linkman.getLkmCustId();
	}
	//删除
	@RequestMapping("/linkDelete")
	public String linkDelete(long lkmId){
		Long custId = null;
		try {
			CstLinkman linkman = custService.findLinkManById(lkmId);
			custId = linkman.getLkmCustId();
			System.out.println(linkman);
			custService.deleteLinkMan(lkmId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/linkManController/findLinkMan?custId=" + custId;
	}
}
