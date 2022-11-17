package com.virtusa.application.model;

import java.io.Serializable;

public class Support implements Serializable{
	String url;
	String text;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
