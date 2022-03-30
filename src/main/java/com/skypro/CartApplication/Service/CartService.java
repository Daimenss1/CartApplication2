package com.skypro.CartApplication.Service;


import java.util.List;

public interface CartService {

    List<Integer> addItems(List<Integer> items);

    List<Integer> getItems();
}
