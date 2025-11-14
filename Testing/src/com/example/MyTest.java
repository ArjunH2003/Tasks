package com.example;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyTest {
	
	Calc c = new Calc();
	
	@Before
	
	public void beforetest1() {
		
		System.out.println("Task before test1()");
	}
	
	@Test
	
	public void test1() {
		
		assertEquals(28,c.add(12, 16));
		
	}
//	@After
//	
//
//	public void aftertest1() {
//		
//		System.out.println("Task after test1()");
//	}
//	
	
	@AfterClass
	

	public static void aftertest1() {
		
		System.out.println("Task after test1()");
	}
	
	
	
	@Test
	
public void test2() {
		
		assertEquals(216,c.cube(6));
		
	}
	

}
