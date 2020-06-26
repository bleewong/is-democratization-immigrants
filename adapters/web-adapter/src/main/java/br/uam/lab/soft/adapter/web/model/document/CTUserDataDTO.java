package br.uam.lab.soft.adapter.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CTUserDataDTO {

    @JsonProperty("personal")
    private Personal personal;
    @JsonProperty("address")
    private Address address;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Personal {
        @JsonProperty("address")
        private String name;
        @JsonProperty("mom_name")
        private String momName;
        @JsonProperty("dad_name")
        private String dadName;
        @JsonProperty("email")
        private String email;
        @JsonProperty("declaration")
        private String declaration;
        @JsonProperty("cellphone")
        private String phone;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private String cep;
        private String address;
        private String complement;
        private String neighborhood;
        private String uf;
        private String ciudade;
    }

}
