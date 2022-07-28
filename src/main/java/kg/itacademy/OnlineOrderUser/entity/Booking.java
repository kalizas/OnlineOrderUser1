package kg.itacademy.OnlineOrderUser.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
@Getter
@Setter
public class Booking {

    @Id
    private Long id;

    @Column(name = "table_number")
    private String tableNumder;
}
