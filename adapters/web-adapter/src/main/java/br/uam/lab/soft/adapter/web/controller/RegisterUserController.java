package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.model.RegisterRequest;
import br.uam.lab.soft.application.usecase.RegisterUserUseCase;
import br.uam.lab.soft.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class RegisterUserController {

    private final RegisterUserUseCase registerUserUseCase;

    @PostMapping
    ResponseEntity registerUser(@RequestBody RegisterRequest registerRequest) {
        RegisterUserUseCase.RegisterUserCommand registerUserCommand =
                new RegisterUserUseCase.RegisterUserCommand(registerRequest.getEmail(),
                        registerRequest.getPhoneNumber(),
                        registerRequest.getPassword()
                );

        registerUserUseCase.registerUser(registerUserCommand);

        return ResponseEntity.ok().build();
    }

}
