package io.spring.service;

import io.spring.model.EmployeeDetails;

public interface EmployeeDetailSavingService {

	String saveEmpDetails(EmployeeDetails employee);

	void deleteEmployee(int sid);
	
}
