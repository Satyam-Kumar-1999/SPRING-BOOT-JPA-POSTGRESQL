package com.springboot.app.Products.ProductsDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.app.Products.ProductsModels.Products;

import jakarta.persistence.EntityManager;

@Repository
public class ProductDAOImplementation implements ProductDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Products> get() {
		Session session = entityManager.unwrap(Session.class);
		Query<Products> query = session.createQuery("from Products",Products.class);
		List<Products> list = query.getResultList();
		return list;
		
	}

	@Override
	public Products get(int id) {
		 Session session = entityManager.unwrap(Session.class);
		 Products products = session.get(Products.class, id);
		 return products;
		 
	}

	@Override
	public void save(Products product) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(product);
		
	}

	 
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Products product = session.get(Products.class, id);
		session.remove(product);
		
		
	}

}
