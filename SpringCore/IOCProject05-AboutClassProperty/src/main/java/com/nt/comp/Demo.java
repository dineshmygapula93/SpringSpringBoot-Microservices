package com.nt.comp;

public class Demo {
	private int a;
	private int b;
	
	public Demo() {
		System.out.println("Demo.Demo()");
	}
	
	public Demo(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Demo.Demo() -para");
	}
	
	public int m1() {
		return 100;
	}
}
