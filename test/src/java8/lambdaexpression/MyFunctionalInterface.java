package java8.lambdaexpression;

/**
 * Functional Interface 
 * @author Minh Nguyen
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {
	
	void printMessage();
	
	default void printHello() {
		System.out.println("Hello - MyFunctionalInterface.");
	}
}

