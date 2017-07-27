package com.sooncode.design_pattern.adapter_pattern.class_adapter.test;

import com.sooncode.design_pattern.adapter_pattern.class_adapter.BaseDao;
import com.sooncode.design_pattern.adapter_pattern.class_adapter.Dao;
import com.sooncode.design_pattern.adapter_pattern.class_adapter.User;

public class Test {
	public static void main(String[] args) {
		Dao<User> dao = new BaseDao<User>();
		dao.save(new User());
		dao.delete(null);
		dao.update(null);
		dao.get(null);
		//
		dao.getSize(null);
	}
}
