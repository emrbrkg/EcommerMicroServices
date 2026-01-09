package com.microservices.product_service.Response;

import com.microservices.product_service.DTO.ProductDTO;
import com.microservices.product_service.DTO.ProductRecord;
import lombok.Data;

import java.util.List;

@Data
public class ProductListResponse {
    List<ProductRecord> productRecords;
}
