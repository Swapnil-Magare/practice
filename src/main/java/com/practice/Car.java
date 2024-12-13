package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value(value = "BMW")
	String name;

	@Value(value = "100000000")
	int price;

	@Autowired
	@Qualifier(value = "engine")
	Parts parts;

	public void display() {
		System.out.println(name);
		System.out.println(price);
		parts.Start();
	}
}
