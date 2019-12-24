package io.spring.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.entity.EmployeeDetailsEntity;
import io.spring.entity.OfficeAddressEntity;
import io.spring.entity.PermanentAddressEntity;
import io.spring.entity.PresentAddressEntity;
import io.spring.model.EmployeeDetails;
import io.spring.repository.EmployeeDetailsRepository;
import io.spring.repository.OfficeAddressrepository;
import io.spring.repository.PermanentAddressRepository;
import io.spring.repository.PresentAddressRepository;

@Service
public class EmployeeDetailsSavingServiceImpl implements EmployeeDetailSavingService {
	// injecting repository
	@Autowired
	private EmployeeDetailsRepository empRepo;
	@Autowired
	private OfficeAddressrepository officeRepo;
	@Autowired
	private PermanentAddressRepository permRepo;
	@Autowired
	private PresentAddressRepository presRepo;

	EmployeeDetailsEntity entityData = new EmployeeDetailsEntity();
	PresentAddressEntity presentData = new PresentAddressEntity();
	PermanentAddressEntity permanentData = new PermanentAddressEntity();
	OfficeAddressEntity officeData = new OfficeAddressEntity();

	// Saving Data
	@Override
	public String saveEmpDetails(EmployeeDetails employee) {
		// coping employeeDetails to entity employee details
		BeanUtils.copyProperties(employee, entityData);
		// save employee details
		EmployeeDetailsEntity saveData = empRepo.save(entityData);

		// coping employeeDetails present Address to entity employee details presentAddress
		BeanUtils.copyProperties(employee, presentData);
		// save present address
		presRepo.save(presentData);

		// coping employeeDetails permanentAddress to entity employee details permanentAddress
		BeanUtils.copyProperties(employee, permanentData);
				// save permanent Address
		permRepo.save(permanentData);

		// coping employeeDetails officeAddress to entity employee details officeAddress
		BeanUtils.copyProperties(employee, officeData);
		// save permanent Address
		officeRepo.save(officeData);
		
		return "SuccessFully saved";
	}

	@Override
	public void deleteEmployee(int sid) {
		empRepo.deleteById(sid);
		officeRepo.deleteById(sid);
		permRepo.deleteById(sid);
		presRepo.deleteById(sid);
	}
}
