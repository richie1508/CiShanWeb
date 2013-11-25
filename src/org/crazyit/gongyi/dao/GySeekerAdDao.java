package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GySeekerAd;

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
public interface GySeekerAdDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GySeekerAd get(Integer id);

	/**
	 * ����
	 * 
	 * @param seekerAd
	 *            ��Ҫ���ӵ�
	 */
	void save(GySeekerAd seekerAd);

	/**
	 * �޸�
	 * 
	 * @param seekerAd
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GySeekerAd seekerAd);

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
	 * @param seekerAd
	 *            ��Ҫɾ����
	 */
	void delete(GySeekerAd seekerAd);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GySeekerAd> findAll();

}