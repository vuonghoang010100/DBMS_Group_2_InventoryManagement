package com.example.ims_dbms.services;

import com.example.ims_dbms.dtos.CategoryDTO;
import com.example.ims_dbms.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
