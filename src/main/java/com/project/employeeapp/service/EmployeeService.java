package com.project.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.employeeapp.employeeresponse.AddressResponse;
import com.project.employeeapp.employeeresponse.EmployeeResponse;
import com.project.employeeapp.employeeresponse.ProjectResponse;
import com.project.employeeapp.entity.Employee;
import com.project.employeeapp.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RestTemplate restTemplate;

	public EmployeeResponse getEmployeeById(int id) {

		Employee employee = employeeRepo.findById(id).get();

		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

		AddressResponse addressResponse = restTemplate
				.getForObject("http://localhost:8081/address-app/api/address/{id}", AddressResponse.class, id);
		ProjectResponse projectResponse = restTemplate
				.getForObject("http://localhost:8082/project-app/api/project/{id}", ProjectResponse.class, id);

		employeeResponse.setProjectResponse(projectResponse);
		employeeResponse.setAddressResponse(addressResponse);
		return employeeResponse;

	}
}
