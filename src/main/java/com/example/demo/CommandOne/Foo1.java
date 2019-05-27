package com.example.demo.CommandOne;

import org.springframework.stereotype.Component;

@Component
public class Foo1 implements CommandOne{

	@Override
	public void doThis() {
		System.out.println("This is from Foo 1");
	}

}
