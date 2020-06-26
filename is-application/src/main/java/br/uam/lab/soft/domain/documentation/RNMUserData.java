package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RNMUserData {

    private Personal personal;
    private FamilyData familyData;
    private BirthdayData birthData;
    private Complement complement;
    private Address address;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Personal {
        private String name;
        private String birthDate;
        private String email;
        private String gender;
        private String status;
        private String occupation;
        private String colorPhoto;
        private String whitePhoto;
        private String birthCertificate;
        private String declaration;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FamilyData {
        private String dadName;
        private String dadGender;
        private String momName;
        private String momGender;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BirthdayData {
        private String city;
        private String country;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Complement {
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
