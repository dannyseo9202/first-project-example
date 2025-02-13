package edu.sparta.project.oms.common.client;

import edu.sparta.project.oms.common.dtos.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class ProductClient {

    private final WebClient webClient;
    private static final String PRODUCTS_URI = "/products";

    public String getProducts() {
        return webClient.get()
                .uri(PRODUCTS_URI)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // 동기 호출
    }

    public String createProduct(ProductRequest.Create request) {
        return webClient.post()
                .uri(PRODUCTS_URI)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // 동기 호출
    }
}
