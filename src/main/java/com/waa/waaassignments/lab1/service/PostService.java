package com.waa.waaassignments.lab1.service;

import com.waa.waaassignments.lab1.domain.Post;
import com.waa.waaassignments.lab1.domain.dto.request.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> getAll();
    public PostDto findById(int id);
    public PostDto deleteById(int id);
    public PostDto updateById(int id, PostDto post);
    public PostDto save(PostDto post);
}
