package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * class1表对应的实体类，用于保存表中一行二级类别信息
 * 
 * @author p
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 {
	/**
	 ** 一级类编号
	 */
    private Integer class1Id;
    /**
	 ** 一级类名称
	 */

    private String class1Name;
    /**
	 ** 序号
	 */

    private Integer class1Num;
    
    /**
	 ** 备注
	 */
    private String remark;

    
}