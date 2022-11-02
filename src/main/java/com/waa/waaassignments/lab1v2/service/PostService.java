package com.waa.waaassignments.lab1v2.service;


import com.waa.waaassignments.lab1v2.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> filterPostsByAuthor(String author);
}
