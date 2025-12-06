package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(34000)
                    .quantity(12)
                    .build());

            productRepository.save(Product.builder()
                    .name("Phone")
                    .price(12000)
                    .quantity(25)
                    .build());

            productRepository.save(Product.builder()
                    .name("Tablet")
                    .price(18000)
                    .quantity(15)
                    .build());

            productRepository.save(Product.builder()
                    .name("Headphones")
                    .price(3000)
                    .quantity(40)
                    .build());
        };
    }
}
