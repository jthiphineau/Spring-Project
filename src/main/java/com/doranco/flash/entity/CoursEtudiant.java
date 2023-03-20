package com.doranco.flash.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cours-etudiant")
@NoArgsConstructor
@Getter
@Setter
public class CoursEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   @ManyToOne
    private Etudiant etudiant;
    private Float note;
    @ManyToOne
    private Cours cours;
}
