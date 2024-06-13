package com.learning.onlinebankingsystem.mapper;

import com.learning.onlinebankingsystem.dto.AddressDto;
import com.learning.onlinebankingsystem.entity.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
    Address addressDtoTOAddress(AddressDto addressDto);
}
