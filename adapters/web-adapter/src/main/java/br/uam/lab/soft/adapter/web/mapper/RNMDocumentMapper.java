package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.document.RNMDocumentationDTO;
import br.uam.lab.soft.domain.documentation.RNMDocument;
import org.mapstruct.factory.Mappers;

public interface RNMDocumentMapper {

    RNMDocumentMapper INSTANCE = Mappers.getMapper(RNMDocumentMapper.class);

    RNMDocumentationDTO mapToModel(RNMDocument rnmDocument);

    RNMDocument mapToEntity(RNMDocumentationDTO rnmDocumentationDTO);

}
