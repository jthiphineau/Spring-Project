package com.doranco.flash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "specialites")
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Specialite implements Serializable{
    @Id // indique la cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment de la cle
    private Integer id;

    @NonNull
    @Column(nullable = false, unique = true)
    private String titre;

    @NonNull
    private String description;

    @CreationTimestamp
    @Column(name = "date_creation", updatable = false)
    private LocalDateTime dateCreation;

    @UpdateTimestamp
    @Column(name = "date_modification")
    private LocalDateTime dateModification;
}