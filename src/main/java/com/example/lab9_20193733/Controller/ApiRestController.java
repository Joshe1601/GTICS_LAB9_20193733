package com.example.lab9_20193733.Controller;

import com.example.lab9_20193733.Entity.*;
import com.example.lab9_20193733.Repository.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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


    @GetMapping("/partido/getparticipantes")
    public List<ParticipantesPartido> listaParticipantes(@RequestParam(value = "idequipo", required = false) Integer idEquipo) {
        if (idEquipo == null) {
            return participantesPartidoRepository.findAllEquipos();
        } else {
            return participantesPartidoRepository.findByEquipoId(idEquipo);
        }

    }

    @GetMapping("/partido/gethistorialpartidos")
    public List<HistorialPartidos> listaPartidos(@RequestParam(value = "idequipo", required = false) Integer idEquipo) {
        if (idEquipo == null) {
            return historialPartidosRepository.findAllPartidos();
        } else {
            return historialPartidosRepository.findPartidoByEquipoId(idEquipo);
        }

    }

    @PostMapping("/equipo/registro")
    public ResponseEntity<HashMap<String, Object>> registrarEquipo(@RequestBody Equipo equipo) {

        HashMap<String, Object> response = new HashMap<>();

        equipoRepository.save(equipo);
        response.put("mensaje", "Equipo registrado con éxito");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/participante/registro")
    public ResponseEntity<HashMap<String, Object>> registrarPartido(@RequestBody Participante participante) {
        HashMap<String, Object> response = new HashMap<>();

        participanteRepository.save(participante);
        response.put("mensaje", "Participante registrado con éxito");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/deporte/registro")
    public ResponseEntity<HashMap<String, Object>> registrarParticipantePartido(@RequestBody Deporte Deporte) {
        HashMap<String, Object> response = new HashMap<>();

        deporteRepository.save(Deporte);
        response.put("mensaje", "Deporte registrado con éxito");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/partido/registro")
    public ResponseEntity<HashMap<String, Object>> registrarParticipantePartido(@RequestBody Partido partido) {
        HashMap<String, Object> response = new HashMap<>();

        partidoRepository.save(partido);
        response.put("mensaje", "Partido registrado con éxito");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

/*    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseEntity<HashMap<String, String>> handleException(HttpServletRequest request) {
        HashMap<String, String> response = new HashMap<>();

        if(request.getMethod().equals("POST")) {
            response.put("estado", "Error en la petición");
            response.put("mensaje", "Debe enviar correctamente un producto");
        }

        return ResponseEntity.badRequest().body(response);
    }*/


}
