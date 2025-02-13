package com.explorevietnam.mapper;

import com.explorevietnam.entity.Promotion;
import com.explorevietnam.model.PromotionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
    PromotionModel toPromotionModel(Promotion promotion);

    List<PromotionModel> toPromotionModelList(List<Promotion> promotions);

    @Mapping(target = "tours", ignore = true) // Khi chuyển từ Model về Entity, cũng bỏ Tour
    Promotion toPromotionEntity(PromotionModel promotionModel);
}
