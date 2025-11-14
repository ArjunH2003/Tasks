package com.example;

public class Calculator {
	
	private CalculatorService cserv;
	public Calculator(CalculatorService cserv) {
		
		this.cserv=cserv;
	}
	
	public void addOperation(int x,int y) {
		
		//return cserv.add(x,y);
		
		int z = cserv.add(x,y);
		
		return;
	}

}
