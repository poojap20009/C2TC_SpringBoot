package com.cg.College;

public class Student {
	private String name;
	private int id;
	
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	void display(){
		System.out.println("My name is " + name);
		System.out.println("My ID is " + id);
		
		
	}

}
