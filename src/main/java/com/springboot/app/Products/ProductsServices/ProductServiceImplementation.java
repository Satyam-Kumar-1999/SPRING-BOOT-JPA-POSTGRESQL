package com.springboot.app.Products.ProductsServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.Products.ProductsDAO.ProductDAO;
import com.springboot.app.Products.ProductsModels.Products;


@Service
public class ProductServiceImplementation implements ProductsService {

	@Autowired
	private ProductDAO pdao;
	
	@Transactional
	@Override
	public List<Products> get() {
		return pdao.get();
	}

	@Transactional
	@Override
	public Products get(int id) {
		return  pdao.get(id);
		 
	}

	@Transactional
	@Override
	public void save(Products product) {
		pdao.save(product);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pdao.delete(id);
		
	}

}
