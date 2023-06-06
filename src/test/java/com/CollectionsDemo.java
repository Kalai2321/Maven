package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	
public static void main(String[] args) {
	
	//Collection - INterface - Use list 
	List l	= new ArrayList();
	l.add("java");
	l.add("test");
	l.add("JAVA");
	
	System.out.println(l);
	
	//Collections - Class
	Collections.addAll(l, "Night");
	Collections.sort(l);
	//Collections.replaceAll(l, "test", "Lavel");
	System.out.println(l);
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
