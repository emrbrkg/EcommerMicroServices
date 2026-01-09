package com.microservices.product_service.Controller;

import com.microservices.product_service.Request.AddProductRequest;
import com.microservices.product_service.Response.ProductListResponse;
import com.microservices.product_service.Response.ProductResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProductController {

    ProductListResponse getProducts();

    ProductResponse getProduct(@PathVariable("id") Long id);

    ProductResponse addProduct(@RequestBody AddProductRequest request);

    ProductResponse updateStock(@PathVariable("id") Long id, @RequestBody AddProductRequest request);

    ProductListResponse searchProducts(@RequestParam(required = false) String categoryType, @RequestParam(required = false) Long categoryCode);
}
