package com.example.fakeairbnb.api.controller;


import com.example.fakeairbnb.api.Map.ReservaMapper;
import com.example.fakeairbnb.api.dto.ReservaDTO;
import com.example.fakeairbnb.domain.model.entity.Reserva;
import com.example.fakeairbnb.domain.model.service.ReservaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
@AllArgsConstructor
public class ReservaController {

    private ReservaService reservaService;
    private ReservaMapper reservaMapper;


    @GetMapping
    public ResponseEntity<List<ReservaDTO>> findAll() {
        return ResponseEntity.ok(reservaMapper.map(reservaService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(reservaMapper.map(reservaService.findById(id)));
    }
    @PostMapping
    public ResponseEntity<ReservaDTO> create(@RequestBody ReservaDTO ReservaDTO) {
        return ResponseEntity.ok(reservaMapper.map(reservaService.create(reservaMapper.map(ReservaDTO))));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ReservaDTO> update(@PathVariable Long id, @RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaMapper.map(reservaService.update(id, reserva)));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {reservaService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
