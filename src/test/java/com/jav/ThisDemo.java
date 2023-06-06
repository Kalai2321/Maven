package com.jav;

import com.AccSpecifiersDemo;

public class ThisDemo extends AccSpecifiersDemo {

	public ThisDemo() {
		this("Java");
		System.out.println("Default Parent Constructor");
	}

	public ThisDemo(String name) {
		this(10);
		System.out.println("Name is " + name);
	}

	public ThisDemo(int i) {
		System.out.println(+i);
	}

	public static void main(String[] args) {
		ThisDemo d = new ThisDemo();
		AccSpecifiersDemo c = new AccSpecifiersDemo();
		c.ten();

	}
}
