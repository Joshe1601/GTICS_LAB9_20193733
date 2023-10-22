package com.example.lab9_20193733.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "participantespartido")
@Getter
@Setter
public class ParticipantesPartido {

    @Id
/*    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    @Column(name = "idparticipantesPartido", nullable = false)
    private Integer participantesPartidoId;

    @ManyToOne
    @JoinColumn(name = "partido_idpartido")
    private Partido partido;

    @ManyToOne
    @JoinColumn(name = "participante_idparticipante")
    private Participante participante;

    @Column(name = "horaFecha")
    private String horaFecha;


}
