package com.phatmenghor.java.development.phoneshopdevelopment.mapper;

import com.phatmenghor.java.development.phoneshopdevelopment.dto.BrandDTO;
import com.phatmenghor.java.development.phoneshopdevelopment.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    Brand toBrand(BrandDTO dto);

    BrandDTO toBrandDTO(Brand entity);
}
