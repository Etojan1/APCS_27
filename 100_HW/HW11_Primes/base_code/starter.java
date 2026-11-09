/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
 public static boolean checkPrime(int num) {
     int i = 2;
     if (num < 2) {
    return false;
     }
    while (i < num) {
      if (num % i == 0) {
         return false;
         }
         i++;
        }
        return true;
    }
    public static void printPrimes(int num) {
        int i = 2;
        while (i <= num) {
            if (checkPrime(i) == true) {
             System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number and we'll print out every prime until that number: ");
        int num = input.nextInt();
        printPrimes(num);
    }
}