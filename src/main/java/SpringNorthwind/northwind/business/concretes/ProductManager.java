package SpringNorthwind.northwind.business.concretes;

import SpringNorthwind.northwind.business.abstracts.ProductService;
import SpringNorthwind.northwind.entities.concretes.Product;
import org.springframework.stereotype.Service;
import SpringNorthwind.northwind.repository.abstracts.ProductRepository;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
