package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nt.document.Product;
import com.nt.repository.IProductRepository;

@Service
public class ProductMgmtService implements IProductMgmtService {

	@Autowired
	private IProductRepository productrepo;

	public String registerProduct(Product prod) {

		String id = productrepo.save(prod).getId();

		return "Product saved with id number : " + id;
	}

	@Override
	public List<Product> showAllProduct() {
		return productrepo.findAll();
	}

	@Override
	public Product showProductById(String id) {
		return productrepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
	}

	@Override
	public String updateProduct(String pid, float hikepercentage) {
		Product prod = productrepo.findById(pid).orElseThrow(() -> new IllegalArgumentException("Invalid id"));
		prod.setPrice(prod.getPrice() + prod.getPrice() * hikepercentage / 100.0f);
		productrepo.save(prod);
		return pid + " product details are update";
	}

	@Override
	public String registerProducts(List<Product> list) {
		List<Product> savedProds = productrepo.saveAll(list);
		List<String> ids = savedProds.stream().map(Product::getId).collect(Collectors.toList());
		return ids.size() + " no.of   docs are saved having id values ::" + ids;
	}

	@Override
	public String removeProducts(String name, String status) {
		Product prod = new Product();
		prod.setStatus("active");
		prod.setName("table");

		Example<Product> example = Example.of(prod);

		List<Product> list = productrepo.findAll(example);

		productrepo.deleteAll(list);
		return list.size() + " no.of docs  are deleted";

	}

}
