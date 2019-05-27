package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Mine implements InitializingBean, DisposableBean{
	
	private String name;
	private Integer age;
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void start() {
		System.out.println("THis is an init method");
	}
	
	public void stop() {
		System.out.println("This is the destroy mehtod");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("This is the destroyBean");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is the Init Bean");
		
	}
	
	@PostConstruct
	public void annoStarer() {
		System.out.println("This is the annoStarter");
	}
	
	@PreDestroy
	public void annoStopper() {
		System.out.println("This is the annoStoppper");
	}

}
