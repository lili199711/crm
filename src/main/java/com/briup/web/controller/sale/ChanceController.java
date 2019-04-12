package com.briup.web.controller.sale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.CstCustomer;
import com.briup.bean.SalChance;
import com.briup.service.impl.SalChanceServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;
@RequestMapping("/chanceController")
@Controller
public class ChanceController {
	@Autowired
	private SalChanceServiceImpl saleService;
	//查找
	@RequestMapping("/findChancePage")
	public String findSalePage(int curPage,SalChance sc,HttpSession session){
		PageInfo<SalChance> psc;
		try {
			System.out.println(sc);
			psc = saleService.findSalPageByCon(curPage, 8, sc);
			session.setAttribute("psc", psc);
			session.setAttribute("sc", sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/list";
	}
	@RequestMapping("/findPage")
	public String findPage(int curPage, HttpSession session){
		SalChance chance = (SalChance) session.getAttribute("sc");
		return findSalePage(curPage,chance,session); 
	}
	//新建
	@SuppressWarnings("unchecked")
	@RequestMapping("/addChance")
	public String addChance(SalChance sc,HttpSession session){
		try {
			System.out.println("新建销售机会：" + sc);
			saleService.saveChance(sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SalChance> psc = (PageInfo<SalChance>) session.getAttribute("psc");
		if(psc.getTotal()%psc.getPageSize()==0){
			return "forward:/chanceController/findPage?curPage=" +( psc.getNavigateLastPage()+1) ;
		}else{
			return "forward:/chanceController/findPage?curPage=" + psc.getNavigateLastPage() ;
		}
//		return "forward:/chanceController/findChancePage?curPage=1";
	}
	//指派
	@RequestMapping("/dispatchBefore")
	public String dispatchBefore(long chcId,HttpServletRequest request){
		try {
			System.out.println("传过来的机会id：" + chcId);
			SalChance chance = saleService.findOneSalChance(chcId);
			System.out.println("根据id查找：" + chance);
			request.setAttribute("chance", chance);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/dispatch";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/dispatchAfter")
	public String dispatchAfter(SalChance sc,HttpSession session){
		try {
			saleService.updateChance(sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SalChance> psc = (PageInfo<SalChance>) session.getAttribute("psc");
		if(psc.getTotal()%psc.getPageSize()==0){
			return "forward:/chanceController/findPage?curPage=" +( psc.getNavigateLastPage()+1) ;
		}else{
			return "forward:/chanceController/findPage?curPage=" + psc.getNavigateLastPage() ;
		}
	}
	//编辑
	@RequestMapping("/chanceEditBefore")
	public String chanceEditBefore(long chcId,HttpServletRequest request){
		try {
			System.out.println("传入的custId：" + chcId);
			SalChance sc = saleService.findOneSalChance(chcId);
			System.out.println("查找出来的客户：" + sc);
			request.setAttribute("sc", sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "sale/edit";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/chanceEditAfter")
	public String chanceEditAfter(SalChance sc,HttpSession session ){
		try {
			saleService.updateChance(sc);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SalChance> psc = (PageInfo<SalChance>) session.getAttribute("psc");
		return "forward:/chanceController/findPage?curPage=" + psc.getPageNum();
	}
	//删除
	@SuppressWarnings("unchecked")
	@RequestMapping("/deleteChance")
	public String deleteChance(long chcId,HttpSession session){
		try {
			System.out.println("接收到的id：" + chcId);
			saleService.deleteSalChance(chcId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SalChance> psc =  (PageInfo<SalChance>) session.getAttribute("psc");
		if(psc.getTotal()%psc.getPageSize()==1){
			return "forward:/chanceController/findPage?curPage=" + psc.getPrePage() ;
		}else{
			return "forward:/chanceController/findPage?curPage="+ psc.getPageNum();
		}
	}
}
