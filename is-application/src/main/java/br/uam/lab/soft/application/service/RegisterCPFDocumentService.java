package br.uam.lab.soft.application.service;

import br.uam.lab.soft.application.port.out.SaveCPFDocumentPort;
import br.uam.lab.soft.application.port.out.SaveOrderPort;
import br.uam.lab.soft.application.usecase.RegisterCPFDocumentUseCase;
import br.uam.lab.soft.common.UseCase;
import br.uam.lab.soft.domain.OperationStatus;
import br.uam.lab.soft.domain.Order;
import br.uam.lab.soft.domain.documentation.CPFDocument;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@UseCase
public class RegisterCPFDocumentService implements RegisterCPFDocumentUseCase {

    private final SaveOrderPort saveOrderPort;
    private final SaveCPFDocumentPort saveCPFDocumentPort;

    @Override
    public boolean registerCPFDocument(CPFDocument cpfDocument) {
        if (saveCPFDocumentPort.saveCPFDocument(cpfDocument)) {
            return saveOrderPort.saveOrder(Order.newOrder("",
                    new Date().toString(),
                    OperationStatus.Status.SD.getAbbreviation()));
        }
        return false;
    }

}
