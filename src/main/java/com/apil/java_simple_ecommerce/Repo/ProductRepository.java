package com.apil.java_simple_ecommerce.Repo;

import com.apil.java_simple_ecommerce.Modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
