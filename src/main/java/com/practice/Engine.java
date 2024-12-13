package com.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Engine implements Parts {
	public void Start() {
		System.out.println("Engine Start");
	}
}
