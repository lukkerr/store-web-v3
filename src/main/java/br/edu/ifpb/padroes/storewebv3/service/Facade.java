package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;

public class Facade {
	
	private final ProductRepository productRepository;

    public Facade(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listProducts() {
        return productRepository.getProductList();
    }

}
