package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String args[]) {
		FileSystemXmlApplicationContext ctx =new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj=ctx.getBean("wmg");
		WishMessageGenerator gen=(WishMessageGenerator)obj;
		
		String res=gen.showWishMessage("dinesh");
		System.out.println("result :"+res);
		String sea=gen.showSeason();
		System.out.println(sea);
		ctx.close();
		
	}
}
