package br.dev.spring.demo.auth.model.repository;

import br.dev.spring.demo.auth.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
