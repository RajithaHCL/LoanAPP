package com.hcl.LoanApp1.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")

public class User {
	
	@Id
	@Column(name = "Name")
	private String Name;
	@Column(name = "Dob")
	private LocalDate Dob;
	@Column(name = "Gender")
	private int Gender;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getDob() {
		return Dob;
	}

	public void setDob(LocalDate dob) {
		Dob = dob;
	}

	public int getGender() {
		return Gender;
	}

	public void setGender(int gender) {
		Gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPanNumber() {
		return PanNumber;
	}

	public void setPanNumber(int panNumber) {
		PanNumber = panNumber;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getPropertyPincode() {
		return PropertyPincode;
	}

	public void setPropertyPincode(String propertyPincode) {
		PropertyPincode = propertyPincode;
	}

	public String getPropertyareasize() {
		return Propertyareasize;
	}

	public void setPropertyareasize(String propertyareasize) {
		Propertyareasize = propertyareasize;
	}

	@Column(name = "salary")
	private int salary;
	@Column(name = "PanNumber")
	private int PanNumber;
	@Column(name = " Type")
	private String Type;
	@Column(name = "propertyAddress")
	private String propertyAddress;
	

	private String PropertyPincode;
	private String Propertyareasize;

}
