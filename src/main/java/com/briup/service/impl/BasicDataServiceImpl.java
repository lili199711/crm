package com.briup.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.Product;
import com.briup.bean.ProductExample;
import com.briup.bean.ProductExample.Criteria;
import com.briup.bean.Storage;
import com.briup.bean.StorageExample;
import com.briup.dao.ProductMapper;
import com.briup.dao.StorageMapper;
import com.briup.service.IBasicDataService;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BasicDataServiceImpl implements IBasicDataService{
	@Autowired
	private ProductMapper proMapper;
	@Autowired
	private StorageMapper stoMapper;
	
	@Override
	public PageInfo<Product> findProduct(Product product, int curPage, int row) throws CrmCommonException {
		PageHelper.startPage(curPage, row);
		ProductExample productExample = new ProductExample();
		Criteria criteria = productExample.createCriteria();
		if(!StringUtils.isBlank(product.getProdName()))
			criteria.andProdNameLike("%" + product.getProdName() + "%");
		if(!StringUtils.isBlank(product.getProdType()))
			criteria.andProdTypeLike("%" + product.getProdType() + "%");
		if(!StringUtils.isBlank(product.getProdBatch()))
			criteria.andProdBatchLike("%" + product.getProdBatch() + "%");
		List<Product> list = proMapper.selectByExample(productExample);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<Product> findProductAll(int curPage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Storage> findStorageAll(int curpage, int row) throws CrmCommonException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Storage> findStorage(Storage storage, int curPage, int row) throws CrmCommonException {
		PageHelper.startPage(curPage, row);
		StorageExample storageExample = new StorageExample();
		if(!StringUtils.isBlank(storage.getStkName()))
			storageExample.createCriteria().andStkNameLike("%" + storage.getStkName() + "%");
		if(!StringUtils.isBlank(storage.getStkWarehourse()))
			storageExample.createCriteria().andStkWarehourseLike("%" + storage.getStkWarehourse() + "%");
		List<Storage> list = stoMapper.selectByExample(storageExample);
		PageInfo<Storage> pageInfo = new PageInfo<Storage>(list);
		return pageInfo;
	}

}
