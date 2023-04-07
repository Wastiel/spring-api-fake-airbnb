package com.example.fakeairbnb.api.controller;


import com.example.fakeairbnb.api.dto.LugarDTO;
import com.example.fakeairbnb.api.Map.LugarMapper;
import com.example.fakeairbnb.domain.model.service.LugarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugar")
@AllArgsConstructor
public class LugarController {

    private LugarService lugarService;
    private LugarMapper lugarMapper;


    @GetMapping
    public ResponseEntity<List<LugarDTO>> findAll() {
          return ResponseEntity.ok(lugarMapper.map(lugarService.findAll()));
    }
    @PostMapping
    public ResponseEntity<LugarDTO> create(@RequestBody LugarDTO lugarDTO) {
        return ResponseEntity.ok(lugarMapper.map(lugarService.create(lugarMapper.map(lugarDTO))));
    }
    @GetMapping("/{id}")
    public ResponseEntity<LugarDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(lugarMapper.map(lugarService.findById(id)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {lugarService.delete(id);
    return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<LugarDTO> update(@PathVariable Long id, @RequestBody LugarDTO lugarDTO) {
        return ResponseEntity.ok(lugarMapper.map(lugarService.update(id, lugarMapper.map(lugarDTO))));
    }

}