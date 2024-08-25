package com.example.rest_api.controller;

import com.example.rest_api.model.BookRequest;
import com.example.rest_api.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(
            @RequestBody BookRequest bookRequest
    ){
        System.out.println(bookRequest);

    }

/*
     리턴값을 Json으로 리턴해주고 싶으면
    @PostMapping("/post")
    public BookRequest post(
            @RequestBody BookRequest bookRequest
    ){
        System.out.println(bookRequest);
        return bookRequest;
    }

    eg)
    {
        "name": "Spring Boot",
        "number": "100",
        "category": "Java"
    }


     리턴값을 객체로 주고 싶을때
    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
    ){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }
    eg)
    BookRequest(name=Spring Boot, number=100, category=Java)

     */
    @PostMapping("/user")
    public void post(
            @RequestBody UserRequest userRequest
    ){
        System.out.println(userRequest);
    }
}
