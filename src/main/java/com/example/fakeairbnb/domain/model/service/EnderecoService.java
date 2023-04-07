package com.example.fakeairbnb.domain.model.service;

import com.example.fakeairbnb.domain.model.entity.Endereco;
import com.example.fakeairbnb.domain.model.exception.EnderecoNotFound;
import com.example.fakeairbnb.domain.model.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public List<Endereco> findAll(){
        return enderecoRepository.findAll();
    }
    public Endereco create(Endereco Endereco) {
        return enderecoRepository.save(Endereco);
    }
    public Endereco findById(Long id) {
        return enderecoRepository.findById(id).orElseThrow(() -> new EnderecoNotFound("O Endereco Solicitado nao existe"));
    }
    public Endereco update(Long id, Endereco endereco){
        enderecoRepository.findById(id).orElseThrow(() -> new EnderecoNotFound("O Endereco Solicitado nao existe"));
        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }
    public void delete(Long id) {
        enderecoRepository.deleteById(id);
    }
}
