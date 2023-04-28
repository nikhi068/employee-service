package com.project.employeeapp.employeeresponse;

public class EmployeeResponse {

	
	private int id;

	private String name;

	private String email;

	private String bloodGroup;
	
	private AddressResponse addressResponse;
	
	private ProjectResponse projectResponse;

	public ProjectResponse getProjectResponse() {
		return projectResponse;
	}

	public void setProjectResponse(ProjectResponse projectResponse) {
		this.projectResponse = projectResponse;
	}

	public AddressResponse getAddressResponse() {
		return addressResponse;
	}

	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
