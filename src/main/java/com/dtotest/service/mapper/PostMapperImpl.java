package com.dtotest.service.mapper;

import com.dtotest.domain.Post;
import com.dtotest.service.dto.PostDTO;
import fr.xebia.extras.selma.Selma;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PostMapperImpl implements PostMapper {

    // Get SelmaMapper
    SelmaMapper mapper = Selma.builder(SelmaMapper.class).build();


    @Override
    public Post toEntity(PostDTO dto) {
//        Post post = new Post();
//        post.setTitle(dto.getTitle());
//        post.setCategory(dto.getCategory());
//        post.setContent(dto.getContent());
//        return post;

        return mapper.asPost(dto);

    }

    @Override
    public PostDTO toDto(Post entity) {

//        PostDTO postDTO = new PostDTO();
//        postDTO.setTitle(entity.getTitle());
//        postDTO.setCategory(entity.getCategory());
//        postDTO.setContent(entity.getContent());
//        postDTO.setId(entity.getId());
//        return postDTO;

        return mapper.asPostDto(entity);
    }

    @Override
    public List<Post> toEntity(List<PostDTO> dtoList) {
        return dtoList.stream()
            .filter(Objects::nonNull)
            .map(this::toEntity)
            .collect(Collectors.toList());
    }

    @Override
    public List<PostDTO> toDto(List<Post> entityList) {

        return entityList.stream()
            .filter(Objects::nonNull)
            .map(this::toDto)
            .collect(Collectors.toList());
    }
}
