package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import br.edu.ifpb.padroes.storewebv3.config.StoreConfigurationProperties;
import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

//Facade 

public class OrderFacade {
	
	private final OrderService orderService = new OrderService(new StripeApi( new StoreConfigurationProperties()));;

    @Autowired
    private ProductRepository productRepository;

    public void createOrder(Order order) {
        orderService.setOrder(order);
        orderService.processPayment();
    }

    public List<Product> listProducts() {
        return productRepository.getProductList();
    }

}
