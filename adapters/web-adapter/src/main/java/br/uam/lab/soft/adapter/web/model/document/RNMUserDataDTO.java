package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RNMUserDataDTO {

    @JsonProperty("personal")
    private Personal personal;
    @JsonProperty("data_parents")
    private FamilyData familyData;
    @JsonProperty("birth_data")
    private BirthdayData birthData;
    @JsonProperty("complement")
    private Complement complement;
    @JsonProperty("address")
    private Address address;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Personal {
        private String name;
        private String birthDate;
        private String email;
        private String gender;
        @JsonProperty("marital_status")
        private String status;
        private String occupation;
        @JsonProperty("color_photo")
        private String colorPhoto;
        @JsonProperty("white_photo")
        private String whitePhoto;
        @JsonProperty("birth_certificate")
        private String birthCertificate;
        @JsonProperty("sworn_declaration")
        private String declaration;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FamilyData {
        @JsonProperty("dad_name")
        private String dadName;
        @JsonProperty("gender_dad")
        private String dadGender;
        @JsonProperty("mom_name")
        private String momName;
        @JsonProperty("gender_mom")
        private String momGender;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BirthdayData {
        @JsonProperty("city_birth")
        private String city;
        @JsonProperty("country_nationality")
        private String country;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Complement {
        @JsonProperty("physical_disability")
        String disability;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private String cep;
        private String complement;
        private String city;
        private String street;
        private String neighborhood;
    }

}
