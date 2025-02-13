package com.explorevietnam.mapper;

import com.explorevietnam.entity.TicketPrice;
import com.explorevietnam.model.TicketPriceModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketPriceMapper {

    TicketPriceModel toTicketPriceModel(TicketPrice ticketPrice);

    List<TicketPriceModel> toTicketPriceModelList(List<TicketPrice> ticketPrices);

    @Mapping(target = "tour", ignore = true)
    TicketPrice toTicketPriceEntity(TicketPriceModel ticketPriceModel);
}
