package com.cheer.teamwork.shopping.service;

import com.cheer.teamwork.shopping.model.Shopping;

import java.util.List;

public interface ShoppingService {
    void insert(Shopping shopping);

    void delete(Shopping shopping);

    void update(Shopping shopping);

    List<Shopping> getShoppingList(Integer id);
}
