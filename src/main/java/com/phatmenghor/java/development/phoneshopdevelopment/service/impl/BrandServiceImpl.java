package com.phatmenghor.java.development.phoneshopdevelopment.service.impl;

import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;
import com.phatmenghor.java.development.phoneshopdevelopment.repository.BrandRepository;
import com.phatmenghor.java.development.phoneshopdevelopment.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
}
