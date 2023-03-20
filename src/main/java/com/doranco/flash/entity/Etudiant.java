package com.doranco.flash.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "etudiants")
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String nom;
    @ManyToOne(fetch = FetchType.LAZY)
    private Specialite specialite;
    @OneToMany(mappedBy = "etudiant")// nom attribut association dans l'autre classe
    private List<CoursEtudiant> coursEtudiantList = new ArrayList<>();
}
