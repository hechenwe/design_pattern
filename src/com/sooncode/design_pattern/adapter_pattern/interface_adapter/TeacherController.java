package com.sooncode.design_pattern.adapter_pattern.interface_adapter;

import com.sooncode.design_pattern.adapter_pattern.interface_adapter.test.Teacher;

public class TeacherController {

	public int updateTeacher (Service<Teacher> service , Teacher teacher) {
		return service.update(teacher);
	}
}
