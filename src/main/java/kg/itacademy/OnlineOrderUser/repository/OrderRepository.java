package kg.itacademy.OnlineOrderUser.repository;

import kg.itacademy.OnlineOrderUser.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
