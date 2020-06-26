package br.uam.lab.soft.application.port.in;

import br.uam.lab.soft.domain.OperationType;

import java.util.List;

public interface GetOperationTypeQuery {

    List<OperationType> getAllOperationType();

}
