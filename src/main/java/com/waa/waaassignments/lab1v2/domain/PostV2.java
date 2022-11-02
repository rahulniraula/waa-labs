package com.waa.waaassignments.lab1v2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostV2 {
    private int id;
    private String title;
    private String content;
    private String author;
}
