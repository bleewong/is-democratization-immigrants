package br.uam.lab.soft.application.service;

import br.uam.lab.soft.application.port.out.SaveBUDocumentPort;
import br.uam.lab.soft.application.port.out.SaveOrderPort;
import br.uam.lab.soft.application.usecase.RegisterBUDocumentUseCase;
import br.uam.lab.soft.common.UseCase;
import br.uam.lab.soft.domain.OperationStatus;
import br.uam.lab.soft.domain.Order;
import br.uam.lab.soft.domain.documentation.BUDocument;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@UseCase
public class RegisterBUDocumentService implements RegisterBUDocumentUseCase {

    private final SaveBUDocumentPort saveBUDocumentPort;
    private final SaveOrderPort saveOrderPort;

    @Override
    public boolean registerBUDocument(BUDocument buDocument) {
        if (saveBUDocumentPort.saveBUDocument(buDocument)) {
            return saveOrderPort.saveOrder(Order.newOrder("",
                    new Date().toString(),
                    OperationStatus.Status.SD.getAbbreviation()));
        }
        return false;
    }

}
