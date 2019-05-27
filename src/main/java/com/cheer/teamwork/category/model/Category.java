package com.cheer.teamwork.category.model;

import java.util.StringJoiner;


public class Category {
    private Integer categoryNo;
    private String categoryName;

    public Integer getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(Integer categoryNo) {
        this.categoryNo = categoryNo;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Category.class.getSimpleName() + "[", "]")
                .add("categoryNo=" + categoryNo)
                .add("categoryName='" + categoryName + "'")
                .toString();
    }
}
