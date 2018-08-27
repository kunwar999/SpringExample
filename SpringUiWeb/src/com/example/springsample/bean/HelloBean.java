package com.example.springsample.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springsample.common.util.WelcomeUtil;


@ManagedBean
@SessionScoped
public class HelloBean {
	@Autowired
	WelcomeUtil welcomeUtil;

	public HelloBean() {
		System.out.println("prionjj");
	}

	private String message;

	public WelcomeUtil getWelcomeUtil() {
		return welcomeUtil;
	}

	public void setWelcomeUtil(WelcomeUtil welcomeUtil) {
		this.welcomeUtil = welcomeUtil;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void hello() {
		setMessage(this.welcomeUtil.print());
	}

}
