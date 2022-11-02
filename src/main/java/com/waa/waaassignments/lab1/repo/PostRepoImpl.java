package com.waa.waaassignments.lab1.repo;

import com.waa.waaassignments.lab1.domain.Post;
import com.waa.waaassignments.lab1.domain.dto.request.PostDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo{
    private static int INITIAL_POST_ID=1000;

    List<Post> posts=new ArrayList<>();
    public PostRepoImpl(){
        Post p1=new Post(
                INITIAL_POST_ID++,
                "FIrst Post",
                "This is first Post on this topic",
                "Rahul Niraula"
        );
        Post p2=new Post(
                INITIAL_POST_ID++,
                "Second Post",
                "This is second Post on this topic",
                "Rahul Niraula"
        );
        Post p3=new Post(
                INITIAL_POST_ID++,
                "Third Post",
                "This is third Post on this topic",
                "Rahul Niraula"
        );
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }

    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Post findById(int id) {
        return posts.stream().filter(p->p.getId()==id).findFirst().orElse(null);
    }

    @Override
    public Post deleteById(int id) {
        var post=this.findById(id);
        posts.remove(post);
        return post;
    }

    @Override
    public Post updateById(int id, Post p) {
        var post=this.findById(id);
        post.setAuthor(p.getAuthor());
        post.setTitle(p.getTitle());
        post.setContent(p.getContent());
        return post;
    }

    @Override
    public Post save(Post post) {
        post.setId(INITIAL_POST_ID++);
        posts.add(post);
        return post;
    }
}
