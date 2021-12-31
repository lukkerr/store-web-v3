package br.edu.ifpb.padroes.storewebv3.domain;

//Padrão de Visitor


public interface Visitor {
	
		void visit(Book book);
	    void visit(Notebook notebook);
	    void visit(Product product);

}
