package com.example.lab9_20193733.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "participante")
@Getter
@Setter
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idparticipante", nullable = false)
    private Integer participanteid;

    @ManyToOne
    @JoinColumn(name = "equipo")
    private Equipo equipo;

    @Column(name = "carrera")
    private String carrera;

    @Column(name = "codigo")
    private Float codigo;

    @Column(name = "tipoParticipante")
    private String tipoParticipante;

}
