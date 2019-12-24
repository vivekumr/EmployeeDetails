package io.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "present_address_table")
public class PresentAddressEntity {
	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "address_1")
	private String psAddressLine1;
	@Column(name = "address_2")
	private String psAddressLine2;
	@Column(name = "city")
	private String psCity;
	@Column(name = "pin")
	private int psPin;
	@Column(name = "state")
	private String psState;
	@Column(name = "country")
	private String psCountry;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public int getPsPin() {
		return psPin;
	}
	public void setPsPin(int psPin) {
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
	
}