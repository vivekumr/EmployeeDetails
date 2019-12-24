package io.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "permanent_address_table")
public class PermanentAddressEntity {
	@Id
	@Column(name = "emp_id",length = 20)
	private int empId;
	@Column(name = "address_1",length = 20)
	private String pmAddressLine1;
	@Column(name = "address_2",length = 20)
	private String pmAddressLine2;
	@Column(name = "city",length = 20)
	private String pmCity;
	@Column(name = "pin",length = 20)
	private int pmPin;
	@Column(name = "state",length = 20)
	private String pmState;
	@Column(name = "country",length = 20)
	private String pmCountry;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public int getPmPin() {
		return pmPin;
	}
	public void setPmPin(int pmPin) {
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
	
}
