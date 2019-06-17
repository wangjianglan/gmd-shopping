package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;

/**
 * *���ڶ���һ�������������ģ��ķ���
 * @author p
 *
 */
public interface TypeService {
	/**
	 * *��ѯ����һ�������Ϣ
	 * @return
	 */
	public abstract List<Class1> selectAllClass1();
	/**
	 * *����һ����
	 * @param class1Id
	 * @return
	 */
	public abstract List<Class2> selectClass2ByClass1Id(Integer class1Id);
}
