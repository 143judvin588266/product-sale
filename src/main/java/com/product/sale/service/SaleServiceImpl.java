package com.product.sale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.product.sale.Product;
import com.product.sale.repository.SaleRepository;

import jakarta.persistence.EntityNotFoundException;

@Service

public class SaleServiceImpl implements SaleService {
	@Autowired
	SaleRepository saleRepository;

	@Override
	public Product addProduct(Product product) {
		if (product != null) {
			return saleRepository.save(product);
		} else
			throw new NullPointerException();

	}    

	public Product updateProduct(int id, Product product) {
		if (product != null) {
			Product old = saleRepository.findById(id).orElse(null);
			old.setId(product.getId());
			old.setDescription(product.getDescription());
			old.setName(product.getName());
			old.setPrice(product.getPrice());
			saleRepository.save(old);
			return old;
		} else
			throw new NullPointerException();
	}

	public void deleteProduct(int id) {
		try {
			saleRepository.deleteById(id);
		} catch (Exception e) {
			throw new EntityNotFoundException();
		}
	}

	public List<Product> getProduct() {
		try {
			return saleRepository.findAll();
		} catch (Exception e) {
			throw new EntityNotFoundException();
		}
	}

	public Product getProductById(int id) {
try {
		return saleRepository.findById(id).orElse(null);
	}
catch(Exception e)
{
	throw new EntityNotFoundException();
}
	}

}
