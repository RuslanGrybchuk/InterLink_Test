package person;

import person.consciousness.Knowledge;


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

    public Student(String name, int knowledge) {                     // sets name and knowledge
        this.name = name;
        this.knowledge = knowledge;
    }

}
