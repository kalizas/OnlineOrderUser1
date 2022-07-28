package kg.itacademy.OnlineOrderUser.service;

import kg.itacademy.OnlineOrderUser.model.MenuModel;
import kg.itacademy.OnlineOrderUser.model.OrderModel;

public interface UserService {

    MenuModel addNewFood(MenuModel menuModel);

    OrderModel getOrderById(Long id);



    void deleteFoodById(Long id);
}
