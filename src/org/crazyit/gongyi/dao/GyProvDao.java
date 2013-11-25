package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyProv;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2010, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface GyProvDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GyProv get(Integer id);

	/**
	 * ����
	 * 
	 * @param prov
	 *            ��Ҫ���ӵ�
	 */
	void save(GyProv prov);

	/**
	 * �޸�
	 * 
	 * @param prov
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GyProv prov);

	/**
	 * ɾ��
	 * 
	 * @param id
	 *            ��Ҫɾ����id
	 */
	void delete(Integer id);

	/**
	 * ɾ��
	 * 
	 * @param prov
	 *            ��Ҫɾ����
	 */
	void delete(GyProv prov);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GyProv> findAll();

}