package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.mapper.CTDocumentMapper;
import br.uam.lab.soft.adapter.web.model.document.CTDocumentDTO;
import br.uam.lab.soft.application.usecase.RegisterCTDocumentUseCase;
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
public class RegisterCTDocumentationController {

    private final RegisterCTDocumentUseCase registerCTDocumentUseCase;

    @PostMapping("/ct")
    ResponseEntity registerCTDocumentProcess(@RequestBody CTDocumentDTO ctDocumentationDTO) {
        registerCTDocumentUseCase.registerCTDocument(
                CTDocumentMapper.INSTANCE.mapToEntity(ctDocumentationDTO));
        return ResponseEntity.ok().build();
    }

}
