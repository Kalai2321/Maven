package com.jav;

import java.util.HashSet;
import java.util.Set;

public class UserSetDemo {
	public static void main(String[] args) {

		Set<PojoDemo> l = new HashSet<PojoDemo>();

		PojoDemo d1 = new PojoDemo();
		d1.setId(10);
		d1.setName("Kalai");
		d1.setSalary(21221.11);
		d1.setMobile(95006366);

		PojoDemo d2 = new PojoDemo();
		d2.setId(11);
		d2.setName("Shiva");
		d2.setSalary(21921.11);
		d2.setMobile(97006366);

		l.add(d1);
		l.add(d2);

		// print All Values and any one use only foreach loop, because SET does not use
		// index

		for (PojoDemo po : l) {
			System.out.println(po.getId());
			System.out.println(po.getName());
			System.out.println(po.getSalary());
			System.out.println(po.getMobile());
		}
	}

}
