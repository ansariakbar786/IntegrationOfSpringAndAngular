package com.example.test.demo_Angular;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("rest/api")
public class EmployeeController {
	
	@RequestMapping("/getEmpAll")
	public List<Employee> getEmpDetails()
	{
		
		List list=Arrays.asList(new Employee("emp1", "akbar", "male", 1200, "12/12/2012"),
				new Employee("emp2", "raaz", "fmale", 9800, "08/12/2079"),
				new Employee("emp3", "karan", "male", 0200, "11/18/1992"),
				new Employee("emp4", "raju", "male", 0200, "11/18/55"));
		return list;
				
				
	}

}
