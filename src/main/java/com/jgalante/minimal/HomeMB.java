package com.jgalante.minimal;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class HomeMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String info;
	
	@Inject
	private UserDAO userDAO;
	
	public HomeMB() {
		System.out.println("HomeMB::Constructor");
	}
	
	public void action() {
		System.out.println("HomeMB::Action()");
		userDAO.findAll();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
