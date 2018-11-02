package person;
import person.consciousness.Knowledge;

import java.util.Scanner;

public class Student {

    private int knowledge;

    public int getKnowledge(){
        return knowledge;
    }

    private String name;

    public String getName(){
        return name;
    }

    public Student() {                                              // used in Internship class for storing temporal objects
    }

    public Student(String name) {
        this.name = name;                                           // sets name and knowledge
        setKnowledge();
    }

    public void setKnowledge() {
        System.out.println("Enter the knowledge level");
        Scanner scan = new Scanner(System.in);
        Knowledge instance = new Knowledge(scan.nextInt());         // invokes Knowledge class constructor with a scanned parameter
        this.knowledge = instance.getLevel();
    }
}