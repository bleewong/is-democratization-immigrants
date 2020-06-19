package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistryDataDTO {

    @JsonProperty("visa")
    private Visa visa;
    @JsonProperty("travel_document")
    private TravelDocument travelDocument;
    @JsonProperty("input_data")
    private InputData inputData;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Visa {
        @JsonProperty("number")
        private String number;
        @JsonProperty("grand_date")
        private String date;
        @JsonProperty("city_granted")
        private String city;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TravelDocument {
        @JsonProperty("number")
        private String number;
        @JsonProperty("type")
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InputData {
        private String uf;
        @JsonProperty("entrance_place")
        private String place;
        @JsonProperty("conveyance")
        private String conveyance;
        @JsonProperty("entry_date")
        private String entryDate;
    }

}
