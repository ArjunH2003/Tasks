package com.example;

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(1, "hello");
		hm.put('v', "hai");
		hm.put('A', 55);
		hm.put("", 32);
		System.out.println(hm);
		System.out.println(hm.remove(1));
		System.out.println(hm);
		
	}
	//Linked Hashmap,Tree Hashmap
	

}
