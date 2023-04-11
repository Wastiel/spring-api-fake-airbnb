package com.example.fakeairbnb.domain.model.repository;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import com.example.fakeairbnb.domain.model.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    @Query("SELECT r FROM Reserva r WHERE ((:dataInicial <= r.dataFim) AND (:dataFinal >= r.dataInicio)) and r.lugar.id = :id")
    Reserva lugarLivre(@Param("dataInicial") LocalDate dataInicial, @Param("dataFinal") LocalDate dataFinal,@Param("id") long id );

}
