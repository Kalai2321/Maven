package com.jav;

import java.util.ArrayList;
import java.util.List;

public class UserListDemo {
	public static void main(String[] args) {

		List<PojoDemo> l = new ArrayList<>();

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

		// print both Names

		System.out.println(l.get(0).getName());
		System.out.println(l.get(1).getName());

		// Print all List
		/*
		 * for (int i = 0; i < l.size(); i++) { System.out.println(l.get(i).getId());
		 * System.out.println(l.get(i).getName());
		 * System.out.println(l.get(i).getSalary());
		 * System.out.println(l.get(i).getMobile()); }
		 */

		for (PojoDemo po : l) {
			System.out.println(po.getId());
			System.out.println(po.getName());
			System.out.println(po.getSalary());
			System.out.println(po.getMobile());
		}
	}

}
