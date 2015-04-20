package com.jgalante.minimal;

import java.util.List;

import com.jgalante.jgcrud.persistence.BaseDAO;

public class UserDAO extends BaseDAO<User> {

	private static final long serialVersionUID = 1L;

	public List<User> findAll() {
		List<User> users = super.findAll();
		return users;
	}

//	@Transactional
//	public void save(User user) {
//		getEntityManager().merge(user);		
//	}

}
