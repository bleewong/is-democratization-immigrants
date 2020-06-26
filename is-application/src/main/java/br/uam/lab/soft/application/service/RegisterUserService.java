package br.uam.lab.soft.application.service;

import br.uam.lab.soft.application.exception.DuplicateUserException;
import br.uam.lab.soft.application.port.out.EncoderPort;
import br.uam.lab.soft.application.port.out.LoadUserPort;
import br.uam.lab.soft.application.port.out.SaveUserPort;
import br.uam.lab.soft.application.usecase.RegisterUserUseCase;
import br.uam.lab.soft.common.UseCase;
import br.uam.lab.soft.domain.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
public class RegisterUserService implements RegisterUserUseCase {
    private final SaveUserPort saveUserPort;
    private final LoadUserPort getUserQuery;
    private final EncoderPort encoderPort;

    @Override
    public boolean registerUser(RegisterUserCommand registerUserCommand) {
        // Validate if user exist
        if (getUserQuery.getUserByEmail(registerUserCommand.getEmail()) != null) {
            throw new DuplicateUserException("Usuário já existe");
        }

        return saveUserPort.saveUser(
                User.newUser(
                        registerUserCommand.getEmail(),
                        registerUserCommand.getCellphone(),
                        encoderPort.encode(registerUserCommand.getPassword())
                )
        );

    }
}
