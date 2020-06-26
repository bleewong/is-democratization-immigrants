package br.uam.lab.soft.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {
    @Getter private final String email;
    @Getter private final String phoneNumber;
    @Getter private final String password;
    @Getter private final String createdDate;

    public static User newUser(String email, String phoneNumber, String password) {
        return new User(email, phoneNumber, password, new Date().toString());
    }

}
