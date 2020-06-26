package br.uam.lab.soft.adapter.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import br.uam.lab.soft.adapter.web.mapper.OperationTypeMapper;
import br.uam.lab.soft.application.port.in.GetOperationTypeQuery;
import br.uam.lab.soft.common.WebAdapter;
import br.uam.lab.soft.domain.OperationType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@WebAdapter
@RestController
@RequestMapping("/v1/operationTypes")
@RequiredArgsConstructor
public class GetOperationTypeController {

    private GetOperationTypeQuery getOperationTypeQuery;

    @GetMapping
    ResponseEntity<List<OperationType>> getOperationTypes() {
        return new ResponseEntity(getOperationTypeQuery
                .getAllOperationType()
                .stream()
                .map(OperationTypeMapper.INSTANCE::mapToDomainModel)
                .collect(Collectors.toList()), HttpStatus.OK
        );
    }

}
