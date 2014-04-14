package com.jgalante.minimal;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="User")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User extends GenericEntity {

	private static final long serialVersionUID = 1L;

	@Column(length=255)
	private String name;

	public User() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getTextoExibicao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getOrderBy() {
		// TODO Auto-generated method stub
		return null;
	}

}