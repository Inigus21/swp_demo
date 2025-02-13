package com.explorevietnam.mapper;

import com.explorevietnam.entity.Post;
import com.explorevietnam.model.PostModel;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {
    PostModel toPostModel(Post post);

    List<PostModel> toPostModelList(List<Post> posts);

    @Mapping(target = "tour", ignore = true)
    Post toPostEntity(PostModel postModel);
}
