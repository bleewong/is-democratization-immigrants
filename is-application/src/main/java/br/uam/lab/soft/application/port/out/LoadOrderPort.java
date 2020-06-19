package br.uam.lab.soft.application.port.out;

public interface LoadOrderPort {

    List<Order> getAllOrdersByUserId(String userId);

}
