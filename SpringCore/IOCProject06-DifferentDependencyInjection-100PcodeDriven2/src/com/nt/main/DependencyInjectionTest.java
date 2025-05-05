package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekFinder;

public class DependencyInjectionTest {
	public static void main(String args[]) {
		try {
			AnnotationConfigApplicationContext atx =new AnnotationConfigApplicationContext(AppConfig.class);
			Object obj=atx.getBean("wf");
			WeekFinder gen=(WeekFinder)obj;

			String wk=gen.showWeek();
			System.out.println(wk);
			atx.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
