package com.phatmenghor.java.development.phoneshopdevelopment.repository;

import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
