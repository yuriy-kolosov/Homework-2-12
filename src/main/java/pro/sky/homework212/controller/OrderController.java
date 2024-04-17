package pro.sky.homework212.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework212.service.BasketService;

import java.util.List;

//                                                      Домашнее задание 2-12. Spring
@RestController
@RequestMapping(path = "/order")
public class OrderController {

    private final BasketService basketService;

    public OrderController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String addItemsToBasket(@RequestParam("items") List<Integer> orderItems) {
        basketService.addItems(orderItems);
        return "Товары в корзину добавлены";
    }

    @GetMapping(path = "/get")
    public List<Integer> getItemsFromBasket() {
        return basketService.getItems();
    }

}
