package com.example.test.services.impl;

import com.example.test.entities.Post;
import com.example.test.repositories.PostRepository;
import com.example.test.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post addPost(Post post) {
        postRepository.save(post);
        return post;
    }

    @Override
    public void deletePost(long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post updatePost(long id, Post updatePost) {
        updatePost.setIdPost(id);
        return postRepository.save(updatePost);
    }

    @Override
    public Post getById(long id) {
        return postRepository.findById(id).orElseThrow();
    }
}
