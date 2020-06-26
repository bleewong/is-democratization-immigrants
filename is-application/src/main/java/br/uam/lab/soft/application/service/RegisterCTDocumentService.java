package br.uam.lab.soft.application.service;

import br.uam.lab.soft.application.port.out.SaveCTDocumentPort;
import br.uam.lab.soft.application.port.out.SaveOrderPort;
import br.uam.lab.soft.application.usecase.RegisterCTDocumentUseCase;
import br.uam.lab.soft.domain.OperationStatus;
import br.uam.lab.soft.domain.Order;
import br.uam.lab.soft.domain.documentation.CTDocument;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
public class RegisterCTDocumentService implements RegisterCTDocumentUseCase {

    private final SaveCTDocumentPort saveCTDocumentPort;
    private final SaveOrderPort saveOrderPort;

    @Override
    public boolean registerCTDocument(CTDocument ctDocument) {
        if (saveCTDocumentPort.saveCTDocument(ctDocument)) {
            return saveOrderPort.saveOrder(Order.newOrder("",
                    new Date().toString(),
                    OperationStatus.Status.SD.getAbbreviation()));
        }
        return false;
    }

}
