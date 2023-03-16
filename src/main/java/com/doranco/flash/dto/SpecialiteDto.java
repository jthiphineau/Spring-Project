package com.doranco.flash.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialiteDto {
    private Integer id;
    private String titre;
    private String description;
}