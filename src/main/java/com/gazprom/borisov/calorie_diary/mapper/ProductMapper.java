package com.gazprom.borisov.calorie_diary.mapper;

import com.gazprom.borisov.calorie_diary.dto.ProductDto;
import com.gazprom.borisov.calorie_diary.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    Product toProduct(ProductDto productDto);
}
