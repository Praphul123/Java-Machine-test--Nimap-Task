package com.product.dbHelper;

import com.product.model.Category;
import com.product.repositry.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryDbHelper {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category addDataIntoCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllProduct(Integer page) {
        Pageable pageable = PageRequest.of(0, page);
        Page<Category> categoryPage = categoryRepository.findAll(pageable);
        return categoryPage.getContent();
    }


    public Optional<Category> findByCategoryId(Integer id) {
        return categoryRepository.findById(id);
    }

    public void deleteCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }
}
