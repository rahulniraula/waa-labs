package com.waa.waaassignments.lab1v2.repo;

import com.waa.waaassignments.lab1v2.domain.PostV2;

import java.util.List;

public interface PostRepo {
    public List<PostV2> filterPostsByAuthor(String author);
}
