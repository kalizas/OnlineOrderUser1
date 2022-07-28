package kg.itacademy.OnlineOrderUser.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "filial")
@Getter
@Setter
public class Filial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "address")
    private String address;
}
