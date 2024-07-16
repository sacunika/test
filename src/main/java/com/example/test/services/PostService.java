package com.example.test.services;

import com.example.test.entities.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post addPost(Post post);
    void deletePost(long id);
    Post updatePost(long id, Post updatePost);
    Post getById(long id);
}
