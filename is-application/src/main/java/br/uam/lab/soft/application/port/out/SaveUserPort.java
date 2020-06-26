package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.User;

public interface SaveUserPort {

    boolean saveUser(User user);

}
