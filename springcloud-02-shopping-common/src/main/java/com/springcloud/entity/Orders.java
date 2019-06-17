package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author p
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 7140615123552814477L;

	/**
	 * 订单编号
	 */
	private Integer orderId;
	
	/**
	 * 用户编号
	 */
	private Users user;

	/**
	 * 收货人姓名，如果省略则默认为用户表中的用户姓名
	 */
	private String consigneeName;

	/**
	 * 收货人电话，如果省略则默认为用户表中的联系电话
	 */
	private String consigneeNumber;

	/**
	 * 收货人地址，如果省略则默认为用户表中的收货地址
	 */
	private String consigneeSite;

	/**
	 * 下单时间，默认为当前时间
	 */
	@DateTimeFormat(pattern="yy-MM-dd")
	private Date orderTime;

	/**
	 * 订单总额
	 */
	private Double orderAmount;

	/**
	 * 订单状态：0为待付款，1为待发货，2为待收货，3为已付款，4为已退货
	 */
	private Integer orderStatus;

	/**
	 * 查询条件：订单起始时间
	 */
	@DateTimeFormat(pattern="yy-MM-dd")
	private Data orderDataMin;

	/**
	 * 查询条件：订单终止时间
	 */
	@DateTimeFormat(pattern="yy-MM-dd")
	private Data orderDataMax;
	
	/**
	 * 查询条件：起始年月
	 */
	private String startMonth;
	
	/**
	 * 查询条件：终止年月
	 */
	private String endMonth;
	
	/**
	 * 统计结果的年月
	 */
	private String orderMonth;
	
	/**
	 * 统计结果的销售额
	 */
	private Double orderPrice;
}