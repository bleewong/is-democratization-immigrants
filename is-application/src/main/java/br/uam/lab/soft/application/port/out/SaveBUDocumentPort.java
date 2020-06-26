package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.documentation.BUDocument;

public interface SaveBUDocumentPort {

    boolean saveBUDocument(BUDocument buDocument);

}
