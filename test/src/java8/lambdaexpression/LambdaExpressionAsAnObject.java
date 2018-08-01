package java8.lambdaexpression;

/**
 * 
 * @author Minh Nguyen
 *
 */
public class LambdaExpressionAsAnObject {
	final static String HELLO = "Hello! ";
	
	public static void main(String[] args) {
		LambdaExpressionAsAnObject lambdaExpr = new LambdaExpressionAsAnObject();

		//#1 Call direct Method
		GreetingMessage greeting1 = message -> System.out.println("Hello" +
		message );
		greeting1.printMessage(" MINH");
		
		//#2 Pass Lambda Expression in method argument
		//you can refer to any final variable 
		GreetingMessage greeting2 = message -> System.out.println(
				HELLO + 
				message );
		lambdaExpr.print("MINH", greeting2);
	}

	interface GreetingMessage {
		void printMessage(String message);
	}
	
	private void print(String message, GreetingMessage greeting) {
		greeting.printMessage(message);
	}
}
