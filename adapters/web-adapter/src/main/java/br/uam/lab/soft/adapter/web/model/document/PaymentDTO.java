package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    @JsonProperty("credit_number")
    private String creditNumber;
    @JsonProperty("expiration")
    private Expiration expiration;
    @JsonProperty("cvc")
    private String cvc;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Expiration {
        String month;
        String year;
    }

}
