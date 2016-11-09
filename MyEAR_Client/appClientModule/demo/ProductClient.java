package demo;

import java.util.List;

import javax.naming.InitialContext;

import entities.Product;
import util.Init;

public class ProductClient {

	public Product find() {
		try {
			InitialContext ic = Init.getInit();
			ProductSessionBeanRemote productSessionBeanRemote = (ProductSessionBeanRemote) ic
					.lookup("ejb/ProductSessionBean");
			return productSessionBeanRemote.find();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List<Product> findAll() {
		try {
			InitialContext ic = Init.getInit();
			ProductSessionBeanRemote productSessionBeanRemote = (ProductSessionBeanRemote) ic
					.lookup("ejb/ProductSessionBean");
			return productSessionBeanRemote.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
