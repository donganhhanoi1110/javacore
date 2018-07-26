package java8;

/**
 * 
 * @author Minh Nguyen
 *
 */
public class AnonymousClass {
	
	public static void main(String[] args) {
		//#1 Create Anonymous class by abstract class
		AnonymousInnerOfClass innerClass = new AnonymousInnerOfClass() {
			//
			String message = "Print Me";
			
			//Instance initializer block
			{
				System.out.println("#1 Anonymous Inner Of Class - Instance Initializer Block.");
			}
			@Override
			public void printMessageClass() {
				
				System.out.println("#1 Anonymous Inner Of Class");
				printMe(message);
				MyClass myClass = new MyClass();
				myClass.printMyLocalClass();
			}
			// Method
			void printMe(String str) {
				System.out.println("#1 Anonymous Inner Of Class - " + str);
			}
			// Local 
			class MyClass{
				void printMyLocalClass() {
					System.out.println("#1 Anonymous Inner Of Class - Print My Local Class");
				}
			}
		};
		
		//Run innerClass
		innerClass.printMessageClass();
	}
}

abstract class AnonymousInnerOfClass {
	public abstract void printMessageClass();
}

interface AnonymousInnerOfInterface {
	public void printMessageInterface();
}
