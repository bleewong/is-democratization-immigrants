package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class RNMDocumentationDTO {

    @JsonProperty("type_doc")
    private String documentType;
    @JsonProperty("user")
    private RNMUserDataDTO user;
    @JsonProperty("registry_data")
    private RegistryDataDTO registryData;
    @JsonProperty("date_time")
    private DateTimeDTO dateTimeDTO;
    @JsonProperty("payment")
    private PaymentDTO paymentDTO;

}
