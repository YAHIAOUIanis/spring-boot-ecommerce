package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.ecommerce.entity.ProductCategory;

@CrossOrigin("http://localhost:4200")

//Wildcard (any website)
//@CrossOrigin

//Multiple
//@CrossOrigin({"http://localhost:4200", "http://www.mycoolap.com"})	

//productCategory is name of JSON entry
//product-category is path of api/product-category
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
