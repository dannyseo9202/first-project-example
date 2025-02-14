package edu.sparta.project.oms.order.application;

import edu.sparta.project.oms.common.client.ProductClient;
import edu.sparta.project.oms.order.application.dtos.OrderRequest;
import edu.sparta.project.oms.order.application.exceptions.OrderException;
import edu.sparta.project.oms.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final ProductClient productClient;

    public String createOrder(OrderRequest.Create request) {
        System.out.println("오더 생성을 위해 상품을 땡겨와 봅시다 !! :) ~ " + productClient.getProducts());

        Order order = new Order(3L, List.of());
        return "createOrder() has been called!";
    }
}
