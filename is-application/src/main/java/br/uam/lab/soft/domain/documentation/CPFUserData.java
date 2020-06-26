package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CPFUserData {

    private PersonalData personal;
    private Address address;
    private Complementary complementary;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PersonalData {
        private String userName;
        private String gender;
        private String birthDate;
        private String email;
        private String cellphone;
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
        private String departureDate;
        private String motive;
    }

}
