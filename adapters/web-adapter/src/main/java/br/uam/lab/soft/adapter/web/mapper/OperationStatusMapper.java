package br.uam.lab.soft.adapter.web.mapper;

import br.uam.lab.soft.adapter.web.model.OperationStatusDTO;
import br.uam.lab.soft.domain.OperationStatus;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

public interface OperationStatusMapper {

    public static final OperationStatusMapper INSTANCE =
            Mappers.getMapper(OperationStatusMapper.class);

    @Mappings({
            @Mapping(source = "id.value", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "abbreviation", target = "abbreviation")
    })
    OperationStatusDTO mapToDomainModel(OperationStatus operationStatus);

    @Mappings({
            @Mapping(source = "id", target = "id.value"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "abbreviation", target = "abbreviation")
    })
    OperationStatus mapToEntity(OperationStatusDTO operationStatusDTO);

}
