package com.waa.waaassignments.lab1v2.repo;

import com.waa.waaassignments.lab1.domain.Post;
import com.waa.waaassignments.lab1v2.domain.PostV2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("v2")
public class PostRepoImpl implements PostRepo{
    private static int INITIAL_POST_ID=80;

    List<PostV2> posts=new ArrayList<>();
    public PostRepoImpl(){
        PostV2 p1=new PostV2(
                INITIAL_POST_ID++,
                "FIrst Post",
                "This is first Post on this topic",
                "Niraula"
        );
        PostV2 p2=new PostV2(
                INITIAL_POST_ID++,
                "Second Post",
                "This is second Post on this topic",
                "Rahul"
        );
        PostV2 p3=new PostV2(
                INITIAL_POST_ID++,
                "Third Post",
                "This is third Post on this topic",
                "Rahul"
        );
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }
    @Override
    public List<PostV2> filterPostsByAuthor(String author) {
        return posts.stream().filter(p->p.getAuthor().equalsIgnoreCase(author)).toList();
    }
}
