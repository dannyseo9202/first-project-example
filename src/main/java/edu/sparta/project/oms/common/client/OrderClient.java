package edu.sparta.project.oms.common.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class OrderClient {

    private final WebClient webClient;
    private static final String ORDERS_URI = "/orders";

    public String getOrders() {
        return webClient.get()
                .uri(ORDERS_URI)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // 동기 호출
    }
}
