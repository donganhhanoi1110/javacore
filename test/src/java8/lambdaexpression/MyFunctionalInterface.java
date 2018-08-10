package java8.lambdaexpression;

/**
 * Functional Interface 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
@FunctionalInterface
public interface MyFunctionalInterface {
	
	void printMessage();
	
	default void printHello() {
		System.out.println("Hello - MyFunctionalInterface.");
	}
}

