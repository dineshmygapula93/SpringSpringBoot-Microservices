package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Product;
import com.nt.repository.IProductRepository;

@Component
public class MongodbDataTestRunner implements CommandLineRunner {

	@Autowired
	private IProductRepository productrepo;

	@Override
	public void run(String... args) throws Exception {

		try {
			List<Product> list = productrepo.findByPriceBetween(100.0f, 10000.00f);
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			//productrepo.showProductsDataByName("table").forEach(row->System.out.println(Arrays.toString(row)));
			//productrepo.showProductsByName("table").forEach(System.out::println);
			//productrepo.showProductsByNameAndStatus("table", "active").forEach(System.out::println);
			//productrepo.showProductsDataPriceRange(100.0f, 2000000.0f).forEach(row->System.out.println(Arrays.toString(row)));
			//productrepo.showProductsDataByNameOrCompany("table","Amul").forEach(row->System.out.println(Arrays.toString(row)));
			//productrepo.showProductsByNames(List.of("table","chair")).forEach(System.out::println);
			  productrepo.showProductsByNameChars("t").forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
