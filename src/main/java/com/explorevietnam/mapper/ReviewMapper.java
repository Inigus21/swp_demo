package com.explorevietnam.mapper;

import com.explorevietnam.entity.Review;
import com.explorevietnam.model.ReviewModel;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    ReviewModel toReviewModel(Review Review);

    List<ReviewModel> toReviewModelList(List<Review> reviews);

    @Mapping(target = "tour", ignore = true)
    @Mapping(target = "account", ignore = true)
    Review toReviewEntity(Review review);
}
