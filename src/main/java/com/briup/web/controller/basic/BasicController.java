package com.briup.web.controller.basic;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.Product;
import com.briup.bean.Storage;
import com.briup.service.impl.BasicDataServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;
@RequestMapping("/basicController")
@Controller
public class BasicController {
	@Autowired
	private BasicDataServiceImpl basicService;
	//产品查询
	@RequestMapping("/findProPage")
	public String findProPage(int curPage,Product pro,HttpSession session){
		PageInfo<Product> pp;
		try {
			System.out.println(pro);
			pp = basicService.findProduct(pro, curPage, 5);
			session.setAttribute("pp", pp);
			session.setAttribute("pro", pro);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "basic/product";
	}
	@RequestMapping("/findPro")
	public String findPro(int curPage, HttpSession session){
		Product product = (Product) session.getAttribute("pro");
		return findProPage(curPage,product,session); 
	}
	//库存查询
	@RequestMapping("/findStoPage")
	public String findStoPage(int curPage,Storage sto,HttpSession session){
		PageInfo<Storage> ps;
		try {
			System.out.println(sto);
			ps = basicService.findStorage(sto, curPage, 5);
			session.setAttribute("ps", ps);
			session.setAttribute("sto", sto);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "basic/storage";
	}
	@RequestMapping("/findSto")
	public String findSto(int curPage, HttpSession session){
		Storage storage = (Storage) session.getAttribute("sto");
		return findStoPage(curPage,storage,session); 
	}
	
	
}
