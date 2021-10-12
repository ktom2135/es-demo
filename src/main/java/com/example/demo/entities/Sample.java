package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

@Document(indexName = "archived_sample_index")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sample {

    @Field
    private String name;

    @Id
    private String id;

    @Field
    private  String newField;
}