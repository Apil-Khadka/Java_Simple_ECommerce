package com.apil.java_simple_ecommerce.Controller;

import com.apil.java_simple_ecommerce.Modal.Product;
import com.apil.java_simple_ecommerce.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping( "/products/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        System.out.println(product);
        return productService.addProduct(product);
    }
    @PatchMapping("/products/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
