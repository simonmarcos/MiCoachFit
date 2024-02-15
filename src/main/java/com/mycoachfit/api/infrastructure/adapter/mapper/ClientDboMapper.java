package com.mycoachfit.api.infrastructure.adapter.mapper;

import com.mycoachfit.api.domain.model.Client;
import com.mycoachfit.api.infrastructure.adapter.entity.ClientEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientDboMapper {
    ClientEntity toDbo(Client client);

    @InheritInverseConfiguration
    Client toDomain(ClientEntity clientEntity);
}
