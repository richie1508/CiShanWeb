package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyAds;

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
public interface GyAdsDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GyAds get(Integer id);

	/**
	 * ����
	 * 
	 * @param ads
	 *            ��Ҫ���ӵ�
	 */
	void save(GyAds ads);

	/**
	 * �޸�
	 * 
	 * @param ads
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GyAds ads);

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
	 * @param ads
	 *            ��Ҫɾ����
	 */
	void delete(GyAds ads);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GyAds> findAll();

}