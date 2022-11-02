package com.waa.waaassignments.lab1.service;

import com.waa.waaassignments.lab1.domain.Post;
import com.waa.waaassignments.lab1.domain.dto.request.PostDto;
import com.waa.waaassignments.lab1.repo.PostRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<PostDto> getAll() {
        return this.postRepo.getAll().stream().map(p->modelMapper.map(p,PostDto.class)).toList();

    }

    @Override
    public PostDto findById(int id) {
        return this.modelMapper.map(postRepo.findById(id),PostDto.class);
    }

    @Override
    public PostDto deleteById(int id) {
        return this.modelMapper.map(postRepo.deleteById(id),PostDto.class);
    }

    @Override
    public PostDto updateById(int id, PostDto postDto) {
        var post=modelMapper.map(postDto,Post.class);
        return modelMapper.map(postRepo.updateById(id,post),PostDto.class);
    }

    @Override
    public PostDto save(PostDto postDto) {
        var post=modelMapper.map(postDto,Post.class);
        return modelMapper.map(postRepo.save(post),PostDto.class);
    }
}
