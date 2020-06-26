package br.uam.lab.soft.application.service;

import br.uam.lab.soft.application.port.in.GetOperationTypeQuery;
import br.uam.lab.soft.application.port.out.LoadOperationTypePort;
import br.uam.lab.soft.common.UseCase;
import br.uam.lab.soft.domain.OperationType;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@UseCase
public class GetOperationTypeService implements GetOperationTypeQuery {

    private final LoadOperationTypePort loadOperationTypePort;

    @Override
    public List<OperationType> getAllOperationType() {
        return loadOperationTypePort.getAllOperationType();
    }

}
