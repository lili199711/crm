package com.briup.service.impl;

import java.util.*;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.CstActivity;
import com.briup.bean.CstActivityExample;
import com.briup.bean.CstCustomer;
import com.briup.bean.CstCustomerExample;
import com.briup.bean.CstCustomerExample.Criteria;
import com.briup.bean.CstLinkman;
import com.briup.bean.CstLinkmanExample;
import com.briup.dao.CstActivityMapper;
import com.briup.dao.CstCustomerMapper;
import com.briup.dao.CstLinkmanMapper;
import com.briup.service.ICustomerService;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CstCustomerMapper custMapper;
	@Autowired
	private CstLinkmanMapper linkMapper;
	@Autowired
	private CstActivityMapper activityMapper;
	
	@Override
	public List<CstCustomer> findAllCustomer() throws CrmCommonException {
		CstCustomerExample customerExample = new CstCustomerExample();
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}
	@Override
	public List<CstLinkman> findAllCstLinkman() throws CrmCommonException {
		CstLinkmanExample linkmanExample = new CstLinkmanExample();
		List<CstLinkman> list = linkMapper.selectByExample(linkmanExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}
	@Override
	public List<CstActivity> findAllCstActivity() throws CrmCommonException {
		CstActivityExample activityExample = new CstActivityExample();
		List<CstActivity> list = activityMapper.selectByExample(activityExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}
	@Override
	public CstCustomer findCustomerById(long id) throws CrmCommonException {
		CstCustomer customer = custMapper.selectByPrimaryKey(id);
		if(customer==null)
			throw CrmCommonException.getException(404);
		return customer;
	}

	@Override
	public CstCustomer findCustomerByCstName(String cstName) throws CrmCommonException {
		
		return null;
	}

	@Override
	public Set<String> findAllCustomerLevelLable() throws CrmCommonException {
		HashSet<String> set = new HashSet<String>();
		List<CstCustomer> list = this.findAllCustomer();
		for (CstCustomer cstCustomer : list) {
			String custLevelLabel = cstCustomer.getCustLevelLabel();
			set.add(custLevelLabel);
		}
		return set;
	}

	@Override
	public List<CstCustomer> findCstCustomerByLevelLable(String levelLable) throws CrmCommonException {
		CstCustomerExample customerExample = new CstCustomerExample();
		Criteria criteria = customerExample.createCriteria();
		criteria.andCustLevelLabelEqualTo(levelLable);
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		return list;
	}

	@Override
	public Set<Long> findAllCustomerCredit() throws CrmCommonException {
		HashSet<Long> set = new HashSet<Long>();
		List<CstCustomer> list = this.findAllCustomer();
		for (CstCustomer cstCustomer : list) {
			Long custCredit = cstCustomer.getCustCredit();
			set.add(custCredit);
		}
		return set;
	}

	@Override
	public List<CstCustomer> findCstCustomerByCredit(long credit) throws CrmCommonException {
		CstCustomerExample customerExample = new CstCustomerExample();
		Criteria criteria = customerExample.createCriteria();
		criteria.andCustCreditEqualTo(credit);
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		return list;
	}

	@Override
	public Set<Long> findAllCustomerSatisfy() throws CrmCommonException {
		HashSet<Long> set = new HashSet<Long>();
		List<CstCustomer> list = this.findAllCustomer();
		for (CstCustomer cstCustomer : list) {
			Long custSatisfy = cstCustomer.getCustSatisfy();
			set.add(custSatisfy);
		}
		return set;
	}

	@Override
	public List<CstCustomer> findCstCustomerBySatisfy(long satisfy) throws CrmCommonException {
		CstCustomerExample customerExample = new CstCustomerExample();
		Criteria criteria = customerExample.createCriteria();
		criteria.andCustSatisfyEqualTo(satisfy);
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		return list;
	}

	@Override
	public CstCustomer findCustomerByCstNo(String cstNo) throws CrmCommonException {
		System.out.println(cstNo);
		CstCustomerExample customerExample = new CstCustomerExample();
		Criteria criteria = customerExample.createCriteria();
		criteria.andCustNoEqualTo(cstNo);
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		return list.get(0);
	}

	@Override
	public void updateCustomer(CstCustomer cstCustomer) throws CrmCommonException {
		if(cstCustomer==null)
				throw CrmCommonException.getException(404);
		custMapper.updateByPrimaryKey(cstCustomer);
		
	}

	@Override
	public void saveLinkMan(CstLinkman cstLinkman) throws CrmCommonException {
		if(cstLinkman == null)
			throw CrmCommonException.getException(404);
		linkMapper.insert(cstLinkman);
	}

	@Override
	public void deleteLinkMan(long id) throws CrmCommonException {
		linkMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public PageInfo<CstCustomer> findAllCstCustomer(int curpage, int row) throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		CstCustomerExample customerExample = new CstCustomerExample();
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		/*if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}*/
		PageInfo<CstCustomer> pageInfo = new PageInfo<CstCustomer>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<CstCustomer> findCustomerPageByCon(int curpage, int row, CstCustomer cstCustomer)
			throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		CstCustomerExample customerExample = new CstCustomerExample();
		Criteria criteria = customerExample.createCriteria();
		if(!StringUtils.isBlank(cstCustomer.getCustNo()))
			criteria.andCustNoLike("%" + cstCustomer.getCustNo() + "%");
		if(!StringUtils.isBlank(cstCustomer.getCustName()))
			criteria.andCustNameLike("%" +cstCustomer.getCustName() + "%");
		if(!StringUtils.isBlank(cstCustomer.getCustAddr()))
			criteria.andCustAddrLike("%" + cstCustomer.getCustAddr() + "%");
		if(!StringUtils.isBlank(cstCustomer.getCustManagerName()))
			criteria.andCustManagerNameLike("%" + cstCustomer.getCustManagerName() + "%");
		if(!StringUtils.isBlank(cstCustomer.getCustLevelLabel()))
			criteria.andCustLevelLabelLike("%" + cstCustomer.getCustLevelLabel() +"%");
		List<CstCustomer> list = custMapper.selectByExample(customerExample);
		/*if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}*/
		PageInfo<CstCustomer> pageInfo = new PageInfo<CstCustomer>(list);
		return pageInfo;
	}

	@Override
	public List<CstLinkman> findAllLinkManByCstId(long cstId) throws CrmCommonException {
		CstLinkmanExample linkmanExample = new CstLinkmanExample();
		com.briup.bean.CstLinkmanExample.Criteria criteria = linkmanExample.createCriteria();
		criteria.andLkmCustIdEqualTo(cstId);
		List<CstLinkman> list = linkMapper.selectByExample(linkmanExample);
		/*if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}*/
		return list;
	}

	@Override
	public CstLinkman findLinkManById(long id) throws CrmCommonException {
		CstLinkman linkman = linkMapper.selectByPrimaryKey(id);
		if(linkman == null)
			throw CrmCommonException.getException(404);
		return linkman;
	}

	@Override
	public void updateLinkman(CstLinkman lkm) throws CrmCommonException {
		if(lkm == null)
			throw CrmCommonException.getException(404);
		linkMapper.updateByPrimaryKey(lkm);
		
	}

	@Override
	public void deleteCustomerById(long id) throws CrmCommonException {
		custMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void saveCstActivity(CstActivity cstActivity) throws CrmCommonException {
		if(cstActivity == null){
			throw CrmCommonException.getException(406);
		}
		List<CstActivity> list = this.findAllCstActivityByCstId(cstActivity.getAtvCustId());
		long index = list.size()+3;
		cstActivity.setAtvId(index);
		activityMapper.insert(cstActivity);
		
	}

	@Override
	public List<CstActivity> findAllCstActivityByCstId(long cstId) throws CrmCommonException {
		CstActivityExample activityExample = new CstActivityExample();
		activityExample.createCriteria().andAtvCustIdEqualTo(cstId);
		List<CstActivity> list = activityMapper.selectByExample(activityExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}

	@Override
	public CstActivity findCstActivityById(long atvId) throws CrmCommonException {
		CstActivity activity = activityMapper.selectByPrimaryKey(atvId);
		if(activity == null){
			throw CrmCommonException.getException(404);
		}
		return activity;
	}

	@Override
	public void updateAtv(CstActivity cstActivity) throws CrmCommonException {
		if(cstActivity == null){
			throw CrmCommonException.getException(404);
		}
		activityMapper.updateByPrimaryKey(cstActivity);
	}

	@Override
	public void deleteAtvById(long atvId) throws CrmCommonException {
		activityMapper.deleteByPrimaryKey(atvId);
		
	}

	@Override
	public void saveCustomer(CstCustomer cst) throws CrmCommonException {
//		cst.setCustId(Long.parseLong(cst.getCustNo()));
		if(cst == null)
			throw CrmCommonException.getException(406);
		List<CstCustomer> list = this.findAllCustomer();
		long max = 0;
		for (int i = 0; i < list.size(); i++) {
			long id = list.get(i).getCustId();
			if(id >= max){
				long temp = max;
				max = id;
				id = temp;
			}
		}
		long index = max + 1;
		cst.setCustId(index);
		custMapper.insert(cst);
	}

}
