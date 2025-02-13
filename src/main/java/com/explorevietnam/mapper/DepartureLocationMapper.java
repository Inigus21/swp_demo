package com.explorevietnam.mapper;

import com.explorevietnam.entity.DepartureLocation;
import com.explorevietnam.model.DepartureLocationModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartureLocationMapper {

    DepartureLocationModel toDepartureLocationModel(DepartureLocation departureLocation);

    List<DepartureLocationModel> toDepartureLocationModelList(List<DepartureLocation> departureLocations);

    @Mapping(target = "tours", ignore = true)
    DepartureLocation toDepartureLocationEntity(DepartureLocationModel departureLocationModel);
}
