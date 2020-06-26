package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CTUserData {

    private Personal personal;
    private Address address;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Personal {
        private String name;
        private String momName;
        private String dadName;
        private String email;
        private String declaration;
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
