package com.dtotest.service.impl;

import com.dtotest.service.PostService;
import com.dtotest.domain.Post;
import com.dtotest.repository.PostRepository;
import com.dtotest.service.dto.PostDTO;
import com.dtotest.service.mapper.PostMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * Service Implementation for managing Post.
 */
@Service
public class PostServiceImpl implements PostService{

    private final Logger log = LoggerFactory.getLogger(PostServiceImpl.class);

    private final PostRepository postRepository;

    private final PostMapper postMapper;

    public PostServiceImpl(PostRepository postRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
    }

    /**
     * Save a post.
     *
     * @param postDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public PostDTO save(PostDTO postDTO) {
        log.debug("Request to save Post : {}", postDTO);
        Post post = postMapper.toEntity(postDTO);
        post = postRepository.save(post);
        return postMapper.toDto(post);
    }

    /**
     *  Get all the posts.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Override
    public Page<PostDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Posts");
        return postRepository.findAll(pageable)
            .map(postMapper::toDto);
    }

    /**
     *  Get one post by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    public PostDTO findOne(String id) {
        log.debug("Request to get Post : {}", id);
        Post post = postRepository.findOne(id);
        return postMapper.toDto(post);
    }

    /**
     *  Delete the  post by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Post : {}", id);
        postRepository.delete(id);
    }
}
