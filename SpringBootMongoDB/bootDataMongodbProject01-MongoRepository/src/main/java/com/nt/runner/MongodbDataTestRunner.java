package com.nt.runner;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Product;
import com.nt.service.IProductMgmtService;

@Component
public class MongodbDataTestRunner implements CommandLineRunner {

	@Autowired
	private IProductMgmtService productservice;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * try { Product prod = new Product(); prod.setName("milk");
		 * prod.setPrice(23.23f); prod.setQty(1.0f); prod.setCompany("Amul");
		 * prod.setExpiryDate(LocalDate.of(2025, 10,20)); String idval =
		 * productservice.registerProduct(prod); System.out.println(idval); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try { productservice.showAllProduct().forEach(System.out::println); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		System.out.println("-----------------------------------------------");
		/*
		 * try { Product prod =
		 * productservice.showProductById("68c94833353b23adc57cdc48");
		 * System.out.println(prod); } catch (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try { String upmsg = productservice.updateProduct("68c94833353b23adc57cdc48",
		 * 10.0f); System.out.println(upmsg); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		/*
		 * try { Product prod1 = new Product(); prod1.setName("table");
		 * prod1.setPrice(454455.0f); Product prod2 = new Product();
		 * prod2.setName("chair"); prod2.setPrice(1414155.0f); prod2.setQty(10.0f);
		 * String msg = productservice.registerProducts(List.of(prod1, prod2));
		 * System.out.println(msg); } catch (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * try { String msg=productservice.removeProducts("table", "active");
		 * System.out.println(msg); } catch(Exception e) { e.printStackTrace(); }
		 */
		
		try {
			Product prod=new Product();
			prod.setId(UUID.randomUUID().toString());
			prod.setName("milk"); prod.setPrice(100.0f); prod.setQty(5.0f); 
			prod.setCompany("Amul"); prod.setExpiryDate(LocalDate.of(2025, 10 ,20));
			String idVal=productservice.registerProduct(prod);
			System.out.println("Product is saved with id Value::"+idVal);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
