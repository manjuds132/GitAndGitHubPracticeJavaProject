package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("This is setUp method...");
	}
	
	@Test
    public void login() {
		System.out.println("This is login method...");
	}
	
	@AfterSuite
    public void quit() {
		System.out.println("This is quit method...");
	}
}
