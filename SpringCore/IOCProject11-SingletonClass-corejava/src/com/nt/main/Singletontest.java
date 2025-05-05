package com.nt.main;

import com.nt.ston.Printer;

public class Singletontest {
	
	public static void main(String args []) {
		
		Printer pr=Printer.getObj();
		
		pr.printdata("Dinesh");
	}
}
