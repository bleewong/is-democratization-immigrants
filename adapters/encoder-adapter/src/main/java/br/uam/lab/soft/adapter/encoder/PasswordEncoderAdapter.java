package br.uam.lab.soft.adapter.encoder;

import br.uam.lab.soft.application.port.out.EncoderPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PasswordEncoder implements EncoderPort {



    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
