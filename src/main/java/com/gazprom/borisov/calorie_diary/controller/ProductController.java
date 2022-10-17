package com.gazprom.borisov.calorie_diary.controller;

import com.gazprom.borisov.calorie_diary.dto.ProductDto;
import com.gazprom.borisov.calorie_diary.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("new")
    ResponseEntity<Void> createNewProduct(@RequestBody ProductDto productDto){
        productService.saveNewProduct(productDto);
        return ResponseEntity.ok().build();
    }
}
