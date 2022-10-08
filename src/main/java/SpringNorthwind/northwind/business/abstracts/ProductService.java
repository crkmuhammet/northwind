package SpringNorthwind.northwind.business.abstracts;

import SpringNorthwind.northwind.entities.concretes.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();
    Optional<Product> getProductById(int id);
}
