package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
			// Who's the arch nemesis of this Spiderman?
	 public String theActor;
	 public int theAge;
	 public String theVilain;
	  public String actor;
    public int age;
    public String villain;
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
     //global variables
	

	 //Constructors
    public Spiderman(){
		actor = "unknown";
	    age = 0;
		villain = "unknown";
	}
   public Spiderman(String theActor){
	actor = theActor;
	age= 0;
	villain = "unknown";
   }
   public Spiderman(String theActor, int theAge){
	actor = theActor;
	age = theAge;
	villain = "unknown";
   }
   public Spiderman(String theActor, int theAge, String theVillain){
	actor = theActor;
	age = theAge;
	villain = theVillain;
   }
   public Spiderman(int theAge){
	actor = "unknown";
	age = theAge;
	villain = "unknown";
   }
   //Methods
public String getActor(){
    return actor;
}
public int getAge(){
    return age;
}
public String getVillian(){
    return villain;
}
public void setAge(int age){
	age = theAge;
   }
    public void setActor(String actor){
	actor = theActor;
   }
    public void setVillian(String theVillain){
	villain = theVillain;
   }
  

	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
