package pro.sky.homework_2_11.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@Component
@SessionScope
public class Basket {
    private final List<Integer> idList = new ArrayList<>();

    public void addToCard(List<Integer> ids) {
        this.idList.addAll(ids);
    }

    public List<Integer> getCard() {
        return this.idList;
    }
}
