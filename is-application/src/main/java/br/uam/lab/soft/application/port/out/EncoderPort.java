package br.uam.lab.soft.application.port.out;

public interface EncoderPort {

    String encode(CharSequence rawPassword);

    boolean matches(CharSequence rawPassword, String encodedPassword);

}
