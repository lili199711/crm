package com.briup.service;

import java.util.List;

import com.briup.bean.SalChance;
import com.briup.bean.SalPlan;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;

public interface ISalChanceService {
	/**
	 * 保存销售机会
	 * @param sc
	 * @throws CrmCommonException
	 */
	void saveChance(SalChance sc) throws CrmCommonException;

	/**
	 * 查找所有的销售机会，带分页
	 * @param curpage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<SalChance> findSalChanceByPage(int curpage, int row) throws CrmCommonException;

	/**
	 * 查找所有的开发计划 不带分页
	 * @return
	 * @throws CrmCommonException
	 */
	List<SalPlan> findAllSalPlan() throws CrmCommonException;

	/**
	 * 根据开发计划编号查找开发机会
	 * @param chcId
	 * @return
	 * @throws CrmCommonException
	 */
	List<SalPlan> findSalPlans(long chcId) throws CrmCommonException;

	/**
	 *	查找所有的开发计划
	 * @param curpage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<SalPlan> findSalPlanByPage(int curpage, int row) throws CrmCommonException;

	/**
	 * 更新开发计划信息
	 * @param sc
	 * @throws CrmCommonException
	 */
	void updateChance(SalChance sc) throws CrmCommonException;

	/**
	 * 根据销售机会id查找销售机会
	 * @param chcId
	 * @return
	 * @throws CrmCommonException
	 */
	SalChance findOneSalChance(long chcId) throws CrmCommonException;

	/**
	 * 更具销售机会id查找开发计划
	 * @param chcId
	 * @return
	 * @throws CrmCommonException
	 */
	SalPlan findSalPlan(long chcId) throws CrmCommonException;

	/**
	 * 根据销售机会id删除销售机会
	 * @param chcId
	 * @throws CrmCommonException
	 */
	void deleteSalChance(long chcId) throws CrmCommonException;

	/**
	 * 保存开发计划
	 * @param sp
	 * @throws CrmCommonException
	 */
	void savePlan(SalPlan sp) throws CrmCommonException;
	
	/**
	 * 根据开发计划id删除开发计划 
	 * @param plaId
	 * @throws CrmCommonException
	 */
	void deleteSalPlan(long plaId) throws CrmCommonException;
	
	/**
	 * 更新开发计划信息
	 * @param sp
	 * @throws CrmCommonException
	 */
	void updateSalPlan(SalPlan sp) throws CrmCommonException;


	/**
	 * 根据条件查找所有的销售机会
	 * @param curpage
	 * @param row
	 * @param sc
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<SalChance> findSalPageByCon(int curpage, int row, SalChance sc) throws CrmCommonException;
	
}
