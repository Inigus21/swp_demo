package com.explorevietnam.mapper;

import com.explorevietnam.entity.DestinationLocation;
import com.explorevietnam.model.DestinationLocationModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DestinationLocationMapper {

    DestinationLocationModel toDestinationLocationModel(DestinationLocation destinationLocation);

    List<DestinationLocationModel> toDestinationLocationModelList(List<DestinationLocation> destinationLocations);

    @Mapping(target = "tours", ignore = true)
    DestinationLocation toDestinationLocation(DestinationLocationModel destinationLocationModel);
}
