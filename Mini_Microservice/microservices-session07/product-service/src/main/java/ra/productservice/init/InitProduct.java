package ra.productservice.init;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ra.productservice.entity.Product;
import ra.productservice.repository.ProductRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitProduct implements CommandLineRunner {
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.findAll().isEmpty()) {
            List<Product> products = List.of(
                    new Product(null,"Máy tính Dell core i7",10,18000000D),
                    new Product(null,"Máy tính Dell core i3",12,17000000D),
                    new Product(null,"Máy tính Dell core i5",15,16000000D),
                    new Product(null,"Máy tính HP core i7",20,19000000D)
            );
            productRepository.saveAll(products);
        }
    }
}
