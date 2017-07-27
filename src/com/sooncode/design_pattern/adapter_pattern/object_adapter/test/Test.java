package com.sooncode.design_pattern.adapter_pattern.object_adapter.test;

import com.sooncode.design_pattern.adapter_pattern.class_adapter.User;
import com.sooncode.design_pattern.adapter_pattern.object_adapter.BaseService;
import com.sooncode.design_pattern.adapter_pattern.object_adapter.Service;

public class Test {
	public static void main(String[] args) {
		Service<User> service = new BaseService<User>();
		service.save(new User());
		service.delete(null);
		service.update(null);
		service.get(null);
		//
		service.getSize(null);
	}
}
