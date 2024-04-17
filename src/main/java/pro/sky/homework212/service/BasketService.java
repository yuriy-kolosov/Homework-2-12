package pro.sky.homework212.service;

import java.util.List;

public interface BasketService {

    void addItems(List<Integer> oItems);

    List<Integer> getItems();

}
