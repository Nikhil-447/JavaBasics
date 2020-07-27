/* package nikhil.JavaTrial; */

/* Main Class 
 *class keyword is used to declare a class
*/
public class HelloWorld {
	
/* Instance Variable declaration */
	int Num  = 10;
	
/* static Variable Declaration */
	static int val = 20;
	
/* Non Static Method Declaration */
	 void nonStaticTest() {
		System.out.println("Non Static Method");
	}

/* Static Method Declaration */
	 static void staticTest() {
		System.out.println("Static Method");
	}
	
/* main Method
 * main represents the start of the program
 * Main Function always static
 * public keyword is an access modifier which represents visibility
 * public means its visible to all
 * Static methods doesn't need any objects to be invoked
 * void is return type for a method which doesn't return any value
 * String[] args is used for command line arguments*/
	public static void main(String[] args) {
		
		/* Local Variable Declaration */
		String Animal = "Lion";
		
		System.out.println("Hello Nikhil");
		System.out.println("Welcome to the JAVA WORLD");
		
		/* Creating Instance of class Hello 
		 * Object h1
		 */
		HelloWorld h1 = new HelloWorld();
		
		/* Accessing Instance variable through object h1 */
		System.out.println("Instance value Stored in Class is:"+h1.Num);

		/* accessing static variable without object*/
		System.out.println("Static value stored in class is:"+val);

		/* accessing local variable*/
		System.out.println("Local Variable is:"+Animal);
		
		/* accessing non static method through object h1 */
		h1.nonStaticTest();
		
		/* accessing the static method*/
		staticTest();
		
	/* End of main method*/	
	}

/* end of class */
}
