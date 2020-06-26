package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.document.CTDocumentDTO;
import br.uam.lab.soft.domain.documentation.CTDocument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CTDocumentMapper {

    CTDocumentMapper INSTANCE = Mappers.getMapper(CTDocumentMapper.class);

    CTDocumentDTO mapToDomain(CTDocument ctDocument);

    CTDocument mapToEntity(CTDocumentDTO ctDocumentationDTO);

}
