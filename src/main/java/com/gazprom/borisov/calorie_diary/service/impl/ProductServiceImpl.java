package com.gazprom.borisov.calorie_diary.service.impl;

import com.gazprom.borisov.calorie_diary.dto.ProductDto;
import com.gazprom.borisov.calorie_diary.entity.Product;
import com.gazprom.borisov.calorie_diary.mapper.ProductMapper;
import com.gazprom.borisov.calorie_diary.repository.ProductRepository;
import com.gazprom.borisov.calorie_diary.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Override
    public void saveNewProduct(ProductDto productDto) {
        Product product = productMapper.toProduct(productDto);
        productRepository.save(product);
    }
}
