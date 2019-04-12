package com.briup.web.controller.systemset;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.SysRole;
import com.briup.service.impl.SysUserServiceImpl;
import com.briup.util.CrmCommonException;
@RequestMapping("/roleManageController")
@Controller
public class RoleManageController {
	@Autowired
	private SysUserServiceImpl userService;
	@RequestMapping("/roleManage")
	public String roleManage(HttpSession session){
		try {
			List<SysRole> findAllRole = userService.findAllRole();
			session.setAttribute("role", findAllRole);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showRoleManage";
	}
	@RequestMapping("/add_role")
	public String addRole(SysRole role){
		try {
			userService.addRole(role);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/roleManageController/roleManage";
	}
	@RequestMapping("/roleUpdateBefore")
	public String roleUpdateBefore(long roleId,HttpSession session){
		try {
			SysRole role = userService.findRoleBySysRoleId(roleId);
			session.setAttribute("role", role);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/showPage/showUpdateRole";
	}
	@RequestMapping("/roleUpdateAfter")
	public String roleUpdateAfter(SysRole role){
		try {
			System.out.println(role);
			userService.updateRole(role);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/roleManageController/roleManage";
	}
	@RequestMapping("/roleDelete")
	public String roleDelete(long roleId){
		try {
			userService.deleteRole(roleId);
		} catch (CrmCommonException e) {
			e.printStackTrace();
		}
		return "forward:/roleManageController/roleManage";
	}
	
	
	
	
}
