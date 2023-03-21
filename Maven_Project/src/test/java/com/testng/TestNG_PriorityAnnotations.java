package com.testng;

import org.testng.annotations.Test;

public class TestNG_PriorityAnnotations {
	
	@Test(priority = -10)
	public void Tamil() {
		System.out.println("Tamil mark: 85");	
	}
	
	@Test(priority = 11)
	public void English() {
		System.out.println("English mark: 90");
	}
	
	@Test(priority = 20)
	public void Maths() {
		System.out.println("Maths mark: 100");
	}

}
