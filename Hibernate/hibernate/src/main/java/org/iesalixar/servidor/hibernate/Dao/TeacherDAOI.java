package org.iesalixar.servidor.hibernate.Dao;

import org.iesalixar.servidor.hibernate.Utils.GenericDAO;
import org.iesalixar.servidor.hibernate.model.Teacher;

public interface TeacherDAOI extends GenericDAO<Teacher> {

	public Teacher searchByNSS(final String nss);
}
