package br.uam.lab.soft.application.service;

import br.uam.lab.soft.application.exception.UserNotFoundException;
import br.uam.lab.soft.application.port.out.EncoderPort;
import br.uam.lab.soft.application.port.out.LoadOrderPort;
import br.uam.lab.soft.application.port.out.LoadUserPort;
import br.uam.lab.soft.application.usecase.LoginUserUseCase;
import br.uam.lab.soft.common.UseCase;
import br.uam.lab.soft.domain.LoginUser;
import br.uam.lab.soft.domain.Order;
import br.uam.lab.soft.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@UseCase
public class LoginUserService implements LoginUserUseCase {

    private final LoadUserPort loadUserPort;
    private final LoadOrderPort loadOrderPort;
    private final EncoderPort encoderPort;

    @Override
    public LoginUser loginUser(LoginUserCommand command) {
        final User loadUser = loadUserPort.getUserByEmail(command.getEmail());
        if (loadUser == null) {
            throw new UserNotFoundException("Usuario ou password errado");
        }
        if (!encoderPort.matches(command.getPassword(), loadUser.getPassword())) {
            throw new UserNotFoundException("Usuario ou password errado");

        }
        List<Order> orderList = loadOrderPort.getAllOrdersByUserId(command.getEmail());
        return LoginUser.of(loadUser.getEmail(), loadUser.getPhoneNumber(), orderList);
    }

}
