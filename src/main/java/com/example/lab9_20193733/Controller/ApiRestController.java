package com.example.lab9_20193733.Controller;

import com.example.lab9_20193733.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdci")
public class ApiRestController {

    @Autowired
    private DeporteRepository deporteRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private HistorialPartidosRepository historialPartidosRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private ParticipantesPartidoRepository participantesPartidoRepository;

    @Autowired
    private PartidoRepository partidoRepository;



}
