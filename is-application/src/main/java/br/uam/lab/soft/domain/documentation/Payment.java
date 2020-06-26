package br.uam.lab.soft.domain.documentation;

import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    private String creditNumber;
    private String expirationMonth;
    private String expirationYear;
    private String cvc;

    public static Payment of(
            @NotNull final String creditNumber,
            @NotNull final String expirationMonth,
            @NotNull final String expirationYear,
            @NotNull final String cvc) {
        return new Payment(creditNumber, expirationMonth, expirationYear, cvc);
    }

}
