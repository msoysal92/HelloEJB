package demo;

import javax.naming.InitialContext;

import util.Init;

public class HelloWorldClient {
	
	public String hello() {
		try {
			InitialContext ic = Init.getInit();
			HelloSessionBeanRemote helloSessionBeanRemote = (HelloSessionBeanRemote) ic.lookup("ejb/HelloSessionBean");
			return helloSessionBeanRemote.helloWorld();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public String hi(String fullName) {
		try {
			InitialContext ic = Init.getInit();
			HelloSessionBeanRemote helloSessionBeanRemote = (HelloSessionBeanRemote) ic.lookup("ejb/HelloSessionBean");
			return helloSessionBeanRemote.hi(fullName);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
