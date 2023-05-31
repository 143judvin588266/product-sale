package com.product.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.product.sale.Product;

public interface SaleRepository extends JpaRepository<Product, Integer>,PagingAndSortingRepository<Product, Integer> {

}
   