package br.uam.lab.soft.domain;

import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DateTime {

    private String deliveryDate;
    private String schedule;

    public static DateTime of(
            @NotNull final String deliveryDate,
            @NotNull final String schedule
    ) {
        return new DateTime(deliveryDate, schedule);
    }

}
