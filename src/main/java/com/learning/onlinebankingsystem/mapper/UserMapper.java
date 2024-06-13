package com.learning.onlinebankingsystem.mapper;

import com.learning.onlinebankingsystem.dto.OpenAccountDto;
import com.learning.onlinebankingsystem.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User openAccountDtoToUser(OpenAccountDto openAccountDto);
}
