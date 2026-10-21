/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your base number?");
        int base = sc.nextInt();
        System.out.println("What is your exponent number?");
        int exponent = sc.nextInt();
        System.out.println("Your answer is: " + pow(base, exponent));
    }
    public static int pow(int base, int exponent) {
        int answer = 1;
        int count = 0;
        while (count < exponent) {
            answer = answer * base;
            count = count + 1;
        }
        return answer;
    }
}
        


		
	