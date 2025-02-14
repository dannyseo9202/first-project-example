package edu.sparta.project.oms.product.application;

import edu.sparta.project.oms.product.application.exception.ProductException;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void test() {
        throw new ProductException.NotFound();
    }
}
