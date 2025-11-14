package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.*;

public class MockitoTesting {
	
	CalculatorService cserv = Mockito.mock(CalculatorService.class);
	Calculator c = new Calculator(cserv);
	
	@Test
	
	public void test1() {
		
		//assertEquals(25,c.addOperation(12,13));
	}



}
