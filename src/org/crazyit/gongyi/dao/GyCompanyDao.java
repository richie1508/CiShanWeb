package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyCompany;

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
public interface GyCompanyDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GyCompany get(Integer id);

	/**
	 * ����
	 * 
	 * @param company
	 *            ��Ҫ���ӵ�
	 */
	void save(GyCompany company);

	/**
	 * �޸�
	 * 
	 * @param company
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GyCompany company);

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
	 * @param company
	 *            ��Ҫɾ����
	 */
	void delete(GyCompany company);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GyCompany> findAll();

}