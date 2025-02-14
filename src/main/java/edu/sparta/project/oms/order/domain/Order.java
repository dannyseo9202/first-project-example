package edu.sparta.project.oms.order.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Order {
    private static final int MAX_ORDER_ITEMS = 10;

    @Id
    private Long id;

    @OneToMany
    private List<OrderItem> orderItems;

    public Order(Long id, List<OrderItem> orderItems) {
        validateOrderItems(orderItems);
        this.id = id;
        this.orderItems = orderItems;
    }

    public void validateOrderItems(List<OrderItem> orderItems) {
        if (orderItems == null || orderItems.isEmpty()) {
            throw new IllegalArgumentException("주문 항목은 비어 있을 수 없습니다.");
        }
        if (orderItems.size() > MAX_ORDER_ITEMS) {
            throw new IllegalArgumentException("주문 상품 수가 " + MAX_ORDER_ITEMS + "개를 초과하였습니다.");
        }
    }
}
