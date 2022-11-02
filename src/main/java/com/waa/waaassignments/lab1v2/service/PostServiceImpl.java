package com.waa.waaassignments.lab1v2.service;

import com.waa.waaassignments.lab1v2.domain.dto.PostDto;
import com.waa.waaassignments.lab1v2.repo.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("v2PostService")
public class PostServiceImpl implements PostService {
    @Autowired
    @Qualifier("v2")
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<PostDto> filterPostsByAuthor(String author) {
        return postRepo.filterPostsByAuthor(author).stream().map(post->modelMapper.map(post,PostDto.class)).toList();
    }
}
