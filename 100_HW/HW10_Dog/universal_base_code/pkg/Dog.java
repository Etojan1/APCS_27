package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
    private String name;
    private int age;
    private String breed;

    public Dog() {
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }
    
    public Dog(String n) {
        name = n;
        age = 1;
        breed = "dog dog";
    }

    public Dog(String n, String b) {
        name = n;
        breed = b;
        age = 1;
    }
    
    public Dog(String n, int a) {
        name = n;
        age = a;
        breed = "dog dog";
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isSleeping() {
        int random = (int)(Math.random() * 2);

        if (random == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public void bark() {
        System.out.println(name + " barks!");
    }
}
	