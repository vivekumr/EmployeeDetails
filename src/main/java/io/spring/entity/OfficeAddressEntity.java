package io.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "office_address_table")
public class OfficeAddressEntity {
	@Id
	@Column(name="emp_id",length = 20)
 	private int empId;
	@Column(name = "address_1",length = 20)
	private String ofAddressLine1;
	@Column(name = "address_2",length = 20)
	private String ofAddressLine2;
	@Column(name = "city",length = 20)
	private String ofCity;
	@Column(name = "pin",length = 20)
	private int ofPin;
	@Column(name = "state",length = 20)
	private String ofState;
	@Column(name = "country",length = 20)
	private String ofCountry;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public int getOfPin() {
		return ofPin;
	}
	public void setOfPin(int ofPin) {
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
