package kg.itacademy.OnlineOrderUser.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuModel {

    private Long id;

    private String nameFood;

    private int price;

    private FilialModel filialModel;

}
