package com.explorevietnam.mapper;

import com.explorevietnam.entity.TourDepartureDate;
import com.explorevietnam.model.TourDepartureDateModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TourDepartureDateMapper {

    TourDepartureDateModel toTourDepartureDateModel(TourDepartureDate tourDepartureDate);

    List<TourDepartureDateModel> toTourDepartureDateModelList(List<TourDepartureDate> tourDepartureDates);

    @Mapping(target = "tour", ignore = true) // Bỏ Tour để tránh vòng lặp
    TourDepartureDate toTourDepartureDateEntity(TourDepartureDateModel tourDepartureDateModel);
}
