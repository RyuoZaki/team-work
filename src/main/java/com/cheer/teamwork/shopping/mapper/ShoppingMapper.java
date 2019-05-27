package com.cheer.teamwork.shopping.mapper;

import com.cheer.teamwork.shopping.model.Shopping;

import java.util.List;

public interface ShoppingMapper {
    void insert(Shopping shopping);

    void delete(Shopping shopping);

    void update(Shopping shopping);

    List<Shopping> getShoppingList(Integer id);
}
