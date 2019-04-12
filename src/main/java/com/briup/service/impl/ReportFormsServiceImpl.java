package com.briup.service.impl;

import java.util.List;
import java.util.Set;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.bean.CstCustomer;
import com.briup.bean.CstCustomerExample;
import com.briup.bean.Orders;
import com.briup.bean.OrdersExample;
import com.briup.bean.OrdersExample.Criteria;
import com.briup.bean.OrdersLine;
import com.briup.bean.OrdersLineExample;
import com.briup.dao.CstCustomerMapper;
import com.briup.dao.OrdersLineMapper;
import com.briup.dao.OrdersMapper;
import com.briup.service.IReportFormsService;
import com.briup.util.CrmCommonException;
@Service
public class ReportFormsServiceImpl implements IReportFormsService{
	@Autowired
	private OrdersMapper orderMapper;
	@Autowired
	private OrdersLineMapper orderLineMapper;
	@Autowired
	private CstCustomerMapper custMapper;
	@Autowired
	private CustomerServiceImpl custService;
	
	//客户贡献分析
	@Override
	public CategoryDataset findCstcontribute(String cust_name) throws Exception {
		//根据客户名怎么获取金额：拿到订单项表中的价格进行累加
		//客户表、订单表、订单项表
		/*
		 * 通过客户名获取订单表信息（订单表中有客户名）
		 * 通过订单编号获取订单项表信息（订单项表中有订单编号）
		 * 
		 */
		//根据客户名查出客户id
		CstCustomerExample customerExample = new CstCustomerExample();
		com.briup.bean.CstCustomerExample.Criteria criteria1 = customerExample.createCriteria();
		criteria1.andCustNameEqualTo(cust_name);
		List<CstCustomer> custlist = custMapper.selectByExample(customerExample);
		CstCustomer customer = custlist.get(0);
		//根据客户id查出订单表信息
		OrdersExample ordersExample = new OrdersExample();
		Criteria criteria = ordersExample.createCriteria();
		criteria.andOdrCustIdEqualTo(customer.getCustId());
		List<Orders> orderlist = orderMapper.selectByExample(ordersExample);
		Double sum = 0.0;
		for (Orders orders : orderlist) {
			//根据订单编号查出订单项信息
			OrdersLineExample ordersLineExample = new OrdersLineExample();
			com.briup.bean.OrdersLineExample.Criteria criteria2 = ordersLineExample.createCriteria();
			criteria2.andOddOrderIdEqualTo(orders.getOdrId());
			List<OrdersLine> orderlinelist = orderLineMapper.selectByExample(ordersLineExample);
			for (OrdersLine ordersLine : orderlinelist) {
				Long price = ordersLine.getOddPrice();//拿到价格
				Long oddCount = ordersLine.getOddCount();//拿到订单项数量
				System.out.println(price +"\t" + oddCount);
				sum = sum + price * oddCount;
				System.out.println(sum);
			}
		}
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(sum, "客户贡献", cust_name);
		return dataset;
	}
//客户构成分析
	@Override
	public CategoryDataset findCstMakeup(int condit) throws CrmCommonException {
		List<CstCustomer> list = custService.findAllCustomer();
		int size = list.size();//客户总数
		DefaultCategoryDataset dataset= new DefaultCategoryDataset();
		//按等级
		if(condit == 0){
			Set<String> levelLable = custService.findAllCustomerLevelLable();
			for (String string : levelLable) {
				List<CstCustomer> list2 = custService.findCstCustomerByLevelLable(string);
				//某个等级的客户数量
				int size1 = list2.size();
				System.out.println((double)size1/(double)size);
				double result = (double)size1/(double)size;
				dataset.addValue(result, string, string);
			}
		}
		//按信用度
		if(condit == 1){
			Set<Long> set = custService.findAllCustomerCredit();
			for (Long long1 : set) {
				List<CstCustomer> list2 = custService.findCstCustomerByCredit(long1);
				//某个信用度的客户数量
				int size1 = list2.size();
				double result = (double)size1/(double)size;
				dataset.addValue(result, long1, long1);
			}
		}
		//按满意度
		if(condit == 2){
			Set<Long> set = custService.findAllCustomerSatisfy();
			for (Long long1 : set) {
				List<CstCustomer> list2 = custService.findCstCustomerBySatisfy(long1);
				//某个满意度的客户数量
				int size1 = list2.size();
				double result = (double)size1/(double)size;
				dataset.addValue(result, long1, long1);
			}
		}
		return dataset;
	}

}
