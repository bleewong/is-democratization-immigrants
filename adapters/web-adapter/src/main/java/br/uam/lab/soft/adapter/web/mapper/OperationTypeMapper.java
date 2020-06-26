package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.OperationTypeDTO;
import br.uam.lab.soft.domain.OperationType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperationTypeMapper {

    public static final OperationTypeMapper INSTANCE =
            Mappers.getMapper(OperationTypeMapper.class);

    @Mappings({
            @Mapping(source = "id.value", target = "operationId"),
            @Mapping(source = "name", target = "operationName"),
            @Mapping(source = "abbreviation", target = "abbreviation")
    })
    OperationTypeDTO mapToDomainModel(OperationType operationType);

    @Mappings({
            @Mapping(source = "operationId", target = "id.value"),
            @Mapping(source = "operationName", target = "name"),
            @Mapping(source = "abbreviation", target = "abbreviation")
    })
    OperationType mapToEntity(OperationTypeDTO operationTypeDTO);

}
