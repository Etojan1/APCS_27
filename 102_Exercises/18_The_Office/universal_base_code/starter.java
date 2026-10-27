/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee DS = new Employee(1987, "Dwight", "Schrute", 4416.66);

		Employee JH = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee PB = new Employee(2011, "Pam", "Beesly", 2250);
		Employee AP = new Employee(2001, "Alex", "Payasam", 2250);
		DS.employeeToString();
		JH.employeeToString();
		PB.employeeToString();
		AP.employeeToString();

		DS.raiseSalary(45);
		JH.raiseSalary(20);
		PB.raiseSalary(35);
		AP.raiseSalary(0);
	     
		 System.out.println(DS.getSalary());
		 System.out.println(JH.getSalary());
		System.out.println(PB.getSalary());
		System.out.println(AP.getSalary());

		 System.out.println(DS.getAnnualSalary());
		 System.out.println(JH.getAnnualSalary());
		 System.out.println(PB.getAnnualSalary());
		 System.out.println(AP.getAnnualSalary());




	}
}
