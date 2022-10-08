package SpringNorthwind.northwind.controller;

import SpringNorthwind.northwind.business.concretes.ProductManager;
import SpringNorthwind.northwind.entities.concretes.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductManager productManager;


    public ProductController(ProductManager productManager) {
        this.productManager = productManager;
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productManager.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productManager.getProductById(id);
    }
}
