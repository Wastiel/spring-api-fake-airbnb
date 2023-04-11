package com.example.fakeairbnb.api.controller;

import com.example.fakeairbnb.api.Form.EnderecoForm;
import com.example.fakeairbnb.api.Map.EnderecoMapper;
import com.example.fakeairbnb.api.dto.EnderecoDTO;
import com.example.fakeairbnb.domain.model.service.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoController {

    private EnderecoService enderecoService;
    private EnderecoMapper enderecoMapper;

    @GetMapping
    public ResponseEntity<List<EnderecoDTO>> findAll() {
        return ResponseEntity.ok(enderecoMapper.map(enderecoService.findAll()));
    }
    @GetMapping("/{id}")
    public ResponseEntity<EnderecoDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(enderecoMapper.map(enderecoService.findById(id)));
    }
    @PostMapping
    public ResponseEntity<EnderecoDTO> create(@RequestBody @Validated EnderecoForm enderecoForm){
        return ResponseEntity.ok(enderecoMapper.map(enderecoService.create(enderecoMapper.map(enderecoForm))));
    }
    @PutMapping("/{id}")
    public ResponseEntity<EnderecoDTO> update(@PathVariable Long id, @RequestBody @Validated EnderecoForm enderecoForm) {
        return ResponseEntity.ok(enderecoMapper.map(enderecoService.update(id, enderecoMapper.map(enderecoForm))));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        enderecoService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
