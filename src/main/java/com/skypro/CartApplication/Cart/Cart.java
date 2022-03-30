package com.skypro.CartApplication.Cart;



import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<Integer>();
    }
    public List<Integer> addItems(List<Integer> idsList) {
        items.addAll(idsList);
        return idsList;
    }

    public List<Integer> getItems() {
        return new ArrayList<Integer>(items);
    }
}
