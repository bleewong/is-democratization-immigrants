package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.OperationType;

import java.util.List;

public interface LoadOperationTypePort {

    List<OperationType> getAllOperationType();

}
