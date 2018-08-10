package java8.lambdaexpression;
/**
 * 
 * Important characteristics of a lambda expression
 * ** Optional Type Declaration
 * 
 * ** Optional Parenthesis around parameter
 * 
 * ** Optional curly braces
 * 
 * ** Optional return keyword
 *
 * ** Lambda Expression eliminates the need of anonymous class and gives
 * a very simple yet powerful functional programming capability to JAVA.
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class LambdaExpressionExp1 {

	public static void main(String[] args) {
	  // Create a new Thread in old way
	  new Thread(new Runnable() {

      @Override
      public void run() {
         System.out.println("Runnable run() in Thread without Lambda");
      }
	    
	  }).start();
	  
	  new Thread(() -> System.out.println("run() method with Lambda")).start();
	}
}
