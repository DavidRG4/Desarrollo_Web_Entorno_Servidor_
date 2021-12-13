package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.offices;

public interface officesDaoI {
	public List<offices> getAllOffices();

	public offices getOffices(String officeCode);

	public boolean removeOffices(String officeCode);

	public boolean updateOffices(offices offices);

	public boolean insertOffices(offices offices);
}
