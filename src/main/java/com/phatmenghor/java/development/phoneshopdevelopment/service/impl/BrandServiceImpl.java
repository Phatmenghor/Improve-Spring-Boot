package com.phatmenghor.java.development.phoneshopdevelopment.service.impl;

import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;
import com.phatmenghor.java.development.phoneshopdevelopment.exception.ApiException;
import com.phatmenghor.java.development.phoneshopdevelopment.exception.ResourceNotFoundException;
import com.phatmenghor.java.development.phoneshopdevelopment.repository.BrandRepository;
import com.phatmenghor.java.development.phoneshopdevelopment.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand getById(Integer id) {
        return brandRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Brand", id));
    }

    @Override
    public Brand update(Integer id, Brand brandUpdate) {
        Brand brand = getById(id);
        brand.setName(brandUpdate.getName());
        return brandRepository.save(brand);
    }
}
