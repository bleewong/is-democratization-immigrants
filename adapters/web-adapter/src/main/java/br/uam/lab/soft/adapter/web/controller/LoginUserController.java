package br.uam.lab.soft.adapter.web.controller;

import br.uam.lab.soft.adapter.web.mapper.LoginUserMapper;
import br.uam.lab.soft.adapter.web.model.LoginRequest;
import br.uam.lab.soft.adapter.web.model.LoginUserDTO;
import br.uam.lab.soft.application.usecase.LoginUserUseCase;
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
public class LoginUserController {

    private final LoginUserUseCase loginUserUseCase;

    @PostMapping(path = "/login")
    ResponseEntity<LoginUserDTO> LoginUser(@RequestBody LoginRequest loginRequest) {
        LoginUserUseCase.LoginUserCommand loginUserCommand =
                new LoginUserUseCase.LoginUserCommand(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                );
        return ResponseEntity.ok(LoginUserMapper.instance.mapToModel(
                loginUserUseCase.loginUser(loginUserCommand)));
    }

}
