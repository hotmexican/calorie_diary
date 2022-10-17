package com.gazprom.borisov.calorie_diary.service;

import com.gazprom.borisov.calorie_diary.dto.ProductDto;

public interface ProductService {
    void saveNewProduct(ProductDto productDto);
}
