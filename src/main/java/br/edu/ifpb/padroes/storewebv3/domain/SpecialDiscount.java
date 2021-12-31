package br.edu.ifpb.padroes.storewebv3.domain;

//Padrão de Visitor


public class SpecialDiscount implements  Visitor {
	  private Double DISCOUNT_BOOK = 0.5;
	    private Double DISCOUNT_NOTEBOOK = 0.3;

	    @Override
	    public void visit(Book book) {
	        book.setPrice((long)(book.getPrice() * DISCOUNT_BOOK));
	    }

	    @Override
	    public void visit(Notebook Notebook) {
	    	Notebook.setPrice((long)(Notebook.getPrice() * DISCOUNT_NOTEBOOK));
	    }

	    @Override
	    public void visit(Product product) {}
 
}
