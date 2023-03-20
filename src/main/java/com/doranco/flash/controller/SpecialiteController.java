package com.doranco.flash.controller;

import com.doranco.flash.dto.SpecialiteDto;
import com.doranco.flash.service.SpecialiteService;
import com.doranco.flash.util.CustomResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //cette classe est une ressource REST
@RequestMapping("api/v1/specialite")
public class SpecialiteController {

    private final SpecialiteService specialiteService;
    //injection de la dependance par le constructeur
    public SpecialiteController(SpecialiteService specialiteService) {
        this.specialiteService = specialiteService;
    }

    @GetMapping("/test")
    public ResponseEntity<?> testController1(){
        return ResponseEntity.status(200).body("Test du controller");
    }
    @GetMapping("/test2")
    public ResponseEntity<?> testController2(){
        return CustomResponse.errorResponse(400,"Le titre existe deja");
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SpecialiteDto specialiteDto){
        return specialiteService.create(specialiteDto);

    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") Integer id) {
        return specialiteService.findById(id);
    }

}
