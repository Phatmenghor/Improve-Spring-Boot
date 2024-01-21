package com.phatmenghor.java.development.phoneshopdevelopment.service;

import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;

public interface BrandService {
    Brand create(Brand brand);

    Brand getById(Integer id);

    Brand update(Integer id, Brand brandUpdate);
}
