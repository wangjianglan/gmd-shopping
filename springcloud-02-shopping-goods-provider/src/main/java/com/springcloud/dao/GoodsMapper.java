package com.springcloud.dao;

import com.springcloud.entity.Goods;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
    
    /**
     * ��ѯGOODS����������������Ʒ��Ϣ
     * @param goods ��ѯ����
     * @return �ɹ�����java.util.list���͵�ʵ�������򷵻�null
     */
    public abstract List<Goods> select(Goods goods);
    
    
    /**
     * ���������޸�Goods����ָ��goods_id����Ʒ��Ϣ
     * @param goods �޸ĵ���Ʒ��Ϣ
     * @return	�ɹ����ش���0�����������򷵻�<=0������
     */
    public abstract Integer updateGoodsById(Goods goods);
    
    /**
     * ��ѯ����ǰ10����Ʒ��Ϣ
     * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
     */
    public abstract List<Goods> selectGroup();
}