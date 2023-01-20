package com.springboot.app.Products.ProductsServices;

import java.util.List;

import com.springboot.app.Products.ProductsModels.Products;

public interface ProductsService {
	List<Products> get();
	Products get(int id);
	void save(Products product);
	void delete(int id);
}
