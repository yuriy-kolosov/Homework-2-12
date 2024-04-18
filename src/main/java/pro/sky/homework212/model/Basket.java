package pro.sky.homework212.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> sessionBasket;

    public Basket(List<Integer> sessionBasket) {
        this.sessionBasket = sessionBasket;
    }

    public List<Integer> getSessionBasket() {
        return sessionBasket;
    }

    public void setSessionBasket(List<Integer> sessionBasket) {
        this.sessionBasket.addAll(sessionBasket);
    }

}
