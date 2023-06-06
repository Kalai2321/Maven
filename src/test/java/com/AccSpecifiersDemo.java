package com;

import org.apache.poi.hssf.record.RightMarginRecord;

public class AccSpecifiersDemo {

	private void demo() {
		System.out.println("private");
	}

	public void ten() {
		System.out.println("public");
	}

	protected void eleven() {
		System.out.println("Protected");
	}

	void seventeen() {
		System.out.println("default");
	}

	public static void main(String[] args) {
		
	AccSpecifiersDemo i = new AccSpecifiersDemo();
	 i.demo();
	}
	
}
