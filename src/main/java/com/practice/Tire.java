package com.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tire implements Parts {
	public void Start() {
		System.out.println("Tire is rotating");
	}
}
