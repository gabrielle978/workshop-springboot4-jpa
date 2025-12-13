package com.gbassServices.project.config;
import com.gbassServices.project.entities.Category;
import com.gbassServices.project.entities.Order;
import com.gbassServices.project.entities.Product;
import com.gbassServices.project.entities.User;
import com.gbassServices.project.enums.OrderStatus;
import com.gbassServices.project.repositories.CategoryRepository;
import com.gbassServices.project.repositories.OrderRepository;
import com.gbassServices.project.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    //tudo o que for colocado dentro deste método será
    //executado quando a aplicaçao iniciar
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Ana Cecília", "anac@gmail.com","0987", "999882244");
        User u2 = new User(null, "Rebeca", "rebek@gmail.com", "1234", "9911223377");

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Health and Care");
        Category cat3 = new Category(null, "Toys");

        Product prod1 = new Product(null, "SSD", "SSD NVME 1TB", 500.00,"https://www.gigabyte.com/br/SSD/GIGABYTE-NVMe-SSD-1TB");
        Product prod2 = new Product(null, "Pista Hotwheels", "Pista Hotwheels ataque do tubarão", 360.00,"https://www.rihappy.com.br/hot-wheels-conjunto-city-robo-tubarao-gjl12-1001775548/p?srsltid=AfmBOopZ2yZq7HGod85tCSIqy1MYud2pIF1TBo8Lq4IaEhodz4L8LRfV");
        Product prod3 = new Product(null, "Whey 100%", "Whey 100% Black Skull 900g", 99.00,"https://www.amazon.com.br/Black-Skull-Caveira-Original-baunilha/dp/B09T874WX1");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:55:09Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-06-23T18:55:06Z"), u2, OrderStatus.DELIVERED);
        Order o3 = new Order(null, Instant.parse("2019-06-26T12:55:03Z"), u1, OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(prod1,prod2,prod3));
    }
}
