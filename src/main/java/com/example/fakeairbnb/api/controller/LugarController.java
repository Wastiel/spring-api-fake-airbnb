package com.example.fakeairbnb.api.controller;


import com.example.fakeairbnb.api.Form.LugarForm;
import com.example.fakeairbnb.api.dto.LugarDTO;
import com.example.fakeairbnb.api.Map.LugarMapper;
import com.example.fakeairbnb.domain.model.entity.Lugar;
import com.example.fakeairbnb.domain.model.service.LugarService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    @GetMapping("/findUnreservedPlaces")
    public List<Lugar> getLugaresNaoReservados(@RequestParam("dataInicial") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataInicial,
                                               @RequestParam("dataFinal") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataFinal) {
        return lugarService.findUnreservedPlaces(dataInicial, dataFinal);
    }
    public ResponseEntity<LugarDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(lugarMapper.map(lugarService.findById(id)));
    }
    @PostMapping
    public ResponseEntity<LugarDTO> create(@RequestBody @Validated LugarForm lugarForm) {
        return ResponseEntity.ok(lugarMapper.map(lugarService.create(lugarMapper.map(lugarForm))));
    }
    @PutMapping("/{id}")
    public ResponseEntity<LugarDTO> update(@PathVariable Long id, @RequestBody @Validated LugarForm lugarForm) {
        return ResponseEntity.ok(lugarMapper.map(lugarService.update(id, lugarMapper.map(lugarForm))));
    }
    @GetMapping("/{id}")

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {lugarService.delete(id);
    return ResponseEntity.status(HttpStatus.OK).build();
    }


}
