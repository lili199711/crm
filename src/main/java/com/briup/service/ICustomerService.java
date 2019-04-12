package com.briup.service;

import java.util.List;
import java.util.Set;

import com.briup.bean.CstActivity;
import com.briup.bean.CstCustomer;
import com.briup.bean.CstLinkman;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;

public interface ICustomerService {
	/**
	 * 查询所有的客户 不带分页
	 * 
	 * @return
	 * @throws CrmCommonException
	 */
	List<CstCustomer> findAllCustomer() throws CrmCommonException;
	List<CstLinkman> findAllCstLinkman() throws CrmCommonException;
	List<CstActivity> findAllCstActivity() throws CrmCommonException;
	
	
	
	/**
	 * 根据id查询客户
	 * 
	 * @param id
	 * @return
	 * @throws CrmCommonException
	 */
	CstCustomer findCustomerById(long id) throws CrmCommonException;

	/**
	 * 根据客户名字查找客户
	 * 
	 * @param cstName
	 * @return
	 * @throws CrmCommonException
	 */
	CstCustomer findCustomerByCstName(String cstName) throws CrmCommonException;

	/**
	 * 查询所有客户的等级
	 * 
	 * @return
	 * @throws CrmCommonException
	 */
	Set<String> findAllCustomerLevelLable() throws CrmCommonException;

	/**
	 * 根据等级查询所有的客户
	 * 
	 * @param levelLable
	 * @return
	 * @throws CrmCommonException
	 */
	List<CstCustomer> findCstCustomerByLevelLable(String levelLable) throws CrmCommonException;

	/**
	 * 查询所有所有客戶的信譽度
	 * 
	 * @return
	 * @throws CrmCommonException
	 */
	Set<Long> findAllCustomerCredit() throws CrmCommonException;
	
	/**
	 * 根据信誉度查找客户
	 * @param credit
	 * @return
	 * @throws CrmCommonException
	 */
	List<CstCustomer> findCstCustomerByCredit(long credit) throws CrmCommonException;

	/**
	 * 查找所有客户的满意度
	 * @return
	 * @throws CrmCommonException
	 */
	Set<Long> findAllCustomerSatisfy() throws CrmCommonException;

	/**
	 * 查询客户的满意度
	 * @param satisfy
	 * @return
	 * @throws CrmCommonException
	 */
	List<CstCustomer> findCstCustomerBySatisfy(long satisfy) throws CrmCommonException;
	
	/**
	 * 根据客户编号查找客户
	 * @param cstNo
	 * @return
	 * @throws CrmCommonException
	 */
	CstCustomer findCustomerByCstNo(String cstNo) throws CrmCommonException;

	/**
	 * 更新客户信息
	 * @param cstCustomer
	 * @throws CrmCommonException
	 */
	void updateCustomer(CstCustomer cstCustomer) throws CrmCommonException;

	/**
	 * 保存联系人
	 * @param cstLinkman
	 * @throws CrmCommonException
	 */
	void saveLinkMan(CstLinkman cstLinkman) throws CrmCommonException;
	
	/**
	 * 删除联系人
	 * @param id
	 * @throws CrmCommonException
	 */
	void deleteLinkMan(long id) throws CrmCommonException;

	/**
	 * 查找所有的客户 带分页
	 * @param curpage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<CstCustomer> findAllCstCustomer(int curpage, int row) throws CrmCommonException;

	/**
	 * 根据条件查找所有的客户 带分页
	 * @param curpage
	 * @param row
	 * @param cstCustomer
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<CstCustomer> findCustomerPageByCon(int curpage, int row, CstCustomer cstCustomer) throws CrmCommonException;

	/**
	 * 根据客户id查找所有的联系人
	 * @param cstId
	 * @return
	 * @throws CrmCommonException
	 */
	List<CstLinkman> findAllLinkManByCstId(long cstId) throws CrmCommonException;

	/**
	 * 根据联系人id查找联系人
	 * @param id
	 * @return
	 * @throws CrmCommonException
	 */
	CstLinkman findLinkManById(long id) throws CrmCommonException;
	
	/**
	 * 更新联系人信息
	 * @param lkm
	 * @throws CrmCommonException
	 */
	void updateLinkman(CstLinkman lkm) throws CrmCommonException;

	/**
	 * 根据客户id删除客户
	 * @param id
	 * @throws CrmCommonException
	 */
	void deleteCustomerById(long id) throws CrmCommonException;

	/**
	 * 保存交往记录
	 * @param cstActivity
	 * @throws CrmCommonException
	 */
	void saveCstActivity(CstActivity cstActivity) throws CrmCommonException;
	
	/**
	 * 根据客户号查找所有的交往记录
	 * @param cstId
	 * @return
	 * @throws CrmCommonException
	 */
	List<CstActivity> findAllCstActivityByCstId(long cstId) throws CrmCommonException;

	/**
	 * 根据交往记录id查找交往记录
	 * @param atvId
	 * @return
	 * @throws CrmCommonException
	 */
	CstActivity findCstActivityById(long atvId) throws CrmCommonException;
	
	/**
	 * 更新交往记录
	 * @param cstActivity
	 * @throws CrmCommonException
	 */
	void updateAtv(CstActivity cstActivity) throws CrmCommonException;
	
	/**
	 * 删除交往记录根据记录id 
	 * @param atvId
	 * @throws CrmCommonException
	 */
	void deleteAtvById(long atvId) throws CrmCommonException;

	/**
	 * 保存客户信息
	 * @param cst
	 * @throws CrmCommonException
	 */
	void saveCustomer(CstCustomer cst) throws CrmCommonException;
}
