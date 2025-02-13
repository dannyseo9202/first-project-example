package edu.sparta.project.oms.order.application;

import edu.sparta.project.oms.common.client.ProductClient;
import edu.sparta.project.oms.order.application.dtos.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final ProductClient productClient;

    public String createOrder(OrderRequest.Create request) {
        System.out.println("request = " + request.getValue());
        System.out.println("오더 생성을 위해 상품을 땡겨와 봅시다 !! :) ~ " + productClient.getProducts());
        return "createOrder() has been called!";
    }
}
