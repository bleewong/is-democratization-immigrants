package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.documentation.CPFDocument;

public interface SaveCPFDocumentPort {

    boolean saveCPFDocument(CPFDocument cpfdOcument);

}
