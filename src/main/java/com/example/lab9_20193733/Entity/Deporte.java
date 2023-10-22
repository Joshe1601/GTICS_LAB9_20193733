package com.example.lab9_20193733.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "deporte")
@Getter
@Setter
public class Deporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddeporte", nullable = false)
    private Integer deporteid;

    @Column(name = "nombreDeporte")
    private String nombreDeporte;

    @Column(name = "pesoDeporte")
    private Integer pesoDeporte;


}
