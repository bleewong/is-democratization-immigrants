package br.uam.lab.soft.domain.documentation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RNMDocument {
    private String documentType;
    private RNMUserData user;
    private RegistryData registryData;
    private DateTime dateTimeDTO;
    private Payment paymentDTO;
}
