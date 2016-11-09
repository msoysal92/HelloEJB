package demo;

import javax.ejb.Local;
import entities.*;
import java.util.*;

@Local
public interface ProductSessionBeanLocal {
	public Product find();
	public List<Product> findAll();
}
