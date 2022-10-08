package SpringNorthwind.northwind.business.concretes;

import SpringNorthwind.northwind.business.abstracts.ProductService;
import SpringNorthwind.northwind.core.utilities.results.DataResult;
import SpringNorthwind.northwind.core.utilities.results.SuccessDataResult;
import SpringNorthwind.northwind.core.utilities.results.SuccessResult;
import SpringNorthwind.northwind.entities.concretes.Product;
import org.springframework.stereotype.Service;
import SpringNorthwind.northwind.repository.abstracts.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public DataResult<List<Product>> getAll() {
        return
                new SuccessDataResult<List<Product>>(productRepository.findAll(),"Veriler Listelendi!");
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
