package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.employees;

public interface employeesDaoI {
	public List<employees> getAllEmployees();
	public employees getEmployees(String employeeNumber);
	public boolean removeEmployees(String employeeNumber);
	public boolean updateEmployees(employees employees);
	public boolean insertEmployees(employees employees);
}
