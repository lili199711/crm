package com.briup.web.controller.systemset;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.briup.bean.SysUser;
import com.briup.service.impl.SysUserServiceImpl;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;
@RequestMapping("/userManageController")
@Controller
public class UserManageController {
	@Autowired
	private SysUserServiceImpl userService;
	@RequestMapping("/userManage")
	public String userManage(HttpSession session,@RequestParam int curPage){
		try {
			PageInfo<SysUser> pu = userService.findAllSysUser(curPage, 5);
			session.setAttribute("pu", pu);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showUserManage";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/add_user")
	public String addUser(SysUser user,HttpSession session){
		try {
			userService.addUser(user);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SysUser> pu = (PageInfo<SysUser>) session.getAttribute("pu");
		return "forward:/userManageController/userManage?curPage=" + pu.getPageNum() ;
	}
	@RequestMapping("/userUpdateBefore")
	public String roleUpdateBefore(long usrId,HttpSession session){
		try {
			SysUser mgr = userService.findOneUser(usrId);
			session.setAttribute("mgr", mgr);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showUpdateUser";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/userUpdateAfter")
	public String userUpdateAfter(SysUser user,HttpSession session){
		try {
			System.out.println(user);
			userService.updateUser(user);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SysUser> pu = (PageInfo<SysUser>) session.getAttribute("pu");
		return "forward:/userManageController/userManage?curPage=" + pu.getPageNum() ;
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/userDelete")
	public String userDelete(long usrId,HttpSession session){
		try {
			userService.deleteUser(usrId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		PageInfo<SysUser> pu =  (PageInfo<SysUser>) session.getAttribute("pu");
		System.out.println(pu.getEndRow());
		if(pu.getEndRow()%pu.getSize()==0){
			return "forward:/userManageController/userManage?curPage=" + pu.getPrePage() ;
		}else{
			return "forward:/userManageController/userManage?curPage="+ pu.getPageNum();
		}
	}
	
	
}
