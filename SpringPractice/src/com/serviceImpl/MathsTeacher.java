package com.serviceImpl;

import com.service.Teacher;

public class MathsTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "Solve 10 Questions daily";
	}

}
