package com.jgalante.minimal;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jgalante.annotation.Param;
import com.jgalante.jgcrud.view.BaseView;
import com.jgalante.util.Parameter;

@Named
@ViewScoped
public class HomeMB extends BaseView<User, UserController> implements Serializable {

	private static final long serialVersionUID = 1L;

	private String info;

	@Inject
	@Param
	private Parameter<String> test;

	private List<User> users;

//	@Inject
//	private UserController userController;
	
//	private GenericController<User, GenericDAO<User>> genericController;
	
//	@Inject
//	@DAO
//	private GenericDAO<User> dao;

	public HomeMB() {
		System.out.println("HomeMB::Constructor");
	}

	@PostConstruct
	public void init() {
//		users = userController.findAll();
	}

	public void action() {
		User user = new User();
		user.setName(info);
		save(user);
		System.out.println("HomeMB::Action()");
		users = findAll();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Parameter<String> getTest() {
		return test;
	}

	public void setTest(Parameter<String> test) {
		this.test = test;
	}

	public List<User> getUsers() {
		return users;
	}

}
