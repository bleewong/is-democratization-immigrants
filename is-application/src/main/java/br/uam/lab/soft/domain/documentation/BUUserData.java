package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BUUserData {

    private Personal personal;
    private Cpf cpf;
    private Rne rne;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Personal {
        private String name;
        private String birthDate;
        private String photo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Cpf {
        private String number;
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rne {
        private String number;
        private String state;
        private String date;
    }

}
