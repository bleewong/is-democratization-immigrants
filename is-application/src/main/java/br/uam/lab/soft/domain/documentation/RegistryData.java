package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistryData {

    private Visa visa;
    private TravelDocument travelDocument;
    private InputData inputData;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Visa {
        private String number;
        private String date;
        private String city;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TravelDocument {
        private String number;
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InputData {
        private String uf;
        private String place;
        private String conveyance;
        private String entryDate;
    }

}
