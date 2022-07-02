package com.chainsys.springproject.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// import org.springframework.beans.factory.config.BeanPostProcessor;  // refer AOP
public class InitDesposeBean implements DisposableBean,InitializingBean{
	private String city;
	private long pinCode;
	// Called after setters
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method called");
	}
  
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called");
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public InitDesposeBean() {
		System.out.println("InitDeposeBean Object Created");
	}
	// After constructor
	public void setUp() {
		System.out.println("Starting...");
	}
	public void close() {
		System.out.println("Closing...");
	}
	public void print() {
		System.out.println("Print method called");
	}
}
