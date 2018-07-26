package java8;
/**
 * A lambda expression is characterized (mô tả đặc điểm)
 * by the following syntax
 * ** parameter -> expression body
 * 
 * Important characteristics of a lambda expression
 * ** Optional Type Declaration: No need to declare the type
 * of a parameter. The compiler can inference the same from
 * the value of the parameter.
 * 
 * ** Optional Parenthesis around parameter: No need to declare a single
 * parameter in parenthesis. For multiple parameters, parentheses
 * are required.
 * 
 * ** Optional curly braces: No need to use curly braces in
 * expression body if the body contains a sigle statement.
 * 
 * ** Optional return keyword: The compiler automatically returns
 * the value if the body has a single expression to return the
 * value. Curly braces are required to indicate that
 * expression returns a value.
 * 
 * ** Lambda Expressions are used primarily to define inline implementation
 * of a functional interface,. ... an interface with a sigle method only.
 * We've used various types of lambda expressions to define the operation method
 * of MathOperation interface. also defined the implementation of
 * sayMessage of GreetingService.
 * ** Lambda Expression eliminates the need of anonymous class and gives
 * a very simple yet powerful functional programming capability to JAVA.
 * 
 * @author Minh Nguyen
 *
 */
public class LambdaExpressions {
	final static String hello = "Hello! ";
	public static void main(String[] args) {
		LambdaExpressions lambdaExpr = new LambdaExpressions();
		//With type declaration
		//(int a, int b) -> a + b; this means implement 
		//the method operation in MathOperation interface
		MathOperation plus = (int a, int b) -> a + b;
		System.out.println("Addition: " + lambdaExpr.operate(10, 5, plus));
		
		//Without Type declaration
		MathOperation minus = (a, b) -> a - b;
		System.out.println("Minus: " + lambdaExpr.operate(10, 5, minus));
	
		//With return statement along with curly braces
		MathOperation multiplication = (a, b) -> {return a * b;};
		System.out.println("Multiplication: " + lambdaExpr.operate(10, 5, multiplication));
	
		//Without return statement and without curly braces
		MathOperation division = (a, b) -> { 
		int c = a + b;
		return a / b * c; 
		};
		System.out.println("Division: " + division.operation(10, 5));
	
		//Without Parenthesis
		GreetingService g1 = message -> System.out.println("Hello" +
		message );
		g1.sayMessage(" Minh");
		g1.sayMessage(" NGAN");
		
		/**
		 * Using lambda expression, 
		 * you can refer to any final variable 
		 * or effectively final variable 
		 * (which is assigned only once). 
		 * Lambda expression throws a compilation error, 
		 * if a variable is assigned a value the second time.
		 */
		GreetingService g2 = message -> System.out.println(
				hello +
				message );
		g2.sayMessage("MINH");
	}

	interface MathOperation {
		int operation(int a, int b);
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}
	
	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
