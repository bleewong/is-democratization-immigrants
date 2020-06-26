package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CTDocument {
    private String documentType;
    private CTUserData user;
    private DateTime dateTime;
    private Payment payment;

}
