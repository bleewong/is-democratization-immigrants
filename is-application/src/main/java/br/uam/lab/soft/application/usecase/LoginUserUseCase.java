package br.uam.lab.soft.application.usecase;

import br.uam.lab.soft.common.SelfValidation;
import br.uam.lab.soft.domain.LoginUser;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

public interface LoginUserUseCase {

    LoginUser loginUser(LoginUserCommand command);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class LoginUserCommand extends SelfValidation<LoginUserCommand> {
        @NotNull
        private final String email;

        @NotNull
        private final String password;

        public LoginUserCommand(String email, String password) {
            this.email = email;
            this.password = password;
            this.validateSelf();
        }

    }

}
