package com.briup.service;

import com.briup.bean.Product;
import com.briup.bean.Storage;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageInfo;

/**
 * 基础数据服务层
 * 
 * @author briup
 */
public interface IBasicDataService {
	/**
	 * 根据条件查找产品 带分页
	 * 
	 * @param product
	 *            条件
	 * @param curPage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 *             自定义异常
	 */
	PageInfo<Product> findProduct(Product product, int curPage, int row) throws CrmCommonException;

	/**
	 * 查找所有的产品 带分页
	 * 
	 * @param curPage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 *             自定义异常
	 */
	PageInfo<Product> findProductAll(int curPage, int row) throws CrmCommonException;

	/**
	 * 查找所有的库存 带分页
	 * 
	 * @param curpage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<Storage> findStorageAll(int curpage, int row) throws CrmCommonException;

	/**
	 * 根据条件查找所有的库存 带分页
	 * 
	 * @param storage
	 * @param curPage
	 * @param row
	 * @return
	 * @throws CrmCommonException
	 */
	PageInfo<Storage> findStorage(Storage storage, int curPage, int row) throws CrmCommonException;
}
