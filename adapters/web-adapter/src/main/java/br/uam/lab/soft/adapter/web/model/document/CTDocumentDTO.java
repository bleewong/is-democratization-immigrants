package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CTDocumentDTO {
    @JsonProperty("type_doc")
    private String documentType;
    @JsonProperty("user")
    private CTUserDataDTO user;
    @JsonProperty("date_time")
    private DateTimeDTO dateTime;
    @JsonProperty("payment")
    private PaymentDTO payment;

}
