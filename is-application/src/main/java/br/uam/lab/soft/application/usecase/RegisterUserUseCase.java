package br.uam.lab.soft.application.usecase;

import br.uam.lab.soft.common.SelfValidation;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

public interface RegisterUserUseCase {

    boolean registerUser(RegisterUserCommand registerUserCommand);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class RegisterUserCommand extends SelfValidation<RegisterUserCommand> {

        @NotNull
        private String email;

        @NotNull
        private String cellphone;

        @NotNull
        private String password;


        public RegisterUserCommand(String email, String cellphone, String password) {
            this.email = email;
            this.cellphone = cellphone;
            this.password = password;
            validateSelf();
        }

    }

}
