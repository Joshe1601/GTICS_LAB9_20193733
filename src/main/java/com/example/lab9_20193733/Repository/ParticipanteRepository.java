package com.example.lab9_20193733.Repository;

import com.example.lab9_20193733.Entity.Participante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {


}
