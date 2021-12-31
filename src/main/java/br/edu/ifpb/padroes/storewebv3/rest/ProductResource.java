package br.edu.ifpb.padroes.storewebv3.rest;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductResource {

    private final ProductRepository productRepository;

    public ProductResource(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/api/product")
    public List<Product> listProducts() {
        return productRepository.getProductList();
    }

    @PostMapping("/api/product")
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {
        if (productRepository.add(product)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/api/product")
    public ResponseEntity<Void> deleteProduct(@RequestBody Product product) {
        if( productRepository.remove(product) )
        	return ResponseEntity.ok().build();
        else
        	return ResponseEntity.badRequest().build();
    }


}
