package com.dtotest.service.mapper;

import com.dtotest.domain.*;
import com.dtotest.service.dto.PostDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Post and its DTO PostDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PostMapper extends EntityMapper <PostDTO, Post> {
    
    

}
