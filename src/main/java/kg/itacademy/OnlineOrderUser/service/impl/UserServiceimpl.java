package kg.itacademy.OnlineOrderUser.service.impl;

import kg.itacademy.OnlineOrderUser.entity.Menu;
import kg.itacademy.OnlineOrderUser.entity.Order;
import kg.itacademy.OnlineOrderUser.exeption.NotFoundException;
import kg.itacademy.OnlineOrderUser.model.MenuModel;
import kg.itacademy.OnlineOrderUser.model.OrderModel;
import kg.itacademy.OnlineOrderUser.repository.MenuRepository;
import kg.itacademy.OnlineOrderUser.repository.OrderRepository;
import kg.itacademy.OnlineOrderUser.service.UserService;
import org.springframework.data.crossstore.ChangeSetPersister;

public class UserServiceimpl implements UserService {

    private final OrderRepository orderRepository;
    private final MenuRepository menuRepository;

    public UserServiceimpl(OrderRepository orderRepository, MenuRepository menuRepository) {
        this.orderRepository = orderRepository;
        this.menuRepository = menuRepository;
    }

    @Override
    public MenuModel addNewFood(MenuModel menuModel) {
        Menu menu = new Menu();
        menu.setFoodName(menuModel.getNameFood());
        menu.setPrice(menuModel.getPrice());
        menuRepository.save(menu);
        return menuModel;
    }

//    public List<ImageModelResponse> getAll(ImageModelResponse imageModelResponse) {
//        List<ImageModelResponse> imageModelResponses = new ArrayList<>();
//
//        imageRepository.findAll().forEach(x -> imageModelResponses.add(
//                ImageModelResponse.builder()
//                        .name(x.getNameFile())
//                        .path(x.getPathFile())
//                        .build()
//        ));
//        return imageModelResponses;
//    }

    @Override
    public OrderModel getOrderById(Long id) {
        Order order = orderRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Id: " + id + "не найден"));
        return null;
    }

    @Override
    public void deleteFoodById(Long id) {
        menuRepository.deleteById(id);
    }
}
