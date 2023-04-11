package com.example.fakeairbnb.api.Map;

import com.example.fakeairbnb.api.dto.EnderecoDTO;
import com.example.fakeairbnb.domain.model.entity.Endereco;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-10T19:30:52-0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class EnderecoMapperImpl implements EnderecoMapper {

    @Override
    public Endereco map(EnderecoDTO enderecoDTO) {
        if ( enderecoDTO == null ) {
            return null;
        }

        Endereco endereco = new Endereco();

        endereco.setId( enderecoDTO.getId() );
        endereco.setPais( enderecoDTO.getPais() );
        endereco.setEstado( enderecoDTO.getEstado() );
        endereco.setCidade( enderecoDTO.getCidade() );
        endereco.setRua( enderecoDTO.getRua() );
        endereco.setNumero( enderecoDTO.getNumero() );
        endereco.setComplemento( enderecoDTO.getComplemento() );

        return endereco;
    }

    @Override
    public List<EnderecoDTO> map(List<Endereco> enderecoList) {
        if ( enderecoList == null ) {
            return null;
        }

        List<EnderecoDTO> list = new ArrayList<EnderecoDTO>( enderecoList.size() );
        for ( Endereco endereco : enderecoList ) {
            list.add( map( endereco ) );
        }

        return list;
    }

    @Override
    public EnderecoDTO map(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        EnderecoDTO.EnderecoDTOBuilder enderecoDTO = EnderecoDTO.builder();

        enderecoDTO.id( endereco.getId() );
        enderecoDTO.pais( endereco.getPais() );
        enderecoDTO.estado( endereco.getEstado() );
        enderecoDTO.cidade( endereco.getCidade() );
        enderecoDTO.rua( endereco.getRua() );
        enderecoDTO.numero( endereco.getNumero() );
        enderecoDTO.complemento( endereco.getComplemento() );

        return enderecoDTO.build();
    }
}
