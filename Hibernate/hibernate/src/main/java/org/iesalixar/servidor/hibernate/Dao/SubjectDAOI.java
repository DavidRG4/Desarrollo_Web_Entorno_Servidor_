package org.iesalixar.servidor.hibernate.Dao;


import org.iesalixar.servidor.hibernate.Utils.GenericDAO;
import org.iesalixar.servidor.hibernate.model.Subject;

public interface SubjectDAOI extends GenericDAO<Subject> {

	public Subject searchByName(final String name);
}