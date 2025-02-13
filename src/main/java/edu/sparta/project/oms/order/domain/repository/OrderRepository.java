package edu.sparta.project.oms.order.domain.repository;
import edu.sparta.project.oms.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
