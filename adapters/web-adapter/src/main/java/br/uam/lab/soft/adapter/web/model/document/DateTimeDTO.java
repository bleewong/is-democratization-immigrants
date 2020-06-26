package br.uam.lab.soft.adapter.web.model.document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DateTimeDTO {

    @JsonProperty("date_delivery")
    private String deliveryDate;
    @JsonProperty("shedule")
    private String schedule;

}
