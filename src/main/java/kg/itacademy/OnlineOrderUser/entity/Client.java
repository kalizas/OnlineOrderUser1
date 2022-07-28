package kg.itacademy.OnlineOrderUser.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "client")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
