package pro.sky.homework212.service;

import org.springframework.stereotype.Service;
import pro.sky.homework212.model.Basket;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    public final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addItems(List<Integer> oItems) {

        basket.setSessionBasket(oItems);

    }

    @Override
    public List<Integer> getItems() {
        return basket.getSessionBasket();
    }

}
