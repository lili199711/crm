package com.briup.web.controller.jfreechart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jfree.data.category.CategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.service.impl.ReportFormsServiceImpl;
import com.briup.util.JFreeChartUtil;
@RequestMapping("/JfreeChartController")
@Controller
public class JfreeChartController {
	@Autowired
	private ReportFormsServiceImpl reportService;
	
	//接收前台传过来的客户名字	
	@RequestMapping("/contr")
	public String contr(String cstname,HttpServletRequest request,HttpSession session){
		try {
			//1、如何通过客户名字获取客户的贡献金额(获取数据集dataset)
			CategoryDataset dataset = reportService.findCstcontribute(cstname);
			//2、获取文件名  直接通过jfreeChartUtil获取 String fileName
			/*
			 * 1、标题：客户贡献分析
			 * 2、横坐标：客户
			 * 3、纵坐标：金额
			 * 4、数据集
			 * 5、request对象
			 */
			String fileName = JFreeChartUtil.createBarChart("客户贡献分析","客户", "金额", dataset, request);
			//3、 获取图片路径传到前台
			String chartURL=request.getContextPath() + "/chart?filename="+fileName; 
			session.setAttribute("chartURL", chartURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showContr";
	}
	@RequestMapping("/cons")
	public String cons(int condit,HttpServletRequest request,HttpSession session){
		try {
			CategoryDataset dataset = reportService.findCstMakeup(condit);
			String fileName = null;
			if(condit==0){
				fileName = JFreeChartUtil.createBarChart("客户构成分析", "客户等级", "占总客户的比例", dataset, request);
			}
			if(condit==1){
				fileName = JFreeChartUtil.createBarChart("客户构成分析", "客户信用度", "占总客户的比例", dataset, request);
			}
			if(condit==2){
				fileName = JFreeChartUtil.createBarChart("客户构成分析", "客户满意度", "占总客户的比例", dataset, request);
			}
			String chartURL2=request.getContextPath() + "/chart?filename="+fileName; 
			session.setAttribute("chartURL2", chartURL2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showCons";
	}
	
}
