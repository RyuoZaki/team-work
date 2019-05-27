package com.cheer.teamwork.category.web.controller;

import com.cheer.teamwork.category.model.Category;
import com.cheer.teamwork.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategory/{categoryNo}")
    public Category getCategory(@PathVariable Integer categoryNo) {return categoryService.getCategory(categoryNo);}

    @GetMapping("/getList")
    public List<Category> getList() { return categoryService.getList();}

}
