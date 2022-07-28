package kg.itacademy.OnlineOrderUser.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")
@Getter
@Setter
public class Delivery {

    @Id
    private Long id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "schedule_time")
    private String scheduleTime;

    @Column(name = "order_address")
    private String orderAddress;
}
