package com.jav;

import com.AccSpecifiersDemo;

public class SuperDemo extends ThisDemo {
	public SuperDemo() {
		super(78);
		System.out.println("Child Constructor");
	}
public static void main(String[] args) {
	SuperDemo s = new SuperDemo();
	AccSpecifiersDemo e = new AccSpecifiersDemo();
	e.ten();
	
}
}
