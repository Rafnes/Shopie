package pro.sky.Shopie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pro.sky.Shopie.service.CartService;

import java.util.List;

@RestController
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping()
    public String homePage() {
        return "Shopie Homepage";
    }

    @RequestMapping("/order/add")
    public List<Integer> addItems(@RequestParam(value = "IDs") Integer... items) {
        return cartService.add(items);
    }

    @RequestMapping("/order/get")
    public List<Integer> getItems() {
        return cartService.get();
    }
}
