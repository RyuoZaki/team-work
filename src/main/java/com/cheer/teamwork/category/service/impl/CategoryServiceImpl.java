package com.cheer.teamwork.category.service.impl;

import com.cheer.teamwork.category.mapper.CategoryMapper;
import com.cheer.teamwork.category.model.Category;
import com.cheer.teamwork.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category getCategory(Integer categoryNo) { return categoryMapper.getCategory(categoryNo);}

    @Override
    public List<Category> getList() { return categoryMapper.getList();}

    @Override
    public void insert(Category category) { categoryMapper.insert(category);}

    @Override
    public void delete(Integer categoryNo) {categoryMapper.delete(categoryNo);}

    @Override
    public void update(Category category) {categoryMapper.update(category);}

}
