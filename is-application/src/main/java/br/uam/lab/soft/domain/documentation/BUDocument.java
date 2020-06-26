package br.uam.lab.soft.domain.documentation;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BUDocument {
    private String documentType;
    private BUUserData user;
    private DateTime dateTime;
    private Payment payment;

}
