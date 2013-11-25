package org.crazyit.gongyi.dao;

import java.util.List;

import org.crazyit.gongyi.module.GyDonation;

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
public interface GyDonationDao {
	/**
	 * ����id����
	 * 
	 * @param id
	 *            ��Ҫ���ҵ�id
	 */
	GyDonation get(Integer id);

	/**
	 * ����
	 * 
	 * @param donation
	 *            ��Ҫ���ӵ�
	 */
	void save(GyDonation donation);

	/**
	 * �޸�
	 * 
	 * @param donation
	 *            ��Ҫ�޸ĵ�
	 */
	void update(GyDonation donation);

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
	 * @param donation
	 *            ��Ҫɾ����
	 */
	void delete(GyDonation donation);

	/**
	 * ��ѯȫ��
	 * 
	 * @return ���ȫ��
	 */
	List<GyDonation> findAll();

}