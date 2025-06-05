package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class PagingAndSortingRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService actorservice;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Iterable<Actor> list=actorservice.showActorsSorted(true,"fee","Category");
//			
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			Page<Actor> page=actorservice.showActorsByPageNo(2, 5);
//			System.out.println(page.getNumber()+1+"/"+page.getTotalPages()+"records are");
//			
//			Iterable<Actor> list=page.getContent();
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			Page<Actor> page = actorservice.showActorsByPageNoAsSorted(0, 5, true, "Category");
//			System.out.println(page.getNumber() + 1 + "/" + page.getTotalPages() + "records are");
//
//			Iterable<Actor> list = page.getContent();
//			list.forEach(System.out::println);
//			System.out.println("===============More Information About Current Page============");
//			System.out.println("is thi first page ::" + page.isFirst());
//			System.out.println("is thi Last page ::" + page.isLast());
//			System.out.println("Records count in this page " + page.getNumberOfElements());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			actorservice.showActorsDateByPagination(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
