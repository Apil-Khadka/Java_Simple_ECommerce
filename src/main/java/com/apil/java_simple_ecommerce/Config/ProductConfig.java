package com.apil.java_simple_ecommerce.Config;

import com.apil.java_simple_ecommerce.Modal.Product;
import com.apil.java_simple_ecommerce.Repo.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductConfig {

    @Bean
    CommandLineRunner init(ProductRepository productRepository) {
        return args -> {

            Product product1 = new Product("Product 1", "Description 1", "Brand A", 19.99f, "Category X", new java.util.Date(), true, 100);
            Product product2 = new Product("Product 2", "Description 2", "Brand B", 29.99f, "Category Y", new java.util.Date(), true, 200);
            Product product3 = new Product("Product 3", "Description 3", "Brand C", 39.99f, "Category Z", new java.util.Date(), true, 300);

            productRepository.saveAll(List.of(product1, product2, product3));
        };
    }
}
