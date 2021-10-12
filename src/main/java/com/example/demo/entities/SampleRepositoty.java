package com.example.demo.entities;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepositoty extends ElasticsearchRepository<Sample,String> {

}