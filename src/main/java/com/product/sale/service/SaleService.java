package com.product.sale.service;




import java.util.List;

import com.product.sale.Product;
public interface SaleService {

	public Product addProduct(Product product);

	public List<Product> getProduct();
	
	public Product getProductById(int id);
	public Product updateProduct(int id, Product product);

	public void deleteProduct(int id);
	
}
   