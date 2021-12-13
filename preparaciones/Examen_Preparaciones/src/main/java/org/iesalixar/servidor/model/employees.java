package org.iesalixar.servidor.model;

public class employees {
private String employeeNumber;
private String lastName;
private String firstName;
private String extension;
private String email;
private String officeCode;
private String reportsTo;
private String jobTitle;
public employees() {
	// TODO Auto-generated constructor stub
}
public employees(String employeeNumber, String lastName, String firstName, String extension, String email,
		String officeCode, String reportsTo, String jobTitle) {
	super();
	this.employeeNumber = employeeNumber;
	this.lastName = lastName;
	this.firstName = firstName;
	this.extension = extension;
	this.email = email;
	this.officeCode = officeCode;
	this.reportsTo = reportsTo;
	this.jobTitle = jobTitle;
}
public String getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(String employeeNumber) {
	this.employeeNumber = employeeNumber;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getExtension() {
	return extension;
}
public void setExtension(String extension) {
	this.extension = extension;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getOfficeCode() {
	return officeCode;
}
public void setOfficeCode(String officeCode) {
	this.officeCode = officeCode;
}
public String getReportsTo() {
	return reportsTo;
}
public void setReportsTo(String reportsTo) {
	this.reportsTo = reportsTo;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

 
}
