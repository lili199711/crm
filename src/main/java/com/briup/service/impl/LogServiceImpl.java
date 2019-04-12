package com.briup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.CstLog;
import com.briup.bean.CstLogExample;
import com.briup.dao.CstLogMapper;
import com.briup.service.ILogService;
import com.briup.util.CrmCommonException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class LogServiceImpl implements ILogService{
	@Autowired
	private CstLogMapper logMapper;
	@Override
	public void saveLog(CstLog log) throws CrmCommonException {
		List<CstLog> list = this.findAllLog();
		long index = list.size()+1;
		log.setLogId(index);
		logMapper.insert(log);
		
	}

	@Override
	public PageInfo<CstLog> findAllLog(int curpage, int row) throws CrmCommonException {
		PageHelper.startPage(curpage, row);
		CstLogExample logExample = new CstLogExample();
		List<CstLog> list = logMapper.selectByExample(logExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		PageInfo<CstLog> pageInfo = new PageInfo<CstLog>(list);
		return pageInfo;
	}

	@Override
	public List<CstLog> findAllLog() throws CrmCommonException {
		CstLogExample logExample = new CstLogExample();
		List<CstLog> list = logMapper.selectByExample(logExample);
		if(list == null || list.size() == 0){
			throw CrmCommonException.getException(404);
		}
		return list;
	}

}
