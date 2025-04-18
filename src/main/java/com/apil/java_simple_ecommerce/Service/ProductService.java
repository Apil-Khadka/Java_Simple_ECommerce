package com.apil.java_simple_ecommerce.Service;

import com.apil.java_simple_ecommerce.Modal.Product;
import com.apil.java_simple_ecommerce.Repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }
    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
    public Product updateProduct(int id, Product product) {
        if (productRepo.existsById(id)) {
            product.setId(id);
            return productRepo.save(product);
        }
        return null;
    }
    public String deleteProduct(int id) {
        productRepo.deleteById(id);
        return "Product with ID " + id + " deleted successfully.";
    }
}
