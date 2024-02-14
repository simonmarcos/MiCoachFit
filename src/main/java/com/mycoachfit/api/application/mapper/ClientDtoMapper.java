package com.mycoachfit.api.application.mapper;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.domain.model.dto.request.ClientRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientDtoMapper {
    Client toEntity(ClientRequestDTO clientRequestDTO);
}
