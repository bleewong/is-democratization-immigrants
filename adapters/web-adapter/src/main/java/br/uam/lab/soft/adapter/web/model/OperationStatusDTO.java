package br.uam.lab.soft.adapter.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OperationStatusDTO {

    private long id;
    private String name;
    private String abbreviation;

}
