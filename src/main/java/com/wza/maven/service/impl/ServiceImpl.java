package com.wza.maven.service.impl;

import com.wza.maven.service.IService;

public class ServiceImpl implements IService {

	@Override
	public void save() {
		System.out.println("��ӳɹ�!");
	}

	@Override
	public void update() {
		System.out.println("���³ɹ�");
	}

	/*@Override
	public void delete() {
		System.out.println("ɾ���ɹ�");
	}

	@Override
	public void select() {
		System.out.println("��ѯ�ɹ�");
	}
*/
}
