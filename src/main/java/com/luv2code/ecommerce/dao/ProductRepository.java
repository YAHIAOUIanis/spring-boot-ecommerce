package com.luv2code.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")

//Wildcard (any website)
//@CrossOrigin

//Multiple
//@CrossOrigin({"http://localhost:4200", "http://www.mycoolap.com"})	
public interface ProductRepository extends JpaRepository<Product, Long> {	

	Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

	// on peut donner notre propre requete	
	/*
	 @Query("select p from Product p where lower(p.name) like lower(concat('%', :searchText, '%))" + 
			"or lower(p.description) like lower(concat('%', :searchText, '%'))")
	 Page<Product> doMyCustomFancyStuff(@RequestParam("searchText") String searchText, Pageable pageable);
	 */

}
