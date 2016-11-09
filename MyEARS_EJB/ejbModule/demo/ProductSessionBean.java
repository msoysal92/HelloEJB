package demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import entities.*;
import java.util.*;
/**
 * Session Bean implementation class ProductSessionBean
 */
@Stateless(mappedName = "ejb/ProductSessionBean")
@LocalBean
public class ProductSessionBean implements ProductSessionBeanRemote, ProductSessionBeanLocal {

    /**
     * Default constructor. 
     */
    public ProductSessionBean() {
        
    }

	@Override
	public Product find() {
		return new Product("1", "Computer", 5000);
	}

	@Override
	public List<Product> findAll() {
		List<Product> list = new ArrayList<>();
		list.add(new Product("1", "Computer", 2000));
		list.add(new Product("2", "SmartPhone", 2500));
		list.add(new Product("3", "Notebook", 4000));
		return list;
	}

	
	
	

}
