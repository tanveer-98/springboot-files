package com.tanveer.spring.springorm.product.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;


//make sure the version of hibernate is hibernate5 
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tanveer.spring.springorm.product.dao.ProductDao;
import com.tanveer.spring.springorm.product.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer saveResult = (Integer) hibernateTemplate.save(product);
		return saveResult;
	}

}
