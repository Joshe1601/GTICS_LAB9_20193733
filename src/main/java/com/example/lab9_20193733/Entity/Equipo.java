package com.example.lab9_20193733.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipo")
@Getter
@Setter
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipo", nullable = false)
    private Integer equipoid;

    @Column(name = "nombreEquipo")
    private String nombreEquipo;

    @Column(name = "colorEquipo")
    private String colorEquipo;

    @Column(name = "mascota")
    private String mascota;

}
