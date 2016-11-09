package demo;

import javax.ejb.Remote;
import entities.*;
import java.util.*;

@Remote
public interface ProductSessionBeanRemote {
	public Product find();
	public List<Product> findAll();
}
