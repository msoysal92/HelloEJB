package main;
import demo.*;
import entities.Product;
public class Main {

	public static void main(String[] args) {	
		try {
			HelloWorldClient helloWorldClient = new HelloWorldClient();
			System.out.println(helloWorldClient.hello());
			System.out.println(helloWorldClient.hi("Muhammet Soysal\n\n\n"));
			
			ProductClient productClient = new ProductClient();
			
			System.out.println("Product :\n" + productClient.find());
			System.out.println("Products : ");
			for(Product product : productClient.findAll()) {
				System.out.println(product);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
	}

}
