package com.product.sale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.sale.Product;
import com.product.sale.service.SaleService;

@RestController
@RequestMapping("/product")
public class SaleController {
	@Autowired
	private SaleService saleService;

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return saleService.addProduct(product);

	}

	@GetMapping("/get")
	public List<Product> getProduct() { 
		return saleService.getProduct();
	}
 
	@GetMapping("/getById/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return saleService.getProductById(id);

	}

	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
		return saleService.updateProduct(id, product);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable( "id") int id) {
		saleService.deleteProduct(id);
return new ResponseEntity<String>("Product deleted Successfully",HttpStatus.OK);
	}
}
