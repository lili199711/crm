package com.briup.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.SalChance;
import com.briup.bean.SalChanceExample;
import com.briup.bean.SalChanceExample.Criteria;
import com.briup.bean.SalPlan;
import com.briup.dao.SalChanceMapper;
import com.briup.dao.SalPlanMapper;
import com.briup.service.ISalChanceService;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class SalChanceServiceImpl implements ISalChanceService{
	@Autowired
	private SalChanceMapper chanceMapper;
	@Autowired
	private SalPlanMapper planMapper;
	
	@Override
	public void saveChance(SalChance sc) throws CrmCommonException {
		if(sc == null ){
			throw CrmCommonException.getException(406);
		}
		chanceMapper.insert(sc);
	}

	@Override
	public PageInfo<SalChance> findSalChanceByPage(int curpage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalPlan> findAllSalPlan() throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SalPlan> findSalPlans(long chcId) throws CrmCommonException {
		
		return null;
	}

	@Override
	public PageInfo<SalPlan> findSalPlanByPage(int curpage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateChance(SalChance sc) throws CrmCommonException {
		if(sc == null){
			throw CrmCommonException.getException(406);
		}
		chanceMapper.updateByPrimaryKey(sc);
	}

	@Override
	public SalChance findOneSalChance(long chcId) throws CrmCommonException {
		SalChance chance = chanceMapper.selectByPrimaryKey(chcId);
		if(chance == null){
			throw CrmCommonException.getException(404);
		}
		return chance;
	}

	@Override
	public SalPlan findSalPlan(long chcId) throws CrmCommonException {
		SalPlan plan = planMapper.selectByPrimaryKey(chcId);
		if(plan == null){
			throw CrmCommonException.getException(404);
		}
		return plan;
	}

	@Override
	public void deleteSalChance(long chcId) throws CrmCommonException {
		chanceMapper.deleteByPrimaryKey(chcId);

	}

	@Override
	public void savePlan(SalPlan sp) throws CrmCommonException {
		if(sp == null ){
			throw CrmCommonException.getException(406);
		}
		planMapper.insert(sp);
		
	}

	@Override
	public void deleteSalPlan(long plaId) throws CrmCommonException {
		planMapper.deleteByPrimaryKey(plaId);
		
	}

	@Override
	public void updateSalPlan(SalPlan sp) throws CrmCommonException {
		if(sp == null){
			throw CrmCommonException.getException(406);
		}
		planMapper.updateByPrimaryKey(sp);
		
	}

	@Override
	public PageInfo<SalChance> findSalPageByCon(int curpage, int row, SalChance sc) throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		SalChanceExample chanceExample = new SalChanceExample();
		Criteria criteria = chanceExample.createCriteria();
		if(!StringUtils.isBlank(sc.getChcCustName()))
			criteria.andChcCustNameLike("%" + sc.getChcCustName() + "%");
		if(!StringUtils.isBlank(sc.getChcTitle()))
			criteria.andChcTitleLike("%" + sc.getChcTitle() + "%");
		if(!StringUtils.isBlank(sc.getChcLinkman()))
			criteria.andChcLinkmanLike("%" + sc.getChcLinkman() + "%");
		List<SalChance> list = chanceMapper.selectByExample(chanceExample);
		PageInfo<SalChance> pageInfo = new PageInfo<SalChance>(list);
		return pageInfo;
	}

}
