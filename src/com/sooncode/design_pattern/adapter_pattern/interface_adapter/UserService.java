package com.sooncode.design_pattern.adapter_pattern.interface_adapter;

//service 
public class UserService<User> extends AbstractService<User> {

	
	
	@Override
	public int save(User user) {
		//----------------
		return 1;
	}

	
}
