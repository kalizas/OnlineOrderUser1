package kg.itacademy.OnlineOrderUser.service.impl;

import kg.itacademy.OnlineOrderUser.entity.Menu;
import kg.itacademy.OnlineOrderUser.entity.Order;
import kg.itacademy.OnlineOrderUser.exeption.NotFoundException;
import kg.itacademy.OnlineOrderUser.model.MenuModel;
import kg.itacademy.OnlineOrderUser.model.OrderModel;
import kg.itacademy.OnlineOrderUser.repository.ImageRepository;
import kg.itacademy.OnlineOrderUser.repository.MenuRepository;
import kg.itacademy.OnlineOrderUser.repository.OrderRepository;
import kg.itacademy.OnlineOrderUser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    private final OrderRepository orderRepository;
    private final MenuRepository menuRepository;
//    private final ImageRepository imageRepository;

    private final static String URL_PATH = "C:\\Users\\user\\Desktop";

    public UserServiceimpl(OrderRepository orderRepository, MenuRepository menuRepository, ImageRepository imageRepository) {
        this.orderRepository = orderRepository;
        this.menuRepository = menuRepository;
//        this.imageRepository = imageRepository;
    }

    @Override
    public MenuModel addNewFood(MenuModel menuModel) {
        Menu menu = new Menu();
        menu.setFoodName(menuModel.getNameFood());
        menu.setPrice(menuModel.getPrice());
        menu.setIngredients(menuModel.getIngredients());
        menuRepository.save(menu);
        return menuModel;
    }


//    public ImageModelResponse saveImage(ImageModelRequest imageModelRequest) {
//        Image image = null;
//
//        try {
//            File imageFile = new File(URL_PATH + imageModelRequest.getName() + ".png");
//            imageModelRequest.getFile().transferTo(imageFile);
//
//            image = imageRepository.save(Image.builder()
//                    .nameFile(imageFile.getName())
//                    .pathFile(imageFile.getName())
//                    .build());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ImageModelResponse.builder()
//                .name(image.getNameFile())
//                .path(image.getPathFile())
//                .build();
//    }
//
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
