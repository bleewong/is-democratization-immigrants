package br.uam.lab.soft;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class InformationSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        log.info("EntryPoint do microserviço, "
                + "iniciando execuçao da aplicação");
        SpringApplication.run(InformationSystemApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("Argumentos recibidos na linha de comandos: {}",
                Arrays.toString(args));
    }

}
