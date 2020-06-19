package br.uam.lab.soft.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {
    private static UserId DEFAULT_VALUE = new UserId(0L);

    private final UserId userId;
    private String email;
    private String phoneNumber;
    private String name;

    public static User toRegister(
            @NotNull String email,
            @NotNull String phoneNumber,
            @NotNull String name) {
        return new User(DEFAULT_VALUE,
                email,
                phoneNumber,
                name
        );
    }

    @Value
    @AllArgsConstructor
    public static class UserId {
        private Long id;
    }

}
