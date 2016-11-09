package demo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloSessionBean
 */
@Stateless(mappedName = "ejb/HelloSessionBean")
@LocalBean
public class HelloSessionBean implements HelloSessionBeanRemote, HelloSessionBeanLocal {

    /**
     * Default constructor. 
     */
    public HelloSessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String helloWorld() {
		return "hello world";
	}

	@Override
	public String hi(String fullName) {
		return "Hi " + fullName;
	}

}
