package io.spring.mainController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.spring.model.EmployeeDetails;
import io.spring.service.EmployeeDetailSavingService;
import io.spring.service.GetEmployeeDetailsService;

//This Class is main Controller Class
@Controller
public class MainController {
	@Autowired
	private EmployeeDetailSavingService saveService;
	@Autowired
	private GetEmployeeDetailsService getService;
	// This Method is Launching Home Page
	@GetMapping("/home")
	public String launchPage(Model model) {
		return "home";
	}
	//Employee Registration Page
	@GetMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("emp", new EmployeeDetails());
		return "registrationPage";
	}

	// This Method is Process of Saving Data

	@PostMapping("store")
	public String saveEmployeeDetails(@ModelAttribute("emp") EmployeeDetails employee, Model model) {
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		String dob=format.format(employee.getDob());
		try {
			employee.setDob(format.parse(dob));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("msg", saveService.saveEmpDetails(employee));
		model.addAttribute("emp", new EmployeeDetails());
		return "registrationPage";
	}
	
	//Get All EmployeeDetails 
	@GetMapping("getData")
	public String getAllEmployee(Model model) {
		List<EmployeeDetails> empDetails=getService.getAllEmployee();
		model.addAttribute("data",empDetails);
		return "allEmployeeDetails";
	}
	//deleteing employee data
	@GetMapping(value = "/deleteData")
	public String deleteData(Model model,@RequestParam("sno") int sid) {
		model.addAttribute("emp", new EmployeeDetails());
		saveService.deleteEmployee(sid);
		return "registrationPage";
	}
	
}
