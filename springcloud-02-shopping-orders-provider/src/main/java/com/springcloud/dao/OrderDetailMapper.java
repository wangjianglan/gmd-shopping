package com.springcloud.dao;

import com.springcloud.entity.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {
	int deleteByPrimaryKey(Integer orderDetailId);

	int insert(OrderDetail record);

	OrderDetail selectByPrimaryKey(Integer orderDetailId);

	List<OrderDetail> selectAll();

	int updateByPrimaryKey(OrderDetail record);

	/**
	 * 查询指定订单编号的订单详细信息
	 * 
	 * @param orderId 订单编号
	 * @return成功返回 java.util.List实例，否则返回null
	 */
	public abstract List<OrderDetail> selectByOrderId(Integer orderId);
}