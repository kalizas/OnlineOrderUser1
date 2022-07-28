package kg.itacademy.OnlineOrderUser.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "menu")
@Getter
@Setter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "filial_id")
    private Filial filial;
}
