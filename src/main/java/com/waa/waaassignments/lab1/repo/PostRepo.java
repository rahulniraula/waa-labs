package com.waa.waaassignments.lab1.repo;

import com.waa.waaassignments.lab1.domain.Post;
import com.waa.waaassignments.lab1.domain.dto.request.PostDto;

import java.util.List;

public interface PostRepo {
    public List<Post> getAll();
    public Post findById(int id);
    public Post deleteById(int id);
    public Post updateById(int id, Post post);
    public Post save(Post post);

}
