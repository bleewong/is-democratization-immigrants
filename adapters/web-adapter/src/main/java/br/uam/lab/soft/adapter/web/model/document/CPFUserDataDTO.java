package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CPFUserDataDTO {

    @JsonProperty("")
    private PersonalData personal;
    @JsonProperty("")
    private Address address;
    @JsonProperty("")
    private Complementary complementary;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PersonalData {
        @JsonProperty("name_user")
        private String userName;
        @JsonProperty("gender")
        private String gender;
        @JsonProperty("birthdate")
        private String birthDate;
        @JsonProperty("email")
        private String email;
        @JsonProperty("cellphone")
        private String cellphone;
        @JsonProperty("mom_mame")
        private String momName;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private String number;
        private String complement;
        private String city;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Complementary {
        @JsonProperty("departure_date")
        private String departureDate;
        @JsonProperty("prenchimento_motive")
        private String motive;
    }

}
