package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")

//Wildcard (any website)
//@CrossOrigin

//Multiple
//@CrossOrigin({"http://localhost:4200", "http://www.mycoolap.com"})	
public interface ProductRepository extends JpaRepository<Product, Long> {

}
