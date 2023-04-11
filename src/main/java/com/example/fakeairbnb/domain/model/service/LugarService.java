package com.example.fakeairbnb.domain.model.service;

import com.example.fakeairbnb.domain.model.entity.Endereco;
import com.example.fakeairbnb.domain.model.entity.Lugar;
import com.example.fakeairbnb.domain.model.exception.EnderecoNotFound;
import com.example.fakeairbnb.domain.model.exception.LugarNotFound;
import com.example.fakeairbnb.domain.model.repository.EnderecoRepository;
import com.example.fakeairbnb.domain.model.repository.LugarRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class LugarService {

    private final LugarRepository lugarRepository;
    private final EnderecoRepository enderecoRepository;

    public List<Lugar> findAll(){
        return lugarRepository.findAll();
    }
    public Lugar create(Lugar lugar) {
        lugar.setEndereco(enderecoRepository.findById(lugar.getEndereco().getId()).orElseThrow(() -> new EnderecoNotFound("O endereco que estas tentando cadastrar nao existe no sistema")));
        return lugarRepository.save(lugar);
    }

    public Lugar findById(Long id) {
        return lugarRepository.findById(id).orElseThrow(() -> new LugarNotFound("O Lugar solicitado nao existe"));
    }

    public Lugar update(long id, Lugar lugar){
        lugarRepository.findById(id).orElseThrow(() -> new LugarNotFound("O Lugar solicitado nao existe"));
        lugar.setId(id);
        return lugarRepository.save(lugar);

    }
    public void delete(Long id) {
        lugarRepository.deleteById(id);
    }

    public List<Lugar> findUnreservedPlaces(LocalDate dataInicial, LocalDate dataFinal) {
        return lugarRepository.findLugaresNaoReservados(dataInicial, dataFinal);
    }
}
