/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Dog name?");
        String name = sc.nextLine();
        Dog dog1 = new Dog(name);
        System.out.println("What age should " + name + " be?");
        int age = sc.nextInt();
        dog1.setAge(age);
        Dog dog2 = new Dog("Toto", "Cairn Terrier");
        System.out.println(dog1.getName() + " is a "  + dog1.getBreed() + " that is "+ dog1.getAge() + " years old!");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");
        boolean sleeping1 = dog1.isSleeping();

        if (sleeping1 == true) {
            System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!");
        } else {
            dog1.bark();
        }
      boolean sleeping2 = dog2.isSleeping();
      if (sleeping1 == false) {
      if (sleeping2 == true) {
        System.out.println(dog2.getName() + " wakes up from the bark!");
      } else {
        System.out.println(dog2.getName() + " hears " + dog1.getName() + " bark!");
     }
     dog2.bark();
     } else if (sleeping2 == true) {
     System.out.println(dog2.getName() + " is sleeping!");
     }else {
     System.out.println(dog2.getName() + " isn't sleeping!");
}
	}
}

	
