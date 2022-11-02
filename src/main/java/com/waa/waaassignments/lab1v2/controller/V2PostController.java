package com.waa.waaassignments.lab1v2.controller;

import com.waa.waaassignments.lab1v2.domain.dto.PostDto;
import com.waa.waaassignments.lab1v2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/posts")
public class V2PostController {

    @Autowired
    @Qualifier("v2PostService")
    PostService postService;
    @GetMapping("/")
    public List<PostDto> getPosts(@RequestParam String author, @RequestHeader String API_VERSION){
        return postService.filterPostsByAuthor(author);
    }
}
