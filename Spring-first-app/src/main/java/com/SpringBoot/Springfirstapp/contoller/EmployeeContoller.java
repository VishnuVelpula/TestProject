package com.SpringBoot.Springfirstapp.contoller;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Springfirstapp.Model.Employee;
import com.SpringBoot.Springfirstapp.respository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1")
public class EmployeeContoller {
	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return this.employeeRepository.findAll();
		
	}
	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.employeeRepository.save(employee);
		
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Optional<Employee>> getEmpById(@PathParam(value="id") BigInteger empId){
		Optional<Employee> emp = this.employeeRepository.findById(empId);
		return ResponseEntity.ok().body(emp);
	}

}

