package com.CRUD.SpringApplication.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TextController {



//
//    @GetMapping("/all")
//    public string allaccess(){
//        return "public Content GET_ALL";
//    }
//
//
@GetMapping("/all")
public String allAccess(){
    return "Get Mapping";
  };


    @PutMapping("/all")
    public String CreateAccess(){
        return "Get Mapping";
    };


    @DeleteMapping("/all")
    public String DeleteAccess(){
        return "Get Mapping";
    };



}
