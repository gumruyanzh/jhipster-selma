package com.dtotest.service;

import com.dtotest.service.dto.PostDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Post.
 */
public interface PostService {

    /**
     * Save a post.
     *
     * @param postDTO the entity to save
     * @return the persisted entity
     */
    PostDTO save(PostDTO postDTO);

    /**
     *  Get all the posts.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<PostDTO> findAll(Pageable pageable);

    /**
     *  Get the "id" post.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    PostDTO findOne(String id);

    /**
     *  Delete the "id" post.
     *
     *  @param id the id of the entity
     */
    void delete(String id);
}
