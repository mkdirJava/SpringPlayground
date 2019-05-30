package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AspectObject {
	
	public void doSomthing() {
		System.out.println("DO SOMTHING");
	}
	
	public void doMore(String message) {
		System.out.println("DO MORE");
	}
	
	public void doEvenMore(String message,String messageTwo) {
		System.out.println("DO EVEN MORE");
	}
}
