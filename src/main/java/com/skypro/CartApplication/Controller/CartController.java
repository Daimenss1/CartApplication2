package com.skypro.CartApplication.Controller;

import com.skypro.CartApplication.Service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/addItems")
    public List<Integer> addItems(@RequestParam List<Integer> idList) {
        return cartService.addItems(idList);
    }

    @RequestMapping("/getItems")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
