package br.uam.lab.soft.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperationType {

    private OperationTypeId id;
    private String name;
    private String abbreviation;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class OperationTypeId {
        private long value;
    }

}
