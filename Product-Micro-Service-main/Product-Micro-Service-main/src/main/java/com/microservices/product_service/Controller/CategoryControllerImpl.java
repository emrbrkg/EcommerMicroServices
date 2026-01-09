package com.microservices.product_service.Controller;

import com.microservices.product_service.Response.GetCategoriesResponse;
import com.microservices.product_service.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/products")
@RestController
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController{
    private final CategoryService categoryService;

    @Override
    @GetMapping("/categories")
    public GetCategoriesResponse listCategories() {
        return categoryService.getCategories();
    }
}
