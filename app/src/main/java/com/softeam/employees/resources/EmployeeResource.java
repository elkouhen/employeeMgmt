package com.softeam.employees.resources;

import com.softeam.employees.dto.Employee;
import com.softeam.employees.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {

	@Autowired
	private EmployeeMapper employeeMapper;

	@RequestMapping()
	public Collection<Employee> employees() {
		return employeeMapper.findEmployees();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee e) {
		employeeMapper.insertEmployee(e);
	}
}
