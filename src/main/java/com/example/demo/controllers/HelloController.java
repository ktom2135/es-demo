package com.example.demo.controllers;

import com.example.demo.entities.Sample;
import com.example.demo.entities.SampleRepositoty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController

@RequestMapping("/api/archived")
public class HelloController {

    @Autowired
    SampleRepositoty sampleRepositoty;

    @GetMapping(value = "/hello")
    public void hello() {

        Sample sample = Sample.builder()
                .name("tom")
                .id("avc" + new Date().toString())
                .build();

        sampleRepositoty.save(sample);

    }

}