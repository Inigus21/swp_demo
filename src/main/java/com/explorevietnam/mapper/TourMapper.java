package com.explorevietnam.mapper;

import com.explorevietnam.entity.Tour;
import com.explorevietnam.model.TourModel;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TourMapper {
    TourModel toTourModel(Tour tour);

    List<TourModel> toTourModelList(List<Tour> tours);

    @Mapping(target = "category_id", ignore = true)
    @Mapping(target = "posts", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "ticketPrices", ignore = true)
    @Mapping(target = "tourDepartureDates", ignore = true)
    @Mapping(target = "departureLocation", ignore = true)
    @Mapping(target = "destinationLocations", ignore = true)
    @Mapping(target = "transports", ignore = true)
    @Mapping(target = "promotions", ignore = true)
    Tour toTourEntity(TourModel tourModel);
}