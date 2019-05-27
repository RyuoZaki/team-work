package com.cheer.teamwork.shopping.service.impl;

import com.cheer.teamwork.shopping.mapper.ShoppingMapper;
import com.cheer.teamwork.shopping.model.Shopping;
import com.cheer.teamwork.shopping.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Autowired
    private ShoppingMapper shoppingMapper;

    @Override
    public void insert(Shopping shopping) {
        shoppingMapper.insert(shopping);
    }

    @Override
    public void delete(Shopping shopping) {
        shoppingMapper.delete(shopping);
    }

    @Override
    public void update(Shopping shopping) {
        shoppingMapper.update(shopping);
    }

    @Override
    public List<Shopping> getShoppingList(Integer id) {
        return shoppingMapper.getShoppingList(id);
    }
}
