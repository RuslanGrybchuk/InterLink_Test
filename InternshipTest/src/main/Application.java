package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;



public class Application {

    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));

        //getStudentNames(argument); // add students from a file or a DB

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        internship.getStudents();   // prints out names of internship students
    }

    /*
    public void getStudents(argument){
						// a method to get student`s data from a list of students in a file or a database
						// use a loop to add a couple of students at once
        university.addStudent(new Student(argument));
    }
    */
}



