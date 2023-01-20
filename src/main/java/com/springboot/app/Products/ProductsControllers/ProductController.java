package com.springboot.app.Products.ProductsControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Products.ProductsModels.Products;
import com.springboot.app.Products.ProductsServices.ProductsService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductsService pservice;
	
	@GetMapping("/products")
	public List<Products> get(){
		return pservice.get();
	}
	
	@PostMapping("/products")
	public Products save(@RequestBody Products product) {
		pservice.save(product);
		return product;
	}
	
	@GetMapping("/products/{id}")
	public Products get(@PathVariable int id) {
		return pservice.get(id);
	}
	
	@DeleteMapping("/products/{id}")
	public String delete(@PathVariable int id) {
		pservice.delete(id);
		return "Product Id "+id+" Deleted";
	}
	
	
	@PutMapping("/products")
	public Products UPDATE(@RequestBody Products product) {
		pservice.save(product);
		return product;
	}
	
	
	
}
