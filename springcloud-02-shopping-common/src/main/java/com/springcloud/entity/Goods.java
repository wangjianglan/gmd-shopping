package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 ** 商品编号
	 */
    private Integer goodsId;
    /**
     ** 商品名称
     */
    private String goodsName;
    /*
    * *商品价格
     */

    private Double goodsPrices;
    /**
	 * *商品折扣价
	 */

    private Double goodsDiscount;
    /**
	 * *商品状态，0预售，1热卖中，2已下架
	 */

    private Integer goodsStatus;
    /**
	 ** 商品数量
	 */

    private Integer goodsCount;
    /**
	 ** 是否新品，0时新品，1不是新品
	 */

    private Integer goodsIsNew;
    /**
	 ** 是否热卖，
	 */

    private Integer goodsIsHot;
    /**
	 ** 商品等级
	 */

    private Integer goodsLevel;
    /**
	 ** 商品简介
	 */

    private String goodsBrief;
    /**
	 ** 商品详情
	 */

    private String goodsDetail;
    /**
	 ** 商品图片
	 */

    private String goodsPhoto;
    /**
	 ** 二级类编号
	 */

    private Integer class2Id;
    /**
	 ** 查询条件，商品价格上限
	 */
    
    private Double goodsPriceMin;
    /**
	 ** 查询条件，商品价格上限
	 */
    private Double goodsPriceMax;
    /**
	 ** 查询条件，一级类编号
	 */
    private Integer class1Id;
    
    /**
     * 商品销量，用于保存统计分组的结果
     */
    private Integer goodsSum;
   
}