package com.briup.web.controller.systemset;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.bean.CstLog;
import com.briup.service.impl.LogServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;
@RequestMapping("/logController")
@Controller
public class LogController {
	@Autowired
	private LogServiceImpl logService;
	@RequestMapping("/logReview")
	public String logReview(@RequestParam int curPage, HttpSession session){
		try {
			PageInfo<CstLog> pl = logService.findAllLog(curPage, 10);
			session.setAttribute("pl", pl);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showlogReview";
	}
	
}
