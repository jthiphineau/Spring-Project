package com.doranco.flash.service.impl;

import com.doranco.flash.dto.SpecialiteDto;
import com.doranco.flash.repository.SpecialiteRepository;
import com.doranco.flash.service.SpecialiteService;
import org.springframework.http.ResponseEntity;

public class SpecialiteServiceImpl implements SpecialiteService {
    private final SpecialiteRepository specialiteRepository;

    public SpecialiteServiceImpl(SpecialiteRepository specialiteRepository) {
        this.specialiteRepository = specialiteRepository;
    }

    @Override
    public ResponseEntity<?> create(SpecialiteDto specialiteDto) {
        return null;
    }

    @Override
    public ResponseEntity<?> findById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(SpecialiteDto specialiteDto, Integer idSpecialite) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Integer idSpecialite) {
        return null;
    }

    @Override
    public ResponseEntity<?> findAll() {
        return null;
    }
}
