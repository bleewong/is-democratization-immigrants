package br.uam.lab.soft.adapter.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OperationTypeDTO {

    private long operationId;
    private String operationName;
    private String abbreviation;

}
