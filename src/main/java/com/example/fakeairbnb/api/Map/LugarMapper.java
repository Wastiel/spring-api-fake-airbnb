package com.example.fakeairbnb.api.Map;

import com.example.fakeairbnb.api.dto.LugarDTO;
import com.example.fakeairbnb.domain.model.entity.Lugar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LugarMapper {

    Lugar map(LugarDTO lugarDTO);
    List<LugarDTO> map(List<Lugar> lugarList);
    LugarDTO map(Lugar lugar);

}
