package com.doranco.flash.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cours")
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String intitule;
    @OneToMany(mappedBy = "cours")// nom attribut dans l'autre classe
    List<CoursEtudiant> coursEtudiantList = new ArrayList<>();
}
