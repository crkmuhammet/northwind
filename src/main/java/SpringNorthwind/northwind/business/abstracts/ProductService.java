package SpringNorthwind.northwind.business.abstracts;

import SpringNorthwind.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
