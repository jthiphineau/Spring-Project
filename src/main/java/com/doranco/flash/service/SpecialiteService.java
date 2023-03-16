package com.doranco.flash.service;

import com.doranco.flash.dto.SpecialiteDto;
import org.springframework.http.ResponseEntity;

public interface SpecialiteService {
    ResponseEntity<?> create(SpecialiteDto specialiteDto);

    ResponseEntity<?> findById(Integer id);

    ResponseEntity<?> update(SpecialiteDto specialiteDto, Integer idSpecialite);

    ResponseEntity<?> delete(Integer idSpecialite);

    ResponseEntity<?> findAll();
}
