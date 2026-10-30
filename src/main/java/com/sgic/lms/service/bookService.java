package com.sgic.lms.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class bookService {

    @Value("${book.name}" )
    private  String bookName;

    @Value("${book.price}")
    private String bookPrice;

    public  String get(){
        return "book name: "+bookName+".book price: "+bookPrice;
    }
}
