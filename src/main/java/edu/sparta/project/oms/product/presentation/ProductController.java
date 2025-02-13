package edu.sparta.project.oms.product.presentation;

import edu.sparta.project.oms.product.application.dtos.ProductCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<?> getProducts() {
        return ResponseEntity.ok("getProducts() has been called!!");
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductCreateRequest request) {
        System.out.println("request.value() = " + request.value());
        return ResponseEntity.ok(request.value());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable("id") String id) {
        return ResponseEntity.ok("getProduct(%s) has been called!!".formatted(id));
    }
}
