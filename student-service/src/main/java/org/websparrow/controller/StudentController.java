package org.websparrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.configuration.Student;
import org.websparrow.model.StudentModel;

@RestController
@RequestMapping(value = "student")
public class StudentController {

	@Autowired
	private Student stu;
	@GetMapping
	public StudentModel getStudent() {
		return new StudentModel(stu.getRecords());
	}
}
