package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * ģ�Ͳ�Ľӿڣ����ڶ����û�ģ��ķ���
 * @author p
 *
 */
public interface UsersService {
	/**
	 * ��֤�û���¼�Ƿ�ɹ�
	 * @param userId
	 * @param userPassword
	 * @param jdictionId
	 * @return
	 */
	public abstract Users login(Integer userId,String userPassword,Integer jdictionId);
	
    /**
     * ����µ��û���Ϣ
     * @param users	�µ��û���Ϣ
     * @return	��ӳɹ�����com.springcloud.entity.Users���͵�ʵ�������򷵻�null
     */
	public abstract Users insert(Users users);
	
	/**
	 * ��ѯ�����������û���Ϣ
	 * @param users	��ѯ����
	 * @param pageNumber	��ѯҳ��
	 * @return	�ɹ�����com.springframework.data.domain.Page��ʵ�������򷵻�null
	 */
	public abstract Page<Users> select(Users users,Integer pageNumber);
	
	/**
	 * �޸�ָ����ŵ��û�״̬
	 * @param userId	�û����
	 * @param userStatus	�û�״̬
	 * @return	�޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer updateStatus(Integer userId,Integer userStatus);
	
	/**
	 * ��ѯָ����ŵ��û���Ϣ
	 * @param userId	�û����
	 * @return	�ɹ�����com.springcloud.entityUsers���͵�ʵ�������򷵻�null
	 */
	public abstract Users selectById(Integer userId);
	
	/**
	 * �޸�ָ����ŵ��û���Ϣ
	 * @param users �޸��û�����Ϣ
	 * @return �޸ĳɹ����ش���0�����������򷵻�0
	 */
	public abstract Integer update(Users users);
	
	/**
	 * 
	 * @param users
	 * @return
	 */
	public abstract Integer updateMessage(Users users);
}
