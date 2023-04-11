package com.example.fakeairbnb.api.Map;

import com.example.fakeairbnb.api.Form.ReservaForm;
import com.example.fakeairbnb.api.dto.ReservaDTO;
import com.example.fakeairbnb.domain.model.entity.Reserva;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReservaMapper {

    Reserva map(ReservaDTO reservaDTO);
    List<ReservaDTO> map(List<Reserva> reservaList);
    ReservaDTO map(Reserva reserva);
    Reserva map(ReservaForm reservaForm);
}
