package br.uam.lab.soft.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Order {

    private long orderId;
    private String nameOperation;
    private String registerDate;
    private String status;

    public static Order newOrder(String nameOperation, String registerDate, String status) {
        return new Order(0, nameOperation, registerDate, status);
    }

}
