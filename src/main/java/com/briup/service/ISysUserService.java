package com.briup.service;

import java.util.List;

import com.briup.bean.SysRole;
import com.briup.bean.SysUser;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;

public interface ISysUserService {
	/**
	 * 系统用户登录
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws CrmCommonException
	 */
	SysUser login(String username, String password) throws CrmCommonException;

	List<SysUser> findAllMgr() throws CrmCommonException;
	
	/**
	 * 查找所有的用户角色
	 * @return
	 * @throws CrmCommonException
	 */
	List<SysRole> findAllRole() throws CrmCommonException;

	/**
	 * 根据角色编号查找角色
	 * 
	 * @param userId
	 *            角色编号
	 * @return
	 * @throws CrmCommonException
	 */
	SysRole findRoleBySysRoleId(long roleId) throws CrmCommonException;

	/**
	 * 更新用户角色
	 * 
	 * @param role
	 * @throws CrmCommonException
	 */
	void updateRole(SysRole role) throws CrmCommonException;
	
	/**
	 * 分页查找所有的系统用户
	 * @param curpage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<SysUser> findAllSysUser(int curpage, int row) throws CrmCommonException;

	int getAllRows() throws CrmCommonException;

	/**
	 * 根据userId查找SysUser
	 * @param usrId
	 * @return
	 * @throws CrmCommonException
	 */
	SysUser findOneUser(long usrId) throws CrmCommonException;
	
	/**
	 * 更新SysUser信息
	 * @param user
	 * @throws CrmCommonException
	 */
	void updateUser(SysUser user) throws CrmCommonException;
	
	/**
	 * 添加系统SysUser
	 * @param user
	 * @throws CrmCommonException
	 */
	void addUser(SysUser user) throws CrmCommonException;
	
	/**
	 * 根据系统用户编号删除sysuser
	 * @param usrId
	 * @throws CrmCommonException
	 */
	void deleteUser(long usrId) throws CrmCommonException;
	
	/**
	 * 添加用户角色
	 * @param role
	 * @throws CrmCommonException
	 */
	void addRole(SysRole role) throws CrmCommonException;
	
	/**
	 * 删除用户角色
	 * @param role_id
	 * @throws CrmCommonException
	 */
	void deleteRole(long roleId) throws CrmCommonException;
}
