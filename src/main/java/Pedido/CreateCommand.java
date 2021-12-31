package Pedido;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.service.OrderFacade;

//Padrão Command


@Component
@Scope("prototype")
public class CreateCommand implements Command {

	    private Order order;

	    private OrderFacade orderFacade;

	    public void CreateOrder(OrderFacade orderFacade){
	        this.orderFacade = orderFacade;
	    }

	    public void execute() {
	        this.orderFacade.createOrder(this.order);
	    }

	    public void serOrder(Order order) {
	        this.order = order;
	    }

}
