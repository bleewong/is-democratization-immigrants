package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CPFDocument {
    private String documentType;
    private CPFUserData user;
    private DateTime dateTime;
    private Payment payment;

}
