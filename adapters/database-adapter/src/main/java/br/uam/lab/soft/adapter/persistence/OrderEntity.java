package br.uam.lab.soft.adapter.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderEntity {
    @Transient
    public static final String SEQUENCE_NAME = "orders_sequence";

    @Id
    private long orderId;
    private String operationType;
    private String userId;
    private String status;
    private Date registerDate;

}
