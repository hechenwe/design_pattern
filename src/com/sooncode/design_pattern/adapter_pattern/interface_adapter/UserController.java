package com.sooncode.design_pattern.adapter_pattern.interface_adapter;

import com.sooncode.design_pattern.adapter_pattern.interface_adapter.test.User;

public class UserController {
	 
	
	
	public int saveUser(Service<User> userService , User user) {
		return userService.save(user);

	}
}
