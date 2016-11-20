package com.dealer.management.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.model.Student;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST,headers={"Accept=*/*","content-type=application/json"})
			public String saveStudent(Model mo){
		
		
		System.out.println("you r in save");
		
		/*System.out.println(stu);*/
		
		return "index";
		
	}
	
	

}
