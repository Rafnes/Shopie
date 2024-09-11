package pro.sky.Shopie.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.Shopie.exceptions.InvalidItemIdException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SessionScope
@Service
public class CartService {
    private List<Integer> cart = new ArrayList<>();

    public List<Integer> add(Integer... items) {
        for (Integer item : items) {
            if (item <= 0) {
                throw new InvalidItemIdException();
            }
            cart.add(item);
        }
        return Arrays.asList(items);
    }

    public List<Integer> get() {
        return cart;
    }
}
