package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.document.BUDocumentDTO;
import br.uam.lab.soft.domain.documentation.BUDocument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BUDocumentMapper {

    BUDocumentMapper INSTANCE = Mappers.getMapper(BUDocumentMapper.class);

    BUDocumentDTO mapToModel(BUDocument buDocument);

    BUDocument mapToEntity(BUDocumentDTO buDocumentationDTO);

}
