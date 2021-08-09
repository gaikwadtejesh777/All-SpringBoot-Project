package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResource {
	
	@RequestMapping("/students")
	public List<Students> getStudents(){
		List<Students> s = new ArrayList();
		
		Students s1 = new Students();
		s1.setId(101);
		s1.setName("ABC");
		
		Students s2 = new Students();
		s2.setId(103);
		s2.setName("XYZ");
		
		s.add(s1);
		s.add(s2);
		return s;
		
	}

}
