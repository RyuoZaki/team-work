package com.cheer.teamwork.category.service;

import com.cheer.teamwork.category.model.Category;

import java.util.List;

public interface CategoryService {
    Category getCategory(Integer categoryNo);

    List<Category> getList();

    void insert(Category category);

    void delete(Integer categoryNo);

    void update(Category category);

}
