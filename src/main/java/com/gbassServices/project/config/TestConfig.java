package com.gbassServices.project.config;
import com.gbassServices.project.entities.Order;
import com.gbassServices.project.entities.User;
import com.gbassServices.project.repositories.OrderRepository;
import com.gbassServices.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired //injeção de dependência
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    //tudo o que for colocado dentro deste método será
    //executado quando a aplicaçao iniciar
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Ana Cecília", "anac@gmail.com","0987", "999882244");
        User u2 = new User(null, "Rebeca", "rebek@gmail.com", "1234", "9911223377");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:55:09Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-06-23T18:55:06Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-06-26T12:55:03Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
