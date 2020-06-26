package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.document.CPFDocumentDTO;
import br.uam.lab.soft.domain.documentation.CPFDocument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CPFDocumentMapper {

    CPFDocumentMapper INSTANCE = Mappers.getMapper(CPFDocumentMapper.class);

    CPFDocumentDTO mapToModel(CPFDocument cpfDocument);

    CPFDocument mapToEntity(CPFDocumentDTO cpfDocumentationDTO);

}
