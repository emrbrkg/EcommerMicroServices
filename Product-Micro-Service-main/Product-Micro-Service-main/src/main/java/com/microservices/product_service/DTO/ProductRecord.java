package com.microservices.product_service.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductRecord(Long id,
                            String name,
                            String description,
                            BigDecimal price,
                            String currency,
                            Integer stockQuantity,
                             String imageUrl,
                             Integer popularityScore,
                            //buraya dikkat
                             CategoryDTO category,
                             Boolean isActive,
                             LocalDateTime createdAt,
                             LocalDateTime updatedAt) {
}
