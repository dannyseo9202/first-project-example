package edu.sparta.project.oms.order.presentation;

import edu.sparta.project.oms.order.application.OrderService;
import edu.sparta.project.oms.order.application.dtos.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<?> getOrders() {
        return ResponseEntity.ok("getOrders() has been called!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrder(@PathVariable("id") String id) {
        return ResponseEntity.ok("getOrder(id) has been called!");
    }

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest.Create request) {
        return ResponseEntity.ok(orderService.createOrder(request));
    }
}
