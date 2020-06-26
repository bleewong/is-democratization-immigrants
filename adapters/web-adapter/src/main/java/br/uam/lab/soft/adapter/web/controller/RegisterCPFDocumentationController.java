package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.mapper.CPFDocumentMapper;
import br.uam.lab.soft.adapter.web.model.document.CPFDocumentDTO;
import br.uam.lab.soft.application.usecase.RegisterCPFDocumentUseCase;
import br.uam.lab.soft.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequestMapping("/v1/documentation")
@RequiredArgsConstructor
public class RegisterCPFDocumentationController {

    private final RegisterCPFDocumentUseCase registerCPFDocumentUseCase;

    @PostMapping("/cpf")
    ResponseEntity registerCpfDocumentProcess(@RequestBody CPFDocumentDTO cpfDocumentationDTO) {
        registerCPFDocumentUseCase.registerCPFDocument(
                CPFDocumentMapper.INSTANCE.mapToEntity(cpfDocumentationDTO));
        return ResponseEntity.ok().build();
    }

}
