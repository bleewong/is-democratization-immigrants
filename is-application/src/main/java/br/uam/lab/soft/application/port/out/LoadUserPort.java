package br.uam.lab.soft.application.port.out;

import br.uam.lab.soft.domain.User;

public interface LoadUserPort {

    User getUserByEmail(String email);

}
