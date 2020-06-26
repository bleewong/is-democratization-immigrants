package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.Order;

public interface SaveOrderPort {

    boolean saveOrder(Order order);

}
