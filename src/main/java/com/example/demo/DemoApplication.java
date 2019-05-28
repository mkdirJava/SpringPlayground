package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.CommandOne.CommandOne;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	@Qualifier("foo2")
	CommandOne commandOne;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HI HTER ");
		String[] beanNames = applicationContext.getBeanDefinitionNames();

        for (String beanName : beanNames) {

            System.out.println(beanName + " : " + applicationContext.getBean(beanName).getClass().toString());
        }
        
        commandOne.doThis();
        
	}
	
	@Bean(initMethod="start",destroyMethod="stop")
	public Mine mine() {
		return new Mine();
	}
	
	@Bean
	public Hooks hooks() {
		return new Hooks();
	}

}
