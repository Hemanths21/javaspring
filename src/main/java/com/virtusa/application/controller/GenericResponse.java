package com.virtusa.application.controller;

import java.io.Serializable;

import com.virtusa.application.model.Support;
import com.virtusa.application.model.Users;

public class GenericResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Users data;
	Support support;
	
	public Users getData() {
		return data;
	}
	public void setData(Users data) {
		this.data = data;
	}
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
	
}
