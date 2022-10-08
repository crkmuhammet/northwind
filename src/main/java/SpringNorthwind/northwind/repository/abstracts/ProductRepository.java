package SpringNorthwind.northwind.repository.abstracts;

import SpringNorthwind.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
