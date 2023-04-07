package com.example.fakeairbnb.domain.model.service;

import com.example.fakeairbnb.domain.model.entity.Reserva;
import com.example.fakeairbnb.domain.model.exception.EnderecoNotFound;
import com.example.fakeairbnb.domain.model.exception.ReservaNotFound;
import com.example.fakeairbnb.domain.model.repository.ReservaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservaService {
    private final ReservaRepository reservaRepository;

    public List<Reserva> findAll(){
        return reservaRepository.findAll();
    }

    public Reserva create(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva findById(Long id) {
        return reservaRepository.findById(id).orElseThrow(() -> new ReservaNotFound("A Reserva solicitada nao se encontra no sistema"));
    }
    public Reserva update(Long id, Reserva reserva){
        Reserva reservadb = findById(id);
        return reservaRepository.save(reservadb);
    }
    public void delete(Long id) {
        reservaRepository.deleteById(id);
    }
}

