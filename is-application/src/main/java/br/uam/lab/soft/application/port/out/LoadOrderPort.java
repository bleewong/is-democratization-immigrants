package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.Order;

import java.util.List;

public interface LoadOrderPort {

    List<Order> getAllOrdersByUserId(String userId);

}
