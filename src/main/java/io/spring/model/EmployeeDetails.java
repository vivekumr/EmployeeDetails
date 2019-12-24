package io.spring.model;


import java.util.Date;

import lombok.Data;


@Data
public class EmployeeDetails {
	 private int empId;
	 private String firstName;
	 private String lastName;
	 private Date dob;
	 private String designation;
	 //present Address
	 private String psAddressLine1;
	 private String psAddressLine2;
	 private String psCity;
	 private String psPin;
	 private String psState;
	 private String psCountry;
	 //permanent address
	 private String pmAddressLine1;
	 private String pmAddressLine2;
	 private String pmCity;
	 private String pmPin;
	 private String pmState;
	 private String pmCountry;	 
	 //Office Address
	 private String ofAddressLine1;
	 private String ofAddressLine2;
	 private String ofCity;
	 private String ofPin;
	 private String ofState;
	 private String ofCountry;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPsAddressLine1() {
		return psAddressLine1;
	}
	public void setPsAddressLine1(String psAddressLine1) {
		this.psAddressLine1 = psAddressLine1;
	}
	public String getPsAddressLine2() {
		return psAddressLine2;
	}
	public void setPsAddressLine2(String psAddressLine2) {
		this.psAddressLine2 = psAddressLine2;
	}
	public String getPsCity() {
		return psCity;
	}
	public void setPsCity(String psCity) {
		this.psCity = psCity;
	}
	public String getPsPin() {
		return psPin;
	}
	public void setPsPin(String psPin) {
		this.psPin = psPin;
	}
	public String getPsState() {
		return psState;
	}
	public void setPsState(String psState) {
		this.psState = psState;
	}
	public String getPsCountry() {
		return psCountry;
	}
	public void setPsCountry(String psCountry) {
		this.psCountry = psCountry;
	}
	public String getPmAddressLine1() {
		return pmAddressLine1;
	}
	public void setPmAddressLine1(String pmAddressLine1) {
		this.pmAddressLine1 = pmAddressLine1;
	}
	public String getPmAddressLine2() {
		return pmAddressLine2;
	}
	public void setPmAddressLine2(String pmAddressLine2) {
		this.pmAddressLine2 = pmAddressLine2;
	}
	public String getPmCity() {
		return pmCity;
	}
	public void setPmCity(String pmCity) {
		this.pmCity = pmCity;
	}
	public String getPmPin() {
		return pmPin;
	}
	public void setPmPin(String pmPin) {
		this.pmPin = pmPin;
	}
	public String getPmState() {
		return pmState;
	}
	public void setPmState(String pmState) {
		this.pmState = pmState;
	}
	public String getPmCountry() {
		return pmCountry;
	}
	public void setPmCountry(String pmCountry) {
		this.pmCountry = pmCountry;
	}
	public String getOfAddressLine1() {
		return ofAddressLine1;
	}
	public void setOfAddressLine1(String ofAddressLine1) {
		this.ofAddressLine1 = ofAddressLine1;
	}
	public String getOfAddressLine2() {
		return ofAddressLine2;
	}
	public void setOfAddressLine2(String ofAddressLine2) {
		this.ofAddressLine2 = ofAddressLine2;
	}
	public String getOfCity() {
		return ofCity;
	}
	public void setOfCity(String ofCity) {
		this.ofCity = ofCity;
	}
	public String getOfPin() {
		return ofPin;
	}
	public void setOfPin(String ofPin) {
		this.ofPin = ofPin;
	}
	public String getOfState() {
		return ofState;
	}
	public void setOfState(String ofState) {
		this.ofState = ofState;
	}
	public String getOfCountry() {
		return ofCountry;
	}
	public void setOfCountry(String ofCountry) {
		this.ofCountry = ofCountry;
	}	 
	 
	 
}
