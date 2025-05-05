package com.nt.main;

import org.springframework.beans.BeansException;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String args[]) {
		try {
			FileSystemXmlApplicationContext ctx =new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
			Object obj=ctx.getBean("sf");
			SeasonFinder gen=(SeasonFinder)obj;

			String sea=gen.showSeason();
			System.out.println(sea);
			ctx.close();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
