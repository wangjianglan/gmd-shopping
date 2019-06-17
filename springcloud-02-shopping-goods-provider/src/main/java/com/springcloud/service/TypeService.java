package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;

/**
 * *用于定义一级类别与二级类别模块的方法
 * @author p
 *
 */
public interface TypeService {
	/**
	 * *查询所以一级类别信息
	 * @return
	 */
	public abstract List<Class1> selectAllClass1();
	/**
	 * *根据一级类
	 * @param class1Id
	 * @return
	 */
	public abstract List<Class2> selectClass2ByClass1Id(Integer class1Id);
}
