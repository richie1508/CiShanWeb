package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GySeeker;

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
public interface GySeekerDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GySeeker get(Integer id);

	/**
	 * ����
	 * 
	 * @param seeker
	 *            ��Ҫ���ӵ�
	 */
	void save(GySeeker seeker);

	/**
	 * �޸�
	 * 
	 * @param seeker
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GySeeker seeker);

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
	 * @param seeker
	 *            ��Ҫɾ����
	 */
	void delete(GySeeker seeker);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GySeeker> findAll();

}