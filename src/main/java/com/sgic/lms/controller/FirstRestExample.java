package com.sgic.lms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class FirstRestExample {
    @GetMapping("/hello")
    public ResponseEntity<String>getAll(){
        return ResponseEntity.ok("Hello This is my REST API");
    }

    @RequestMapping("/hello1")
    public Map<String, String> getall(){
        Map<String, String> map= new HashMap<>();
        map.put("Message","Hello");
        map.put("Message1","kajipan");
        return map;
    }
}