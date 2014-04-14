package com.jgalante.minimal;

import java.util.List;

public class UserDAO extends GenericDAO<User> {

	private static final long serialVersionUID = 1L;

	public List<User> findAll() {
		List<User> users = super.findAll();
		return users;
	}

}
