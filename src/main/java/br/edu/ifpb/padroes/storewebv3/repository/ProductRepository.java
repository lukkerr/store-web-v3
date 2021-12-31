package br.edu.ifpb.padroes.storewebv3.repository;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public boolean add(Product element) {
    	Product productOfList = this.getProductInList(element);
    	if(productOfList == null)
            return productList.add(element);
    	else
    		return false;
    }
    
    public Product getProductInList(Product product) {   	
    	if(product.getId() == null)
    		return null;
    	
    	List<Product> productsById = ((Stream<Product>) productList.stream().filter(
    			p -> p.getId() == product.getId())).collect(Collectors.toList());
    	if(productsById.size() > 0)
    		return productsById.get(0);
    	else
    		return null;
    }

    public boolean remove(Product product) {
    	Product productOfList = this.getProductInList(product);
    	if(productOfList != null)
    		return productList.remove(productOfList);
    	else
    		return false;
    	
    }

}
