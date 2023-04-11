package com.example.fakeairbnb.api.Map;

import com.example.fakeairbnb.api.Form.EnderecoForm;
import com.example.fakeairbnb.api.dto.EnderecoDTO;
import com.example.fakeairbnb.domain.model.entity.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper {

    Endereco map(EnderecoDTO enderecoDTO);
    List<EnderecoDTO> map(List<Endereco> enderecoList);
    EnderecoDTO map(Endereco endereco);
    Endereco map(EnderecoForm enderecoForm);

}
