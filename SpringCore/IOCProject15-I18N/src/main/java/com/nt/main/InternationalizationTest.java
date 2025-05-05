package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;

public class InternationalizationTest {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the language code");
		String language=sc.next();
		System.out.println("please enter the Country code");
		String country=sc.next();
		
		Locale loc=new Locale(language,country);
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		
		String message=ctx.getMessage("welcome.msg",new String[] {},loc );
		String message1=ctx.getMessage("about.msg",new String[] {},loc );
		String message2=ctx.getMessage("wish.msg",new String[] {},loc );
		
		System.out.println(message);
		System.out.println(message1);
		System.out.println(message2);
		ctx.close();
	}
}
