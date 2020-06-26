package br.uam.lab.soft.adapter.web.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class LoginRequest {

    private String email;
    private String password;

}
