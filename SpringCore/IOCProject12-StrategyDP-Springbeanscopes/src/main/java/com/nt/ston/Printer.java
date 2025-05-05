package com.nt.ston;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("prnt")
@Lazy(true)
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
