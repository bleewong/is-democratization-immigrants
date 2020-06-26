package br.uam.lab.soft.application.port.in;

import br.uam.lab.soft.domain.OperationStatus;

import java.util.List;

public interface GetOperationStatusQuery {

    List<OperationStatus> getAllOperationStatus();

}
