package br.uam.lab.soft.adapter.encoder;

import br.uam.lab.soft.application.port.out.EncoderPort;
import br.uam.lab.soft.common.Adapter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
@Adapter
public class PasswordEncoderAdapter implements EncoderPort {

    private final PasswordEncoder encoder;

    @Override
    public String encode(CharSequence rawPassword) {
        return encoder.encode(rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }

}
