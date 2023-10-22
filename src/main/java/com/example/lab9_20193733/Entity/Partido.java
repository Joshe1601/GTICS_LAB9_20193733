package com.example.lab9_20193733.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "partido")
@Getter
@Setter
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpartido", nullable = false)
    private Integer partidoId;

    @ManyToOne
    @JoinColumn(name = "equipoA")
    private Equipo equipoA;

    @ManyToOne
    @JoinColumn(name = "equipoB")
    private Equipo equipoB;

    @Column(name = "scoreA")
    private Integer scoreA;

    @Column(name = "scoreB")
    private Integer scoreB;


}
