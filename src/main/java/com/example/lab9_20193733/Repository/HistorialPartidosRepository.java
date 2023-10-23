package com.example.lab9_20193733.Repository;

import com.example.lab9_20193733.Entity.HistorialPartidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialPartidosRepository extends JpaRepository<HistorialPartidos, Integer> {

    @Query(value = "SELECT * FROM historialpartidos\n" +
            "INNER JOIN partidossdci.partido p on historialpartidos.partido_idpartido = p.idpartido", nativeQuery = true)
    List<HistorialPartidos> findAllPartidos();

    @Query(value = "SELECT * FROM historialpartidos\n" +
            "INNER JOIN partidossdci.partido p on historialpartidos.partido_idpartido = p.idpartido\n" +
            "WHERE p.equipoA = ?1 OR p.equipoB = ?1", nativeQuery = true)
    List<HistorialPartidos> findPartidoByEquipoId(Integer idEquipo);

}
