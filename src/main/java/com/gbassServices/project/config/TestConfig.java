package com.gbassServices.project.config;

import com.gbassServices.project.entities.User;
import com.gbassServices.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired //injeção de dependência
    private UserRepository userRepository;

    @Override
    //tudo o que for colocado dentro deste método será
    //executado quando a aplicaçao iniciar
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Ana Cecília", "anac@gmail.com","0987", "999882244");
        User u2 = new User(null, "Rebeca", "rebek@gmail.com", "1234", "9911223377");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
