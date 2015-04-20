package com.jgalante.minimal;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.jgalante.jgcrud.view.GenericView;

@Named
@ViewScoped
public class Home1MB extends GenericView {

	private static final long serialVersionUID = 1L;

	private String info;
	private List<User> users;

	public Home1MB() {
		System.out.println("Home1MB::Constructor");
	}

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		users = (List<User>) findAll(User.class);
	}

	@SuppressWarnings("unchecked")
	public void action() {
		User user = new User();
		user.setName(info);
		save(user);
		System.out.println("Home1MB::Action()");
		users = (List<User>) findAll(User.class);
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<User> getUsers() {
		return users;
	}

}
