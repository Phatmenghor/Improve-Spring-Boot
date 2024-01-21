package com.phatmenghor.java.development.phoneshopdevelopment.controller;

import com.phatmenghor.java.development.phoneshopdevelopment.dto.BrandDTO;
import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;
import com.phatmenghor.java.development.phoneshopdevelopment.mapper.BrandMapper;
import com.phatmenghor.java.development.phoneshopdevelopment.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(brand));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId) {
        Brand brand = brandService.getById(brandId);
        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(brand));
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer brandId, @RequestBody BrandDTO brandDTO) {
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
        Brand updateBrand = brandService.update(brandId, brand);
        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(updateBrand));
    }
}
