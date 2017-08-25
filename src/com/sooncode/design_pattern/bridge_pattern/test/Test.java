package com.sooncode.design_pattern.bridge_pattern.test;

import com.sooncode.design_pattern.bridge_pattern.DaoManager;
import com.sooncode.design_pattern.bridge_pattern.MysqlDao;

public class Test {
	public static void main(String[] args) {
		DaoManager<User> dm = new DaoManager<>();
		dm.setDao(new MysqlDao<User>());
		dm.save(new User());
	}
}
