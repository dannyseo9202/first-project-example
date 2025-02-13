package edu.sparta.project.oms.common.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class StoreClient {
    private final WebClient webClient;
}
