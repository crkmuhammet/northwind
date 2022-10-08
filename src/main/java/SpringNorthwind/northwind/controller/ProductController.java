package SpringNorthwind.northwind.controller;

import SpringNorthwind.northwind.business.concretes.ProductManager;
import SpringNorthwind.northwind.core.utilities.results.DataResult;
import SpringNorthwind.northwind.core.utilities.results.Result;
import SpringNorthwind.northwind.entities.concretes.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public DataResult<List<Product>> getAll(){
        return
                productManager.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return
                productManager.getProductById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return
                productManager.add(product);
    }
}
