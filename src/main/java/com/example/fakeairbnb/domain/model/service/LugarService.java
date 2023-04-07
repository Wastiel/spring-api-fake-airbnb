package com.example.fakeairbnb.domain.model.service;

import com.example.fakeairbnb.domain.model.entity.Lugar;
import com.example.fakeairbnb.domain.model.exception.EnderecoNotFound;
import com.example.fakeairbnb.domain.model.exception.LugarNotFound;
import com.example.fakeairbnb.domain.model.repository.LugarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LugarService {

    private final LugarRepository lugarRepository;

    public List<Lugar> findAll(){
        return lugarRepository.findAll();
    }

    public Lugar create(Lugar lugar) {
        return lugarRepository.save(lugar);
    }
    public Lugar findById(Long id) {
        return lugarRepository.findById(id).orElseThrow(() -> new LugarNotFound("O Lugar solicitado nao existe"));
    }

    public Lugar update(long id, Lugar lugar){
        Lugar lugardb = findById(id);

        if(lugar.getNome() != null){
            lugardb.setNome(lugar.getNome());
        }
        return lugarRepository.save(lugardb);

    }

    public void delete(Long id) {
        lugarRepository.deleteById(id);
    }
}
