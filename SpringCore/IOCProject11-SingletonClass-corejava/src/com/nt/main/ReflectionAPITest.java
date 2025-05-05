package com.nt.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.ston.Printer;

public class ReflectionAPITest {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class c1=Printer.class;
		
		Constructor cons[]=c1.getDeclaredConstructors();
		
		cons[0].setAccessible(true);
		
    	Object obj=cons[0].newInstance();
    	
    	Printer pr=(Printer) obj;
    	
    	System.out.println("ReflectionAPITest.main()");
    	pr.printdata("Dinesh");
	}
}
