package com.app.java.oops;

public class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	public void displayName() {
		System.out.println("Student name is: " + name);
	}

	public static void main(String[] args) {
		Student myCar = new Student("Toyota");
		myCar.displayName();
	}
}
