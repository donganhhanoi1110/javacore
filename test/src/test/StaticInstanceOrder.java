package test;
/**
 * The order should be.
 * 
 * 1. static variable
 * 2. static block
 * 3. block code
 * 4. Constructor
 * @author Minh Nguyen
 *
 */
class StaticInstanceOrder{
        
		   static String s1 = sM1("a");
		   {
		      s1 = sM1("b");
		   }
		   static{
		      s1 = sM1("c");
		   }
		   StaticInstanceOrder() {
			   s1 = sM1("d");
		   }
		   
		   public static void main(String args[]){
			   StaticInstanceOrder it = new StaticInstanceOrder();
		   }
		   private static String sM1(String s){
		      System.out.println(s);  return s;
		   }
		}