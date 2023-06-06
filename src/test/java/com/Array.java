package com;

public class Array {
	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("For Loop");
		// For Loop
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		// foreach Loop
		System.out.println("Advanced For Loop");
		for (int b : a) {
			System.out.println(b);
		}
// To find length of an array
		System.out.println("Length of the Array");
		int len = a.length;
		System.out.println(len);
		//to fetch any value of index
		System.out.println("Aray Value");
		System.out.println(a[2]);
		
		AccSpecifiersDemo i = new AccSpecifiersDemo();
		i.seventeen();
	}
}
