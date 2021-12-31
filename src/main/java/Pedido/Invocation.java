package Pedido;

import java.util.LinkedList;
import java.util.List;

//Padrão Command


public class Invocation {

	  private List<Command> comm = new LinkedList<>();

      public void add(Command c) {
    	  comm.add(c);
      }

      public Command remove() {
          return comm.remove(0);
      }

      public boolean isEmpty() {
         return comm.isEmpty();
     }

     public void createOrders() {
          while (!isEmpty()) {
        	  Command Command = remove();
        	  Command.execute();
          }
     }

	
	
}
