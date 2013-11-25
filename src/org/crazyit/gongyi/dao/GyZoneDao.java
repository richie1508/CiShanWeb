package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyZone;

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
public interface GyZoneDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GyZone get(Integer id);

	/**
	 * ����
	 * 
	 * @param zone
	 *            ��Ҫ���ӵ�
	 */
	void save(GyZone zone);

	/**
	 * �޸�
	 * 
	 * @param zone
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GyZone zone);

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
	 * @param zone
	 *            ��Ҫɾ����
	 */
	void delete(GyZone zone);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GyZone> findAll();

}