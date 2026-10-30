package com.sgic.lms.controller;


import com.sgic.lms.service.bookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class bookContoller {

    @Autowired
    private  bookService BookService ;

    @GetMapping
    public String getAppInfo(){
        return BookService.get();
    }

}
