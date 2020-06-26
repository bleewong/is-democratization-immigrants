package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BUUserDataDTO {
    @JsonProperty("personal")
    private Personal personal;
    @JsonProperty("cpf")
    private Cpf cpf;
    @JsonProperty("rne")
    private Rne rne;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Personal {
        @JsonProperty("name")
        private String name;
        @JsonProperty("birthdate")
        private String birthDate;
        @JsonProperty("photo_id_size")
        private String photo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Cpf {
        @JsonProperty("number")
        private String number;
        @JsonProperty("type_cpf")
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rne {
        private String number;
        @JsonProperty("state_emission")
        private String state;
        @JsonProperty("date_issue")
        private String date;
    }

}
