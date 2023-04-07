package com.example.fakeairbnb.api.Map;

import com.example.fakeairbnb.api.dto.ReservaDTO;
import com.example.fakeairbnb.domain.model.entity.Reserva;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-06T23:22:09-0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ReservaMapperImpl implements ReservaMapper {

    @Override
    public Reserva map(ReservaDTO reservaDTO) {
        if ( reservaDTO == null ) {
            return null;
        }

        Reserva reserva = new Reserva();

        reserva.setInicio( reservaDTO.getInicio() );
        reserva.setFim( reservaDTO.getFim() );
        reserva.setLugar( reservaDTO.getLugar() );
        reserva.setObservacao( reservaDTO.getObservacao() );

        return reserva;
    }

    @Override
    public List<ReservaDTO> map(List<Reserva> reservaList) {
        if ( reservaList == null ) {
            return null;
        }

        List<ReservaDTO> list = new ArrayList<ReservaDTO>( reservaList.size() );
        for ( Reserva reserva : reservaList ) {
            list.add( map( reserva ) );
        }

        return list;
    }

    @Override
    public ReservaDTO map(Reserva reserva) {
        if ( reserva == null ) {
            return null;
        }

        ReservaDTO.ReservaDTOBuilder reservaDTO = ReservaDTO.builder();

        reservaDTO.inicio( reserva.getInicio() );
        reservaDTO.fim( reserva.getFim() );
        reservaDTO.lugar( reserva.getLugar() );
        reservaDTO.observacao( reserva.getObservacao() );

        return reservaDTO.build();
    }
}
