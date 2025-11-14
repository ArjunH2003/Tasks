package com.example;

import java.util.Arrays;
import java.util.List;

public class ListDEmo {
	
	public static void display(String n){
	
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(33,11,55,5);
		l.forEach(System.out::println);
		
		String names[] = {"Jonas","Martha","Micheal","Elizabeth"};
		
		Arrays.stream(names).forEach(ListDEmo::display);
		
	}

}
