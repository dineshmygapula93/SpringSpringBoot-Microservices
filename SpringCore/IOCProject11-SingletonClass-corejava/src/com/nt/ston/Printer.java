package com.nt.ston;

public class Printer {
	
	private static Printer Instance;
	
	private Printer() {
		System.out.println("Printer.Printer() :: 0-param Constructor");
	}
	
	
	public static Printer getObj() {
		
		if(Instance==null) {
			Instance = new Printer();
		}
		return Instance;
	}
	
	public void printdata(String user) {
		System.out.println("Printer.printdata()");
		System.out.println("hello "+user);
	}
}
