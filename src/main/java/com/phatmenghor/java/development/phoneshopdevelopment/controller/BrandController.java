package com.phatmenghor.java.development.phoneshopdevelopment.controller;

import com.phatmenghor.java.development.phoneshopdevelopment.dto.BrandDTO;
import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;
import com.phatmenghor.java.development.phoneshopdevelopment.service.BrandService;
import com.phatmenghor.java.development.phoneshopdevelopment.service.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }
}
