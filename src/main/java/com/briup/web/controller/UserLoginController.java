package com.briup.web.controller;


import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.CstLog;
import com.briup.bean.SysRole;
import com.briup.bean.SysUser;
import com.briup.service.impl.LogServiceImpl;
import com.briup.service.impl.SysUserServiceImpl;
import com.briup.util.CrmCommonException;

@Controller
public class UserLoginController {
	@Autowired
	private SysUserServiceImpl userService;
	@Autowired
	private LogServiceImpl logService;
	
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session ) {
		/*
		 * 登录逻辑：先判断用户名是否存在
		 * 1、存在；判断密码是否正确
		 * 2、不存在；需要给出提示信息
		 * session、request、application
		 * 需要判断当前登录系统的角色状态以及用户状态是否有效
		 */
		System.out.println(username + "\t" + password);
		String path = null;
		try {
			SysUser user = userService.login(username, password);
			SysRole role = userService.findRoleBySysRoleId(user.getUsrRoleId());
			//保存日志
			CstLog log = new CstLog();
			log.setLogDate(new Date());
			log.setLogOp(user.getUsrName());
			log.setLogEvent("登录了系统");
			logService.saveLog(log);
			//当前用户状态以及角色状态是否有效
			if(user.getUsrFlag() == 1 && role.getRoleFlag() == 1){
				session.setAttribute("user", user);
				path = "main";
			}else{
				session.setAttribute("msg", "当前登录系统用户状态无效");
				path = "index";
			}
		} catch (CrmCommonException e) {
			e.printStackTrace();
			session.setAttribute("msg", e.getMessage());
			path = "index";
		}
		return path;
	}
	@RequestMapping("/loginOut")
	public String loginOut(HttpSession session,SysUser user){
		try {
			CstLog log = new CstLog();
			log.setLogDate(new Date());
			log.setLogOp(user.getUsrName());
			log.setLogEvent("退出了系统");
			logService.saveLog(log);
			session.setAttribute("user", user);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "index";
	}
	
}
