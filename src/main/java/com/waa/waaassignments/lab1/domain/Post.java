package com.waa.waaassignments.lab1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int id;
    private String title;
    private String content;
    private String author;
}
