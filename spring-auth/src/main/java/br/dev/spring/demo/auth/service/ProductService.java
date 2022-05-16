package br.dev.spring.demo.auth.service;

import br.dev.spring.demo.auth.model.Product;
import br.dev.spring.demo.auth.model.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
