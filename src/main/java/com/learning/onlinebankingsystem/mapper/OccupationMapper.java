package com.learning.onlinebankingsystem.mapper;

import com.learning.onlinebankingsystem.dto.OccupationDto;
import com.learning.onlinebankingsystem.entity.Occupation;
import org.mapstruct.Mapper;

@Mapper
public interface OccupationMapper {
    Occupation occupationDtoToOccupation(OccupationDto occupationDto);
}
