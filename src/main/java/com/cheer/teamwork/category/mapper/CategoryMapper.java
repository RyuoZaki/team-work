package com.cheer.teamwork.category.mapper;

import com.cheer.teamwork.category.model.Category;


import java.util.List;

public interface CategoryMapper {
    Category getCategory(Integer categoryNo);

    List<Category> getList();

    int insert(Category category);

    int delete(Integer categoryNo);

    int update(Category category);



}
