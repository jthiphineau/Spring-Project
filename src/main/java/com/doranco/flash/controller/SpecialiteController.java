package com.doranco.flash.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //cette classe est une ressource REST
@RequestMapping("api/v1/specialite")
public class SpecialiteController {
    @GetMapping("/test")
    public ResponseEntity<String> testController(){
        return ResponseEntity.status(200).body("Test du controller");
    }
}
