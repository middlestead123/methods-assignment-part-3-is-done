/**
 * 
 */
package methodsassignment;

import java.util.Scanner;

/**
 * @author a.middlestead
 *
 */
public class methodsassignmentpart3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		int usernumber;
		boolean isprime;

		System.out.println("please enter a number");
		usernumber = userInput.nextInt();

		isprime = checkprime(usernumber);
		
		if(isprime == true){
			System.out.println("this number is prime");
		} else {
			System.out.println("this number is not prime");
		}
		userInput.close();
	}

	public static boolean checkprime(int number) {

		boolean isprime = true;

		for (int i = 2; isprime && i <= Math.sqrt(number); i++) {

			/**
			 * 
			 * Check whether the remainder of userNumber divided by i equals 0.
			 * 
			 * If so, prime = false;
			 *
			 * 
			 * 
			 */
			
			if(number % i ==0){
				isprime = false;
			}
		}
		
		return isprime;
	}
}
