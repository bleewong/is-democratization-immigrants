package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.mapper.OperationStatusMapper;
import br.uam.lab.soft.adapter.web.model.OperationStatusDTO;
import br.uam.lab.soft.application.port.in.GetOperationStatusQuery;
import br.uam.lab.soft.common.WebAdapter;
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
@RequestMapping("/v1/operationStatus")
@RequiredArgsConstructor
public class GetOperationStatusController {

    private GetOperationStatusQuery getOperationStatusQuery;

    @GetMapping
    ResponseEntity<List<OperationStatusDTO>> getOperationStatus() {
        return new ResponseEntity(getOperationStatusQuery.getAllOperationStatus()
                .stream()
                .map(OperationStatusMapper.INSTANCE::mapToDomainModel)
                .collect(Collectors.toList()), HttpStatus.OK);
    }

}
