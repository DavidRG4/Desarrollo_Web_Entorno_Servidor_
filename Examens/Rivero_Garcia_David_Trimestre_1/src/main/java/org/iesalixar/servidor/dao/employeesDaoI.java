package org.iesalixar.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.model.employees;

public interface employeesDaoI {
	public ArrayList<employees> getAllEmployees();
	public boolean insertEmployees(employees employees);
}
