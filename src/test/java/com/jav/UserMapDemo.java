package com.jav;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserMapDemo {
public static void main(String[] args) {
	
	Map<Integer, PojoDemo> m = new HashMap<Integer, PojoDemo>();
	
	PojoDemo p1 = new PojoDemo();
	p1.setId(200);
	p1.setMobile(98565);
	p1.setName("Kalai");
	p1.setSalary(25132.210);
	
	PojoDemo p2 = new PojoDemo();
	p2.setId(300);
	p2.setMobile(98585);
	p2.setName("Shiva");
	p2.setSalary(26832.210);

	m.put(50, p1);
	m.put(70, p2);
	
	Set<Entry<Integer, PojoDemo>> e = m.entrySet();	
	
	for (Entry<Integer, PojoDemo> m1 : e) {
		System.out.println(m1.getKey());
		System.out.println(m1.getValue().getId());
		System.out.println(m1.getValue().getMobile());
		System.out.println(m1.getValue().getName());
		System.out.println(m1.getValue().getSalary());
	}
}
}
