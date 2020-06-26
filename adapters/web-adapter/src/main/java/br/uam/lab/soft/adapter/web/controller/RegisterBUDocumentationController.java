package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.mapper.BUDocumentMapper;
import br.uam.lab.soft.adapter.web.model.document.BUDocumentDTO;
import br.uam.lab.soft.application.usecase.RegisterBUDocumentUseCase;
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
public class RegisterBUDocumentationController {

    private final RegisterBUDocumentUseCase registerBUDocumentUseCase;

    @PostMapping("/bud")
    ResponseEntity registerBUDDocumentationProcess(@RequestBody BUDocumentDTO buDocumentationDTO) {
        registerBUDocumentUseCase.registerBUDocument(
                BUDocumentMapper.INSTANCE.mapToEntity(buDocumentationDTO));
        return ResponseEntity.ok().build();
    }

}
