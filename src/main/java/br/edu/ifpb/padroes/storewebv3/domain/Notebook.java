package br.edu.ifpb.padroes.storewebv3.domain;

//Padrão de Visitor


public class Notebook extends Product {
	
	   @Override
	    public void accept(Visitor visitor) {
	        visitor.visit(this);
	    }

}
