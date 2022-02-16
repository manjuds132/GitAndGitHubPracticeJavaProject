package com.test;

public class Calculation {
	int result;
	public int calculation() {
		int a,b;
		a=10;
		b=5;
		result=(a+b)/a;
		return result;
	}
	
	public void displayCalculation() {
		System.out.println("Calculation Result = "+result);
	}

}
