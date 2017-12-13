package com.example.domain;

public class Employee {
	private String code; 
	private String name;
	private String gender;
	private Integer salary;
	private String dob;
	/**
	 * @param code
	 * @param name
	 * @param gender
	 * @param salary
	 * @param dob
	 */
	public Employee(String code, String name, String gender, Integer salary, String dob) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.dob = dob;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the gender
	 */
	public String getgender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setgender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
