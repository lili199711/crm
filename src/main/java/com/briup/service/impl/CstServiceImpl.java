package com.briup.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.CstCustomer;
import com.briup.bean.CstCustomerExample;
import com.briup.bean.CstService;
import com.briup.bean.CstServiceExample;
import com.briup.bean.SysUser;
import com.briup.bean.CstCustomerExample.Criteria;
import com.briup.dao.CstServiceMapper;
import com.briup.service.ICstService;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CstServiceImpl implements ICstService{
	@Autowired
	private CstServiceMapper serviceMapper;
	
	@Override
	public void save(CstService cstService) throws CrmCommonException {
		if(cstService == null)
			throw CrmCommonException.getException(406);
		List<CstService> list = this.findAllCstService();
		long max = 0;
		for (int i = 0; i < list.size(); i++) {
			long id = list.get(i).getSvrId();
			if(id >= max){
				long temp = max;
				max = id;
				id = temp;
			}
		}
		long index = max + 1;
		cstService.setSvrId(index);
		serviceMapper.insert(cstService);
	}
	
	@Override
	public List<CstService> findAllCstService() throws CrmCommonException {
		CstServiceExample serviceExample = new CstServiceExample();
		List<CstService> list = serviceMapper.selectByExample(serviceExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}

	@Override
	public List<SysUser> findAllManagerName() throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<CstService> findCstServiceByCondition(CstService con, int curPage, int row)
			throws CrmCommonException {
		PageHelper.startPage(curPage, row);
		CstServiceExample serviceExample = new CstServiceExample();
		if(!StringUtils.isBlank(con.getSvrCustName()))
			serviceExample.createCriteria().andSvrCustNameLike("%" +con.getSvrCustName() + "%");
		if(!StringUtils.isBlank(con.getSvrTitle()))
			serviceExample.createCriteria().andSvrTitleLike("%" + con.getSvrTitle() + "%");
		if(!StringUtils.isBlank(con.getSvrType()))
			serviceExample.createCriteria().andSvrTypeLike("%" + con.getSvrType() + "%");
		if(!StringUtils.isBlank(con.getSvrStatus()))
			serviceExample.createCriteria().andSvrStatusLike("%" + con.getSvrStatus() + "%");
		List<CstService> list = serviceMapper.selectByExample(serviceExample);
		PageInfo<CstService> pageInfo = new PageInfo<CstService>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<CstService> findServiceOnDealed(CstService con, int curPage, int row) throws CrmCommonException {
		PageHelper.startPage(curPage, row);
		CstServiceExample serviceExample = new CstServiceExample();
		if(!StringUtils.isBlank(con.getSvrCustName()))
			serviceExample.createCriteria().andSvrCustNameLike("%" +con.getSvrCustName() + "%");
		if(!StringUtils.isBlank(con.getSvrTitle()))
			serviceExample.createCriteria().andSvrTitleLike("%" + con.getSvrTitle() + "%");
		if(!StringUtils.isBlank(con.getSvrType()))
			serviceExample.createCriteria().andSvrTypeLike("%" + con.getSvrType() + "%");
		if(!StringUtils.isBlank(con.getSvrStatus()))
			serviceExample.createCriteria().andSvrStatusEqualTo("已分配");
		List<CstService> list = serviceMapper.selectByExample(serviceExample);
		PageInfo<CstService> pageInfo = new PageInfo<CstService>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<CstService> findAllService(int curPage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<CstService> findByfp(int curPage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<CstService> findBycl(int curPage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long svrId) throws CrmCommonException {
		serviceMapper.deleteByPrimaryKey(svrId);
		
	}

	@Override
	public void updateCstService(CstService cstService) throws CrmCommonException {
		if(cstService == null){
			throw CrmCommonException.getException(404);
		}
		serviceMapper.updateByPrimaryKey(cstService);
	}

	@Override
	public CstService findServiceById(long svrId) throws CrmCommonException {
		CstService cstService = serviceMapper.selectByPrimaryKey(svrId);
		
		if(cstService == null){
			throw CrmCommonException.getException(404);
		}
		return cstService;
	}

	@Override
	public void updateinfo(CstService cstService) throws CrmCommonException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Dealresult(CstService cstService) throws CrmCommonException {
		// TODO Auto-generated method stub
		
	}


}
