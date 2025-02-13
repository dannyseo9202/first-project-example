package edu.sparta.project.oms.product.domain.repository;

import edu.sparta.project.oms.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
