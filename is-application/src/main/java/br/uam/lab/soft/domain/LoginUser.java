package br.uam.lab.soft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LoginUser {

    private String email;
    private String userName;

    private List<Order> orderList;

    public static LoginUser of(final String email,
                               final String userName,
                               final List<Order> orders) {
        return new LoginUser(email, userName, orders);
    }

}
