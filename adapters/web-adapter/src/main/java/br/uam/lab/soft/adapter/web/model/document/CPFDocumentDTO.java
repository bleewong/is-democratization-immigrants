package br.uam.lab.soft.adapter.web.model.document;

import br.uam.lab.soft.domain.DateTime;
import br.uam.lab.soft.domain.documentation.Payment;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CPFDocumentDTO {

    @JsonProperty("type_doc")
    private String documentType;
    @JsonProperty("user")
    private CPFUserDataDTO user;
    @JsonProperty("date_time")
    private DateTime dateTime;
    @JsonProperty("payment")
    private Payment payment;

}
