package com.SpringDriver;

import com.service.Teacher;
import com.serviceImpl.GKTeacher;
import com.serviceImpl.HindiTeacher;
import com.serviceImpl.MathsTeacher;

public class Main {

	public static void main(String[] args) {
		//create the object of teacher
		Teacher teacher = new MathsTeacher();
		
		//use the object and retrieve the homework of particular teacher
        System.out.println(teacher.getHomework());
	}

}
