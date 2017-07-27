package com.sooncode.design_pattern.adapter_pattern.interface_adapter.test;

import com.sooncode.design_pattern.adapter_pattern.interface_adapter.TeacherController;
import com.sooncode.design_pattern.adapter_pattern.interface_adapter.TeacherService;
import com.sooncode.design_pattern.adapter_pattern.interface_adapter.UserController;
import com.sooncode.design_pattern.adapter_pattern.interface_adapter.UserService;

public class Test {
	public static void main(String[] args) {
		 
		UserController uc = new UserController();
		uc.saveUser(new UserService<User>(), new User());
		
		
		TeacherController tc = new TeacherController();
		tc.updateTeacher(new TeacherService<Teacher>(), new Teacher());
		
		 
	}
	
	 
}
