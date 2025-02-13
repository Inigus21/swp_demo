package com.explorevietnam.mapper;

import com.explorevietnam.entity.Transport;
import com.explorevietnam.model.TransportModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TransportMapper {

    TransportModel toTransportModel(Transport transport);

    List<TransportModel> toTransportModelList(List<Transport> transports);

    @Mapping(target = "tours", ignore = true)
    Transport toTransportEntity(TransportModel transportModel);
}
