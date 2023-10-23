package com.example.lab9_20193733.Repository;

import com.example.lab9_20193733.Entity.Participante;
import com.example.lab9_20193733.Entity.ParticipantesPartido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantesPartidoRepository extends JpaRepository<ParticipantesPartido, Integer> {

    @Query(value = "SELECT * FROM participantespartido\n" +
            "INNER JOIN partidossdci.participante p on participantespartido.participante_idparticipante = p.idparticipante\n" +
            "INNER JOIN partidossdci.partido pa on participantespartido.partido_idpartido = pa.idpartido", nativeQuery = true)
    List<ParticipantesPartido> findAllEquipos();

    @Query(value = "SELECT * FROM participantespartido\n" +
            "INNER JOIN partidossdci.participante p on participantespartido.participante_idparticipante = p.idparticipante\n" +
            "INNER JOIN partidossdci.partido pa on participantespartido.partido_idpartido = pa.idpartido\n" +
            "WHERE pa.equipoA = ?1 OR pa.equipoB = ?1", nativeQuery = true)
    List<ParticipantesPartido> findByEquipoId(Integer idEquipo);

}
