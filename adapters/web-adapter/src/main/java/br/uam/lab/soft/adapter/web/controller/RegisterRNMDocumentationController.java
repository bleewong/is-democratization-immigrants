package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.mapper.RNMDocumentMapper;
import br.uam.lab.soft.adapter.web.model.document.RNMDocumentationDTO;
import br.uam.lab.soft.application.usecase.RegisterRNMDocumentUseCase;
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
public class RegisterRNMDocumentationController {

    private final RegisterRNMDocumentUseCase registerRNMDocumentUseCase;

    @PostMapping("/rnm")
    ResponseEntity registerRNMDocumentationProcess(@RequestBody RNMDocumentationDTO rnmDocumentationDTO) {
        registerRNMDocumentUseCase.registerRNMDocument(
                RNMDocumentMapper.INSTANCE.mapToEntity(rnmDocumentationDTO));
        return ResponseEntity.ok().build();
    }

}
