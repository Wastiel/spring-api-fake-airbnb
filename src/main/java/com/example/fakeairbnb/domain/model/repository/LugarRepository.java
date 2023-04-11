package com.example.fakeairbnb.domain.model.repository;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LugarRepository extends JpaRepository <Lugar, Long>{

    //@Query("SELECT t FROM Lugar t WHERE t.ID >= :id")
    //List<Lugar> findAllReserva(@Param("id") long id);

    @Query("SELECT l FROM Lugar l WHERE l.id NOT IN (SELECT r.lugar.id FROM Reserva r WHERE (:dataInicial <= r.dataFim) AND (:dataFinal >= r.dataInicio))")
    List<Lugar> findLugaresNaoReservados(@Param("dataInicial") LocalDate dataInicial, @Param("dataFinal") LocalDate dataFinal);
}
