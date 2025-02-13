package edu.sparta.project.oms.common.dtos;

import lombok.Value;

public class ProductRequest {
    @Value
    public static class Create{
        String value;
    }
}
