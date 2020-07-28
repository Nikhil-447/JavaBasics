
public class Calculator {

	/* Method for computing addition
	 * We use Wrapper Classes such as 'Integer' Instead of Primitive 'int'
	 * for the return type as well as for the arguments
	 * Primitive data types leads to impure OOP
	 * With Wrapper classes we can code Pure OOP*/

	/*Integer add method accepts 2 parameters*/
	  public  Integer add(Integer n1, Integer n2) {
		/* Same variables being modified in this non static method */
		Integer arg1=100,arg2=200;
		Integer result=arg1+arg2;
		return result;
	}

	  /*Integer add method accepts 3 parameters--- method overloading
	   * Compile Time Polymorphism */
	  public  Integer add(Integer n1, Integer n2, Integer n3) {

		  System.out.println("This is Method Overloading");

		  Integer arg1=100,arg2=200, arg3=400;

		  Integer result = arg1+arg2+arg3;
		  return result;
	  }


	/* main method */
	public static void main(String[] args) {

		Calculator cl = new Calculator();
		Integer arg1=10,arg2=20,arg3=30;
		System.out.println("Values before passing:"+arg1+"&"+arg2+"&"+arg3);

		/* Call By value
		 * It will call method Integer add()which accepts parameters*/
		Integer result = cl.add(arg1, arg2,arg3);


		/* Print statements to check if any changes done to value of variables
		 *  after function call*/
		System.out.println("Addition Result is:"+result);


		/* values of arg1 & arg2&arg3 remains same */
		System.out.println("Values After passing:"+arg1+"&"+arg2+"&"+arg3);


		}


}

