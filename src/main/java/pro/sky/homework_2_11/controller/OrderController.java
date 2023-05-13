package pro.sky.homework_2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_2_11.service.CardService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final CardService cardService;

    public OrderController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        this.cardService.addToCard(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return this.cardService.getCard();
    }
}

