package com.nt.service;

import java.util.List;

import com.nt.document.Product;

public interface IProductMgmtService {
	public String registerProduct(Product prod);
	public List<Product> showAllProduct();
	public Product showProductById(String id);
	public String updateProduct(String pid,float hikepercentage);
	public   String   registerProducts(List<Product> list);
	public   String    removeProducts(String name ,String status);
}
