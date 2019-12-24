package io.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.entity.EmployeeDetailsEntity;
import io.spring.model.EmployeeDetails;
import io.spring.repository.EmployeeDetailsRepository;
@Service
public class GetEmployeeDetailsServiceImpl implements GetEmployeeDetailsService{
	@Autowired
	EmployeeDetailsRepository empRepo;
	
	
	@Override
	public List<EmployeeDetails> getAllEmployee() {
		
		List<EmployeeDetails> empDetails=new ArrayList<>();
		EmployeeDetails empDetail=new EmployeeDetails();
		
		List<EmployeeDetailsEntity> empEntity=(List<EmployeeDetailsEntity>) empRepo.findAll();
		
		for (EmployeeDetailsEntity entity : empEntity) {
			//empDetail.setEmpId(entity.getEmpId());
			BeanUtils.copyProperties(entity, empDetail);
			empDetails.add(empDetail);
		}
		return empDetails;
	}
}
