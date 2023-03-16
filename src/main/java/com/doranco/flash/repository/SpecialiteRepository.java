package com.doranco.flash.repository;

import com.doranco.flash.entity.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;

//pas besoin d'ajouter annotation @Repository
public interface SpecialiteRepository extends JpaRepository<Specialite,Integer> {
}
