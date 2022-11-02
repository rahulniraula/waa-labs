package com.waa.waaassignments.lab1.controller;

import com.waa.waaassignments.lab1.domain.dto.request.PostDto;
import com.waa.waaassignments.lab1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<PostDto> getAll(){
        return postService.getAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostDto findById(@PathVariable int id){
        return postService.findById(id);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostDto updateById(@PathVariable int id,@RequestBody PostDto postDto){
        return postService.updateById(id,postDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PostDto deleteById(@PathVariable int id){
        return this.postService.deleteById(id);
    }
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public PostDto save(@RequestBody PostDto postDto){
//        return postDto;
        return this.postService.save(postDto);
    }
}
