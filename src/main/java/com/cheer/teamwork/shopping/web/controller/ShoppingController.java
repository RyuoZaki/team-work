package com.cheer.teamwork.shopping.web.controller;

import com.cheer.teamwork.shopping.model.Shopping;
import com.cheer.teamwork.shopping.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("insert")
    public void insert(Shopping shopping){
        shoppingService.insert(shopping);
    }

    @GetMapping("delete")
    public void delete(Shopping shopping){
        shoppingService.delete(shopping);
    }

    @GetMapping("update")
    public void update(Shopping shopping){
        shoppingService.update(shopping);
    }

    @GetMapping("getShoppingList/{id}")
    public List<Shopping> getShoppingList(@PathVariable Integer id){
        return shoppingService.getShoppingList(id);
    }
}
