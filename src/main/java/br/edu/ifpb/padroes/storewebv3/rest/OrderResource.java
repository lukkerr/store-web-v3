package br.edu.ifpb.padroes.storewebv3.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.service.OrderFacade;

//Facade

@RestController
public class OrderResource {

	
	 private final OrderFacade orderFacade;

	    public OrderResource() {
	        orderFacade = new OrderFacade();
	    }

	    @PostMapping("/")
	    public ResponseEntity<Void> createProduct(@RequestBody Order order) {
	        orderFacade.createOrder(order);
	        return ResponseEntity.ok().build();
	    }
	
}
