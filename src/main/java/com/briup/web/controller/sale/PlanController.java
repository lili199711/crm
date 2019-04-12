package com.briup.web.controller.sale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.SalChance;
import com.briup.bean.SalPlan;
import com.briup.service.impl.SalChanceServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;
@RequestMapping("/planController")
@Controller
public class PlanController {
	@Autowired
	private SalChanceServiceImpl saleService;
	//查找
	@RequestMapping("/findPlanPage")
	public String findPlanPage(int curPage,SalChance sc,HttpSession session){
		PageInfo<SalChance> psc;
		try {
			System.out.println(sc);
			psc = saleService.findSalPageByCon(curPage, 8, sc);
			session.setAttribute("psc", psc);
			session.setAttribute("sc", sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/dev";
	}
	@RequestMapping("/findPage")
	public String findPage(int curPage, HttpSession session){
		SalChance chance = (SalChance) session.getAttribute("sc");
		return findPlanPage(curPage,chance,session); 
	}
	//制定计划
	@RequestMapping("/devPlan")
	public String devPlan(long chcId,HttpServletRequest request){
		try {
			System.out.println("传入的custId：" + chcId);
			SalChance sc = saleService.findOneSalChance(chcId);
			System.out.println("查找出来的客户：" + sc);
			request.setAttribute("sc", sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/dev_plan";
	}
	
	//查看
	@RequestMapping("/devDetail")
	public String devDetail(long chcId,HttpServletRequest request){
		try {
			System.out.println("传入的custId：" + chcId);
			SalChance sc = saleService.findOneSalChance(chcId);
			System.out.println("查找出来的客户：" + sc);
			request.setAttribute("sc", sc);
			SalPlan sp = saleService.findSalPlan(chcId);
			System.out.println("查找出来的计划：" + sp);
			request.setAttribute("sp", sp);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/dev_detail";
	}
	//编辑
	@RequestMapping("/editAfter")
	public String editAfter(SalPlan sp){
		try {
			saleService.updateSalPlan(sp);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/planController/devDetail?chcId=" + sp.getPlaChcId();
	}
	
	//执行
	@RequestMapping("/executeBefore")
	public String executeBefore(long chcId,HttpServletRequest request){
		try {
			System.out.println("传入的custId：" + chcId);
			SalChance sc = saleService.findOneSalChance(chcId);
			System.out.println("查找出来的客户：" + sc);
			request.setAttribute("sc", sc);
			SalPlan sp = saleService.findSalPlan(chcId);
			System.out.println("查找出来的计划：" + sp);
			request.setAttribute("sp", sp);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/dev_execute";
	}
	
}
