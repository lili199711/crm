package com.briup.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.SysRole;
import com.briup.bean.SysRoleExample;
import com.briup.bean.SysUser;
import com.briup.bean.SysUserExample;
import com.briup.bean.SysUserExample.Criteria;
import com.briup.dao.SysRoleMapper;
import com.briup.dao.SysUserMapper;
import com.briup.service.ISysUserService;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class SysUserServiceImpl implements ISysUserService{
	@Autowired
	private SysUserMapper userMapper;
	@Autowired
	private SysRoleMapper roleMapper;
	
	@Override
	public SysUser login(String username, String password) throws CrmCommonException {
//		若当前参数（用户）为空时
		if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
			throw CrmCommonException.getException(401);
		}
		SysUserExample userExample = new SysUserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsrNameEqualTo(username).andUsrPasswordEqualTo(password);
		List<SysUser> list = userMapper.selectByExample(userExample);
		//用户名不存在
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(402);
		}
		return list.get(0);
	}

	@Override
	public List<SysUser> findAllMgr() throws CrmCommonException {
		SysUserExample userExample = new SysUserExample();
		List<SysUser> list = userMapper.selectByExample(userExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}

	@Override
	public List<SysRole> findAllRole() throws CrmCommonException {
		SysRoleExample  roleExample = new SysRoleExample();
		List<SysRole> list = roleMapper.selectByExample(roleExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}

	@Override
	public SysRole findRoleBySysRoleId(long roleId) throws CrmCommonException {
		SysRole role = roleMapper.selectByPrimaryKey(roleId);
		return role;
	}

	@Override
	public void updateRole(SysRole role) throws CrmCommonException {
		roleMapper.updateByPrimaryKey(role);

	}

	@Override
	public PageInfo<SysUser> findAllSysUser(int curpage, int row) throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		SysUserExample userExample = new SysUserExample();
		List<SysUser> list = userMapper.selectByExample(userExample);
		PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(list);
		return pageInfo;
	}

	@Override
	public int getAllRows() throws CrmCommonException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser findOneUser(long usrId) throws CrmCommonException {
		SysUser user = userMapper.selectByPrimaryKey(usrId);
		return user;
	}

	@Override
	public void updateUser(SysUser user) throws CrmCommonException {
		userMapper.updateByPrimaryKey(user);
		
	}

	@Override
	public void addUser(SysUser user) throws CrmCommonException {
		userMapper.insert(user);
		
	}

	@Override
	public void deleteUser(long usrId) throws CrmCommonException {
		userMapper.deleteByPrimaryKey(usrId);
		
	}

	@Override
	public void addRole(SysRole role) throws CrmCommonException {
		roleMapper.insert(role);
		
	}

	@Override
	public void deleteRole(long roleId) throws CrmCommonException {
		roleMapper.deleteByPrimaryKey(roleId);
		
	}

}
