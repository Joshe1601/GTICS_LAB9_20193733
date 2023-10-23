package com.example.lab9_20193733.Repository;

import com.example.lab9_20193733.Entity.HistorialPartidos;
import com.example.lab9_20193733.Entity.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer> {

}
