package com.example.lab9_20193733.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "historialpartidos")
@Getter
@Setter
public class HistorialPartidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhistorialpartidos", nullable = false)
    private Integer historialpartidosid;

    @ManyToOne
    @JoinColumn(name = "partido_idpartido")
    private Partido partidoIdPartido;

    @ManyToOne
    @JoinColumn(name = "deporte_iddeporte")
    private Deporte deporteIdDeporte;

    @Column(name = "horaFecha")
    private LocalDateTime horaFecha;

}
