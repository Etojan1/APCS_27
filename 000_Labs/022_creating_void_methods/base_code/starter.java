/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String a = sc.nextLine();
        System.out.println("Write another sentence:");
        String b = sc.nextLine();
        toString(a);
        toStringCombined(a, b);
    }
    public static void toString(String a) {
        System.out.println(a);
    }
    public static void toStringCombined(String a, String b) {
        System.out.println(a + " " + b);
    }
}

 


		
	