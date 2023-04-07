package com.example.fakeairbnb.api.Map;

import com.example.fakeairbnb.api.dto.LugarDTO;
import com.example.fakeairbnb.domain.model.entity.Lugar;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-07T18:14:41-0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LugarMapperImpl implements LugarMapper {

    @Override
    public Lugar map(LugarDTO lugarDTO) {
        if ( lugarDTO == null ) {
            return null;
        }

        Lugar lugar = new Lugar();

        lugar.setNome( lugarDTO.getNome() );
        lugar.setEndereco( lugarDTO.getEndereco() );
        lugar.setDescricao( lugarDTO.getDescricao() );
        lugar.setValor( lugarDTO.getValor() );

        return lugar;
    }

    @Override
    public List<LugarDTO> map(List<Lugar> lugarList) {
        if ( lugarList == null ) {
            return null;
        }

        List<LugarDTO> list = new ArrayList<LugarDTO>( lugarList.size() );
        for ( Lugar lugar : lugarList ) {
            list.add( map( lugar ) );
        }

        return list;
    }

    @Override
    public LugarDTO map(Lugar lugar) {
        if ( lugar == null ) {
            return null;
        }

        LugarDTO.LugarDTOBuilder lugarDTO = LugarDTO.builder();

        lugarDTO.nome( lugar.getNome() );
        lugarDTO.endereco( lugar.getEndereco() );
        lugarDTO.descricao( lugar.getDescricao() );
        lugarDTO.valor( lugar.getValor() );

        return lugarDTO.build();
    }
}
