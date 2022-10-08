package SpringNorthwind.northwind.business.abstracts;

import SpringNorthwind.northwind.core.utilities.results.DataResult;
import SpringNorthwind.northwind.core.utilities.results.Result;
import SpringNorthwind.northwind.entities.concretes.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    DataResult<List<Product>> getAll();
    Result add(Product product);
    Optional<Product> getProductById(int id);
}
