package pro.sky.homework_2_11.service;

import org.springframework.stereotype.Service;
import pro.sky.homework_2_11.model.Basket;

import java.util.List;

@Service
public class CardService {

    private final Basket basket;

    public CardService(Basket basketRepository) {
        this.basket = basketRepository;
    }

    public void addToCard(List<Integer> ids) {
        this.basket.addToCard(ids);
    }

    public List<Integer> getCard() {
        return this.basket.getCard();
    }
}
