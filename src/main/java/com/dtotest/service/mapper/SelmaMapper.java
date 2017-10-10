package com.dtotest.service.mapper;

import com.dtotest.domain.Post;
import com.dtotest.service.dto.PostDTO;
import fr.xebia.extras.selma.Mapper;

@Mapper()
public interface SelmaMapper {

    Post asPost(PostDTO dto);

    PostDTO asPostDto(Post entity);

}
