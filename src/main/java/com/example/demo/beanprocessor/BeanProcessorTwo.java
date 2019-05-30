package com.example.demo.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessorTwo  implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

//		System.out.println("BeforeInitialization :  STATIC " + beanName);
		return bean; // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

//		System.out.println("AfterInitialization : STATIC " + beanName);
		return bean; // you can return any other object as well
	}
}
