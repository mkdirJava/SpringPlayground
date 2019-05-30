package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectOne {
	
	@Before("execution(* com.example.demo.*.*(..))")
	public void before() {
		System.out.println("BEFORE THE CALL");
	}
	
	@After("execution(* com.example.demo.*.*(..))")
	public void after() {
		System.out.println("After the call");
	}
	
//	@AfterReturning("execution(* com.example.demo.*.*(..))")
	public void afterReturning() {
		
	}

//	@Around("execution(* com.example.demo.*.*(..))")
	public void around() {
		
	}

//	@AfterThrowing("execution(* com.example.demo.*.*(..))")
	public void afterThrowing() {
		
	}
	
}
