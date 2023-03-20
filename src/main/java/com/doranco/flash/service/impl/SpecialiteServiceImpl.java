package com.doranco.flash.service.impl;

import com.doranco.flash.dto.SpecialiteDto;
import com.doranco.flash.entity.Specialite;
import com.doranco.flash.repository.SpecialiteRepository;
import com.doranco.flash.service.SpecialiteService;
import com.doranco.flash.util.CustomResponse;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialiteServiceImpl implements SpecialiteService {
    private final SpecialiteRepository specialiteRepository;
    private final ModelMapper modelMapper; //permet de transformer dto en entity et entity en dto

    public SpecialiteServiceImpl(SpecialiteRepository specialiteRepository) {
        this.specialiteRepository = specialiteRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public ResponseEntity<?> create(SpecialiteDto specialiteDto) {
        // TODO validation des attributs
        var specialite = modelMapper.map(specialiteDto, Specialite.class);
        try {
            specialiteRepository.save(specialite);
            //convertir entity en dtp
            specialiteDto = modelMapper.map(specialite, SpecialiteDto.class);
        } catch (Exception ex) {
            return CustomResponse.errorResponse(500, ex.getMessage());

        }
        return CustomResponse.succesResponse(201, specialiteDto);
    }

    @Override
    public ResponseEntity<?> findById(Integer id) {
        Optional<Specialite> specialiteOptional; // Optional est un conteneur d'objet
        try {
            specialiteOptional = specialiteRepository.findById(id);
            //tester si specialite est present dans le conteneur optional
        } catch (Exception e) {
            return CustomResponse.errorResponse(500, e.getMessage());
        }
        if (specialiteOptional.isEmpty()) {
            // si le conteneur est vide
            return CustomResponse.errorResponse(400, "Specialite avec id" + id + " introuvable");
        }
        return CustomResponse.succesResponse(200, specialiteOptional.get());
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
