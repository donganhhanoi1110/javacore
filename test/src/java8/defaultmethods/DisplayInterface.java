package java8.defaultmethods;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 *
 */
public interface DisplayInterface {
	void print(String message);
	
	// default method, we will provide method implementation
	default void hello() {
		System.out.println("Hello From DisplayInterface");
	}
}
