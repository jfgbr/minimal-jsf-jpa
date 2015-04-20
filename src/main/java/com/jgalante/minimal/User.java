package com.jgalante.minimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

import com.jgalante.jgcrud.entity.BaseEntity;

@Entity
@Table(name = "User", 
		uniqueConstraints = @UniqueConstraint(
				columnNames = {"name" }))
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User extends BaseEntity {

	@Column(length = 255, unique = true)
	@NotEmpty(message = "{user.name.NotBlankOrEmpty.message}")
	private String name;

	public User() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}