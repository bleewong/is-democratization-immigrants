package br.uam.lab.soft.adapter.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "operation_status")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OperationStatusEntity {

    @Transient
    public static final String SEQUENCE_NAME = "opStatus_sequence";

    @Id
    private long id;
    private String name;

}
