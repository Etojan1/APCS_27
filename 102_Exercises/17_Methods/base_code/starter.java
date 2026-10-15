/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
public static int getDigitSum(int a){
		int first = a % 10;
		int reman = a / 10;
		int second = reman % 10;
		int reman2 = reman / 10;
		int third = reman2 % 10;
		int reman3 = reman2 / 10;
		int fourth = reman3 % 10;
		int fifth = reman3 / 10;
		int total = first + second + third + fourth + fifth;
		return total;

	  }       public static boolean isLeapYear(int y){
		if(y / 4 == 0){
			return true;
			
		}else{
			return false;
	  }
	  }
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
	 public static void printIfConsecutive(int a, int b, int c){
		if((a - b == 1 || a-b == -1) &&(a-c==2 || a-c==-2)){
			System.out.println("They are consecutive");
		}else{
			System.out.println("they are not consecutive");
		}
      
		

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive.
	
	 
	// Assume that the first number is always the smallest and the third number is always the largest.
		
	 }
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
